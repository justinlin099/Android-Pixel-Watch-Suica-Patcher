<p align="left">
  <a href="./README.md">
    <img src="https://img.shields.io/badge/lang-English-blue.svg" alt="English">
  </a>
  <a href="./README.zh-Hant.md">
    <img src="https://img.shields.io/badge/lang-繁體中文-green.svg" alt="Traditional Chinese">
  </a>
  <a href="./README.ja.md">
    <img src="https://img.shields.io/badge/lang-日本語-red.svg" alt="Japanese">
  </a>
</p>

<img src="https://github.com/user-attachments/assets/14b08cf8-898a-4dcc-a354-392f04b7d279" width="100%" alt="PWS Patcher Banner">

# Pixel Watch Suica Patcher

**A LSposed Module to Enable Suica / Pasmo Capability on non-Japanese Pixel Watch.**

![Android](https://img.shields.io/badge/Android-Rooted-green?logo=android)
![LSPosed](https://img.shields.io/badge/LSPosed-Required-blue)
![License](https://img.shields.io/badge/License-GPLv3-blue)

<p align="left">
  <img src="https://github.com/user-attachments/assets/2f5ef395-fefb-4a5a-8812-0fc1cded411b" width="32%" />
  <img src="https://github.com/user-attachments/assets/c82db3d9-a140-410d-bf8d-e78628126d24" width="32%" />
  <img src="https://github.com/user-attachments/assets/441aea51-82af-48fe-b48d-13b67535501d" width="32%" />
</p>

## Introduction
This is an LSPosed module that spoofs GMS services on your **connected Android phone** to enable Suica or Pasmo support on non-Japanese Pixel Watches.

## ✨ Features
* **No Japanese SIM Card Required:** Bypass the carrier check.
* **Software Unlocking:** Works by patching the GMS (Google Play Services) on your phone.
* **Easy Setup:** No need to root the watch itself, only the phone needs to be rooted.

## ⚠️ Prerequisites
* An **Android Phone** with:
    * **Root Access** (Magisk / KernelSU / APatch)
    * **LSPosed Framework** installed and active.
* A non-Japanese Pixel Watch paired with the phone.
* (Optional) VPN or GPS Mocking app.

## 📥 Installation
1.  Download the latest APK from the [Releases](../../releases) page.
2.  Install the APK on your **Phone**.
3.  Open the **LSPosed Manager** notification.
4.  Enable the **PW Suica Patcher** module.
5.  Ensure the recommended apps (Google Play Services) are checked in the scope.
6.  **Reboot your Phone**.

## 🚀 How to Use
Since Google performs region checks (IP and GPS) during the initial card creation process:

1.  **Spoof Location (Crucial for first setup):**
    * Connect your phone to a **VPN to Japan**.
    * (Recommended) Use a GPS Spoofing app to set your phone's location to Japan.
2.  Open the **Google Pixel Watch App** on your phone.
3.  Go to **Google Wallet** -> **Add to Watch** -> **Transit Pass**.
4.  You should now see the options for **Suica** or **Pasmo**.
5.  Follow the instructions to activate the card.

> **Note:** Once the card is added to the watch, you do not need the VPN or this module to use the card for daily commuting.

## ⚠️ Disclaimer
* This module involves system modification and requires Root access.
* The author is not responsible for any damage to your device or Google account bans.
* Use at your own risk.

---
<p align="center">Made with ❤️ by JustinLin099</p>
