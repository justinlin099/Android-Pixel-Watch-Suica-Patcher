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

**海外版 Pixel Watch で Suica / Pasmo を有効化する LSposed モジュール。**

![Android](https://img.shields.io/badge/Android-Rooted-green?logo=android)
![LSPosed](https://img.shields.io/badge/LSPosed-Required-blue)
![License](https://img.shields.io/badge/License-GPLv3-blue)

<p align="left">
  <img src="https://github.com/user-attachments/assets/2f5ef395-fefb-4a5a-8812-0fc1cded411b" width="32%" />
  <img src="https://github.com/user-attachments/assets/c82db3d9-a140-410d-bf8d-e78628126d24" width="32%" />
  <img src="https://github.com/user-attachments/assets/441aea51-82af-48fe-b48d-13b67535501d" width="32%" />
</p>

## 概要
これは、**接続されたAndroidスマートフォン**上のGMSサービスを偽装し、海外版（非日本版）のPixel WatchでSuicaやPasmoのサポートを有効化するLSPosedモジュールです。

## ✨ 特徴
* **日本のSIMカード不要**：キャリアチェックを回避します。
* **ソフトウェア解錠**：スマートフォンのGMS（Google Play開発者サービス）にパッチを適用して動作します。
* **簡単セットアップ**：Watch自体のRoot化は不要です。スマートフォンのRoot化のみで利用可能です。

## ⚠️ 要件
* 以下の環境を持つ **Android スマートフォン**:
    * **Root権限** (Magisk / KernelSU / APatch)
    * **LSPosed Framework** がインストールされ、有効になっていること。
* スマートフォンとペアリングされた海外版 Pixel Watch。
* (任意) VPN または GPS偽装アプリ。

## 📥 インストール
1.  [Releases](../../releases) ページから最新のAPKをダウンロードします。
2.  **スマートフォン**にAPKをインストールします。
3.  **LSPosed Manager**の通知を開きます。
4.  **PW Suica Patcher** モジュールを有効にします。
5.  推奨されるアプリ（Google Play開発者サービス）がスコープに含まれていることを確認してください。
6.  **スマートフォンを再起動**します。

## 🚀 使い方
カードの初回作成時にGoogleによる地域チェック（IPおよびGPS）が行われるため、以下の手順が必要になる場合があります：

1.  **位置情報の偽装 (必要な場合)**:
    * スマートフォンを **日本のVPN** に接続します。
    * (推奨) GPS偽装アプリを使用して、スマートフォンの現在地を **日本** に設定します。
2.  スマートフォンの **Google Pixel Watch アプリ** を開きます。
3.  **Google ウォレット** -> **ウォッチに追加** -> **交通系ICカード** を選択します。
4.  **Suica** または **Pasmo** の選択肢が表示されるはずです。
5.  画面の指示に従って有効化してください。

> **注意**: 一度カードをWatchに追加すれば、日常の通勤・通学利用にVPNや本モジュールは不要です。

## ⚠️ 免責事項
* 本モジュールはシステム変更を伴い、Root権限が必要です。
* 作者は、デバイスの破損やGoogleアカウントの停止等について一切の責任を負いません。
* 使用は自己責任で行ってください。

---
<p align="center">Made with ❤️ by JustinLin099</p>
