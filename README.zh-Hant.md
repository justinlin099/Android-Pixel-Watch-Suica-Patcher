<img src="https://github.com/user-attachments/assets/14b08cf8-898a-4dcc-a354-392f04b7d279" width="100%" alt="PWS Patcher Banner">

<p align="center">
  <a href="./README.md">
    <img src="https://img.shields.io/badge/lang-English-blue.svg" alt="English">
  </a>
  <a href="./README_zh-TW.md">
    <img src="https://img.shields.io/badge/lang-繁體中文-green.svg" alt="Traditional Chinese">
  </a>
  <a href="./README_ja.md">
    <img src="https://img.shields.io/badge/lang-日本語-red.svg" alt="Japanese">
  </a>
</p>

# Pixel Watch Suica Patcher

**讓非日版的 Pixel Watch 也能開通並使用 Suica (西瓜卡) 或 Pasmo 的 LSposed 模組。**

![Android](https://img.shields.io/badge/Android-Rooted-green?logo=android)
![LSPosed](https://img.shields.io/badge/LSPosed-Required-blue)
![License](https://img.shields.io/badge/License-GPLv3-blue)

<p align="left">
  <img src="https://github.com/user-attachments/assets/2f5ef395-fefb-4a5a-8812-0fc1cded411b" width="32%" />
  <img src="https://github.com/user-attachments/assets/c82db3d9-a140-410d-bf8d-e78628126d24" width="32%" />
  <img src="https://github.com/user-attachments/assets/441aea51-82af-48fe-b48d-13b67535501d" width="32%" />
</p>

## 簡介
這是一個 LSPosed 模組，透過偽裝 **已連線手機** 上的 GMS 服務，讓非日版的 Pixel Watch 也能開通並使用 Suica (西瓜卡) 或 Pasmo。

## ✨ 特色
* **免日版 SIM 卡**：不需要購買日本 SIM 卡也能繞過電信商檢查。
* **無需 Root 手錶**：只需要手機有 Root 即可，手錶端保持原廠狀態亦可使用。
* **軟體解鎖**：直接在手機端解除 Google 錢包的地區限制。

## ⚠️ 事前準備
* 一支 **Android 手機**，且具備：
    * **Root 權限** (Magisk / KernelSU / APatch)。
    * **LSPosed 框架** (Zygisk 版)。
* 已配對的手機與非日版 Pixel Watch。
* (必要時) VPN 或假定位軟體。

## 📥 安裝步驟
1.  前往 [Releases](../../releases) 下載最新的 APK 檔案。
2.  將 APK 安裝在您的 **手機** 上（不是手錶）。
3.  開啟 **LSPosed Manager**，啟用 **PWS Patcher** 模組。
4.  確認作用範圍已勾選 Google Play 服務 (GMS) 或 Pixel Watch App。
5.  **重新啟動手機**。

## 🚀 使用方法
Google 在初次發卡時會嚴格檢查 IP 與地理位置，請依照以下步驟操作：

1.  **偽裝日本環境 (初次發卡必須)**：
    * 將手機連線至 **日本 VPN**。
    * (建議) 使用假定位 App (如 GPS JoyStick) 將手機定位改為 **日本東京**。
2.  開啟手機上的 **Google Pixel Watch App**。
3.  進入 **Google 錢包** -> **新增至手錶** -> **交通卡**。
4.  您應該能看到 **Suica** 或 **Pasmo** 的選項。
5.  依照指示完成發卡與儲值。

> **提示**：一旦卡片成功新增至手錶晶片後，日常搭車感應 **不需要** 開啟 VPN 或手機網路，NFC 可完全離線運作。

## ⚠️ 免責聲明
* 本模組涉及系統深層修改與 Root 權限。
* 作者不對任何設備損壞、Google 帳號封鎖或金額損失負責。
* 請自行承擔使用風險 (Use at your own risk)。

---
<p align="center">Made with ❤️ for Pixel Watch Users</p>
