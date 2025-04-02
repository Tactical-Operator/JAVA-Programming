@echo off
javac optcopy.java
if %errorlevel% neq 0 (
    echo Compilation failed.
    exit /b %errorlevel%
)

echo Running test cases...

:: Read input.txt in pairs
setlocal enabledelayedexpansion
set count=0
set line1=
for /F "tokens=*" %%A in (input.txt) do (
    set /A count+=1
    if !count! equ 1 (
        set line1=%%A
    ) else (
        echo !line1! > temp_input.txt
        echo %%A >> temp_input.txt
        java optcopy < temp_input.txt
        set count=0
    )
)

del temp_input.txt
pause
