1. Install JDK and Set Environment Variables 

The latest version available in late 2025 is JDK 25. 

Download: Visit the Oracle Java Downloads page and download the x64 Installer for your operating system (e.g., jdk-25_windows-x64_bin.exe).

Install: Run the installer and complete the wizard. Note the installation path (typically C:\Program Files\Java\jdk-25).
Set Environment Variables (Windows):
Search for "Edit the system environment variables" in the Start menu.

Click Environment Variables.
Under System Variables, click New and create JAVA_HOME with the value of your installation path (e.g., C:\Program Files\Java\jdk-25).
Find the Path variable, click Edit, then New, and add %JAVA_HOME%\bin.
Click OK to save all windows.

Verify: Open a new Command Prompt and type java --version. You should see "java 25.0.x". 
