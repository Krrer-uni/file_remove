set /a counter=1
setlocal enabledelayedexpansion
for /r %%i in (*.txt) do (
rename "%%i" "!counter!.txt"
set /a counter+=1)
exit