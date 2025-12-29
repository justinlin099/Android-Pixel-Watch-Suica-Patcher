package com.justinlin099.PWSuicaPatcher

import de.robv.android.xposed.IXposedHookLoadPackage
import de.robv.android.xposed.XC_MethodHook
import de.robv.android.xposed.XC_MethodReplacement
import de.robv.android.xposed.XposedBridge
import de.robv.android.xposed.XposedHelpers
import de.robv.android.xposed.callbacks.XC_LoadPackage

class MainHook : IXposedHookLoadPackage {

    private val CUSTOM_ICCID = "8981012345678901230"
    private val CUSTOM_MCC_MNC = "44010"
    private val CUSTOM_OPERATOR_NAME = "NTT DOCOMO"

    override fun handleLoadPackage(lpparam: XC_LoadPackage.LoadPackageParam) {
        val targetPackages = listOf(
            "android",
            "com.android.phone",
            "com.google.android.gms",
            "com.google.android.gsf"
        )
        
        val shouldHook = targetPackages.contains(lpparam.packageName) || lpparam.packageName.contains("dialer")

        if (shouldHook) {
            XposedBridge.log("PW_SUICA_PATCHER: Applying SIM Spoofer to package: ${lpparam.packageName}")
            hookTelephonyInfo(lpparam)
        }
    }

    private fun hookTelephonyInfo(lpparam: XC_LoadPackage.LoadPackageParam) {
        val classLoader = lpparam.classLoader

        // Hook TelephonyManager
        try {
            val telephonyManagerClass = XposedHelpers.findClass("android.telephony.TelephonyManager", classLoader)
            XposedBridge.hookAllMethods(telephonyManagerClass, "getSimOperator", XC_MethodReplacement.returnConstant(CUSTOM_MCC_MNC))
            XposedBridge.hookAllMethods(telephonyManagerClass, "getNetworkOperator", XC_MethodReplacement.returnConstant(CUSTOM_MCC_MNC))
            XposedBridge.hookAllMethods(telephonyManagerClass, "getSimOperatorName", XC_MethodReplacement.returnConstant(CUSTOM_OPERATOR_NAME))
            XposedBridge.hookAllMethods(telephonyManagerClass, "getSimSerialNumber", XC_MethodReplacement.returnConstant(CUSTOM_ICCID))
            XposedBridge.hookAllMethods(telephonyManagerClass, "getIccId", XC_MethodReplacement.returnConstant(CUSTOM_ICCID))
        } catch (e: Throwable) {
            XposedBridge.log("PW_SUICA_PATCHER: Failed to hook TelephonyManager in ${lpparam.packageName}: $e")
        }

        // Hook SubscriptionInfo
        try {
            val subscriptionInfoClass = XposedHelpers.findClass("android.telephony.SubscriptionInfo", classLoader)
            XposedHelpers.findAndHookMethod(subscriptionInfoClass, "getMccString", object : XC_MethodHook() {
                override fun beforeHookedMethod(param: MethodHookParam) {
                    param.result = CUSTOM_MCC_MNC.substring(0, 3)
                }
            })
            XposedHelpers.findAndHookMethod(subscriptionInfoClass, "getMncString", object : XC_MethodHook() {
                override fun beforeHookedMethod(param: MethodHookParam) {
                    param.result = CUSTOM_MCC_MNC.substring(3)
                }
            })
            XposedBridge.hookAllMethods(subscriptionInfoClass, "getIccId", XC_MethodReplacement.returnConstant(CUSTOM_ICCID))
        } catch (e: Throwable) {
            XposedBridge.log("PW_SUICA_PATCHER: Failed to hook SubscriptionInfo in ${lpparam.packageName}: $e")
        }
        
        // Hook UiccCardInfo
        try {
            val uiccCardInfoClass = XposedHelpers.findClass("android.telephony.UiccCardInfo", classLoader)
            XposedBridge.hookAllMethods(uiccCardInfoClass, "getIccId", XC_MethodReplacement.returnConstant(CUSTOM_ICCID))
        } catch (e: Throwable) {
            XposedBridge.log("PW_SUICA_PATCHER: Could not hook UiccCardInfo in ${lpparam.packageName}: $e")
        }
    }
}
