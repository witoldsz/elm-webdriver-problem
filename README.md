Elm Webdriver Problem
---


Quick start guide:

- Clone repo:
```
$ git clone git@github.com:witoldsz/elm-webdriver-problem.git
$ cd elm-webdriver-problem
$ ls -1
pom.xml
README.md
src
```

- Check JDK 1.8:
```
$ java -version
java version "1.8.0_25"
Java(TM) SE Runtime Environment (build 1.8.0_25-b17)
Java HotSpot(TM) 64-Bit Server VM (build 25.25-b02, mixed mode)

$ javac -version
javac 1.8.0_25

```

- Check Maven:
```
$ mvn --version
Apache Maven 3.2.5 (12a6b3acb947671f09b81f49094c53f426d8cea1; 2014-12-14T18:29:23+01:00)
Maven home: /opt/apache-maven
Java version: 1.8.0_25, vendor: Oracle Corporation
Java home: /opt/jdk/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "4.4.0-75-generic", arch: "amd64", family: "unix"

```

- Get ChromeDriver: https://sites.google.com/a/chromium.org/chromedriver/downloads and unpack it into the root of the
project. **See the driver's release info if the version supported by the driver matches your Chrome version.**
```
$ ls -1
chromedriver
pom.xml
README.md
src
```

- Build:
```
$ mvn package
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building elm-webdriver-problem 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
…
[INFO]
[INFO] --- maven-assembly-plugin:3.0.0:single (default) @ elm-webdriver-problem ---
[INFO] Building jar: /home/witoldsz/projects/elm-webdriver-problem/target/elm-webdriver-problem.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2.981 s
[INFO] Finished at: 2017-05-04T00:10:56+02:00
[INFO] Final Memory: 36M/368M
[INFO] ------------------------------------------------------------------------

$ ls -1
chromedriver
LICENSE
pom.xml
README.md
src
target

$ ls -1 target/
archive-tmp
classes
elm-webdriver-problem-1.0-SNAPSHOT.jar
elm-webdriver-problem.jar
generated-sources
maven-archiver
maven-status

```

- Run:
```
$ java -jar target/elm-webdriver-problem.jar
Starting ChromeDriver 2.29.461571 (8a88bbe0775e2a23afda0ceaf2ef7ee74e822cc5) on port 17282
Only local connections are allowed.
May 04, 2017 12:13:20 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Attempting bi-dialect session, assuming Postel's Law holds true on the remote end
May 04, 2017 12:13:21 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: OSS
user.dir: /home/witoldsz/projects/elm-webdriver-problem
```

- The source code of the Elm app is here: https://runelm.io/c/nx0

[![Screenshot from 2017-05-04 00-57-07.png](https://s23.postimg.org/vqtbdwmbf/Screenshot_from_2017-05-04_00-57-07.png)](https://postimg.org/image/rholbqj1z/)
