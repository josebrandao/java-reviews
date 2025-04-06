@echo off
echo Corrigindo JAVA_HOME, Kotlin e reordenando o Path...

:: Caminhos corretos
set "NOVO_JAVA_HOME=C:\Program Files\Java\jdk-17"
set "JAVA_BIN=%NOVO_JAVA_HOME%\bin"
set "KOTLIN_BIN=C:\kotlinc\bin"

:: Ler PATH atual
for /f "tokens=1,* delims==" %%A in ('"reg query HKCU\Environment /v PATH 2>nul"') do (
    set "OLD_PATH=%%B"
)

:: Remover entradas antigas e duplicadas
set "OLD_PATH=%OLD_PATH:C:\Program Files\Android\Android Studio\jbr\bin;=%"
set "OLD_PATH=%OLD_PATH:%JAVA_BIN%;=%"
set "OLD_PATH=%OLD_PATH:%KOTLIN_BIN%;=%"

:: Atualizar JAVA_HOME
setx JAVA_HOME "%NOVO_JAVA_HOME%" >nul

:: Atualizar PATH
setx PATH "%JAVA_BIN%;%KOTLIN_BIN%;%OLD_PATH%" >nul

echo JAVA_HOME definido como: %NOVO_JAVA_HOME%
echo Kotlin adicionado: %KOTLIN_BIN%
echo ---
echo Concluído. Reinicie o terminal para aplicar.
pause
