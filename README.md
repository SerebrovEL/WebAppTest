"# WebAppTest" 

Настройка Maven
* Зайдите на официальный сайт мавен в раздел загрузка (http://maven.apache.org/download.html) и скачайте последнюю стабильную версию.
* Распакуйте архив в инсталляционную директорию. Например в C:\Program Files\maven\ в Windows или /usr/share/maven в Linux
* В Windows зайдите "мой комьютер" ->свойства->дополнительные параметры->переменные среды->пользовательские переменные и там добавьте пользовательские переменные "JAVA_HOME" и "PATH".
* Установите переменную окружения JAVA_HOME: пишем в нее путь C:\Program Files\Java\jdk1.8.122\ - то есть пишем путь до папки jdk_номер_версии включительно. В Linux можно добавить строку "export JAVA_HOME=/usr/share/maven" в файл /etc/profile.
* в переменную PATH пишем в нее C:\Program Files\maven\bin\ - это путь к mvn.bat. В Linux можно добавить строку "export PATH=$PATH:$M2_HOME/bin"в файл /etc/profile . Это позволит писать в консоли "mvn %команда%" в любой текущей папке, что очень удобно.
* После того как созданы все необходимые переменные, нужно перезапустить вашу cmd, или totalcmd, если вы через него открываете cmd, чтобы изменения вступили в силу.
* Проверьте корректность установки набрав в командной строке: mvn -version
* Если результат примерно такой:

$ mvn -version
Apache Maven 3.0 (r1004208; 2010-10-04 15:50:56+0400)
Java version: 1.8.122
Java home: /opt/sun-jdk-1.8.122/jre
Default locale: ru_RU, platform encoding: UTF-8
OS name: "linux" version: "2.6.34-gentoo-r12" arch: "amd64" Family: "unix"

то вы успешно установили Maven.

Запуск jetty с помощью MAVEN через консоль
1) в тотал коммандере зайти в проект, нужно зайти в папку WebAppTest
2) в тотале перейти в командную строку
3) написать cmd и нажать ентер, чтобы при открытии виндовской cmd текущей была директория WebAppTest
4) далее в cmd пишем команду mvn jetty:run и выполняем ее (для того чтобы остановить выполнение проекта в cmd нажимаем ctrl + c)
5) после чего заходим в браузер и пишем http://localhost:8080/
и все
