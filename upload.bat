@echo off
title CSC241 GitHub Upload

echo.
echo ========================================
echo       CSC241 - GitHub Upload
echo ========================================
echo.

echo [1/4] Compiling Java files...
javac *.java

if errorlevel 1 (
    echo.
    echo ERROR: Java compilation failed.
    echo Fix your code and try again.
    echo.
    pause
    exit /b 1
)

echo.
echo [2/4] Adding files to Git...
git add .

echo.
echo [3/4] Creating commit...
git commit -m "Updated CSC241 OOP lab work"

echo.
echo [4/4] Pushing to GitHub...
git push

echo.
echo ========================================
echo          DONE! GitHub Updated
echo ========================================
echo.
pause