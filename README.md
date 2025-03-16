# 📺 Neko AndroidTV

**Neko AndroidTV** is an app for Android TV and Android phones that lets you watch content together with friends! 🎥🍿 It opens up a WebView for [https://screen.1tushar.com](https://screen.1tushar.com), so you can sync up and enjoy shared viewing experiences. 

---

## 🚀 Features

✅ Supports Android TV and Android phones 📱📺  
✅ WebView-powered streaming 🎬  
✅ Watch together with friends 👥  
✅ Easy installation via ADB or direct APK install 🔧  

---

## 📥 Installation Guide

### 📺 Install on Android TV
To install on your Android TV, follow these steps:

1. **Enable Developer Mode & Debugging:**
   - Go to **Settings** → **Device Preferences** → **About**
   - Scroll to **Build** and click it **7 times** to enable **Developer Mode** 🔑
   - Go back to **Settings** → **Developer Options** → Enable **Debugging** and **ADB Debugging** 🛠️

2. **Connect to TV via ADB:**
   - Find your TV’s **IP Address**: 
     - Go to **Settings** → **Network & Internet** → Check the connected Wi-Fi details 🌐
   - On your PC, run:  
     ```sh
     adb connect <TV_IP_Address>:5555
     ```
     (Replace `<TV_IP_Address>` with your actual TV IP)

3. **Install the APK:**
   - Download the latest APK from [Releases](https://github.com/yourrepo/neko_androidtv/releases) ⬇️
   - Run:
     ```sh
     adb install neko_androidtv.apk
     ```

4. **Launch the App:**
   - Open **Neko AndroidTV** from your TV’s app list 🎉

---

### 📱 Install on Android Phone
Installing on your phone is even easier!

1. **Enable Unknown Sources:**
   - Go to **Settings** → **Security** → Enable **Unknown Sources** 📲

2. **Download & Install:**
   - 📥 Download the APK from [Releases](https://github.com/yourrepo/neko_androidtv/releases)
   - Open the APK and follow the installer prompts ✅

**Or use ADB:**
   ```sh
   adb install neko_androidtv.apk
   ```

3. **Launch the App & Start Watching!** 🎬

---

## 🌟 Contribute & Support
This is an open-source project! Feel free to contribute, submit issues, or suggest features. 

👾 GitHub: [https://github.com/mr6874000/neko_androidtv.git](https://github.com/mr6874000/neko_androidtv.git)  
🐛 Found a bug? Open an issue!  
✨ Enjoying the app? Give it a ⭐!

---

🎥 **Happy Watching!** 🍿