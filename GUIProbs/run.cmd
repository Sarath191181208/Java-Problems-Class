@echo off

set package=classProbs
set file_name=EventHandlersExample
@REM set file_name=EventFiltersExample
@REM set file_name=TreeViewExample


set j_file=%package%.%file_name%
set java="C:\Program Files\Java\jdk-18\bin\java.exe"

@REM defining the modules that need to be added
set java_fx_path=E:\Sarath\java\Java-Problems-Class\libs\javafx\javafx-sdk-18.0.1\lib
set add_modules=--module-path %java_fx_path% --add-modules javafx.controls,javafx.fxml

@REM enabling the preivew for the java build
set arg_file_path=@C:\Users\ADMINI~1\AppData\Local\Temp\cp_7vdxn2t28fc5z2g1fh2mac4yi.argfile
set show_preview=--enable-preview -XX:+ShowCodeDetailsInExceptionMessages %arg_file_path%

@REM compiling and running the file
%java% %add_modules% %show_preview% %j_file%