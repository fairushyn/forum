# forum
Simple Forum implementalion.

### Task

We need to implement following endpoints:

* ```GET /topicts``` Returns all topics in forum.
* ```GET /topics/{topic_id}/posts``` Returns all posts for specific topic.
* ```POST /topics``` Creates new topic.::

        { "title" : "String", "text" : "String"	}

* ```POST /topics/{topic_id}/posts``` Creates new post for spesific topic.::

        { "text" : "String" }

### First Web Application with Servlets
Створюємо наступну ієрархію директорій.

```
.
├── pom.xml
└── src
    └── main
        ├── java
        │   └── ua
        │       └── codegym
        │           └── forum
        │               └── servlet
        │                   └── MainServlet.java
        └── webapp
            └── WEB-INF
                └── web.xml

9 directories, 3 files
```

Редагуємо pom.xml

```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>ua.codegym</groupId>
    <artifactId>forum</artifactId>
    <version>1.0-SNAPSHOT</version>
    <name>Forum</name>
    <packaging>war</packaging>

    <dependencies>
	<dependency>
	    <groupId>javax.servlet</groupId>
	    <artifactId>servlet-api</artifactId>
	    <version>2.5</version>
	</dependency>
    </dependencies>
</project>
```

web.xml

```
<web-app>
    <servlet>
	<servlet-name>main</servlet-name>
	<servlet-class>ua.codegym.forum.servlet.MainServlet</servlet-class>
    </servlet>

    <servlet-mapping>
	<servlet-name>main</servlet-name>
	<url-pattern>/*</url-pattern>
    </servlet-mapping>
</web-app>
```

MainServlet.java

```
package ua.codegym.forum.servlet;

import java.io.*;
import javax.servlet.http.*;

public class MainServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    res.getWriter().println("Hello!");
  }
}
```

``` mvn clean package```

Отримуємо ```target/forum-1.0-SNAPSHOT.war``` файл, який переносимо в папку томката ```tomcat/webapp/```, запускаємо сервлет контейнер.
Перевіряємо результат в браузері!
