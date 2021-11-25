@echo off
java -jar -Dspring.config.location=%cd%\application.properties  %cd%\server-0.0.1-SNAPSHOT.jar
pause