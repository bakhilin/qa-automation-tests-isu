## Автоматизация теста проверки авторизации для платформы ISU.IFMO.RU

Все тесты находятся в директории [src/test](src/test/java/qa/). 
Для запуска теста необходим файл конфигурации `conf.properties`, который вы должны создать в [директории](src/test/resources/)

В файле `conf.properties` вы должны указать такие переменные:
1. url
2. login
3. password
4. chromedriver - путь до драйвера
5. userIdentity

