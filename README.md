
***ASSESMENT***

<br/> HotelApi is the RESTful service Api with embedded apache tomcat as servlet container and it use Java / Spring Boot as Back-End, Jquery, Jsp as Front-End, MongoDB as Database. HotelApi's purpose is parsing available hotels from https://www.enuygun.com/otel/ address and it use www.enuygun.com's own request for get the available hotels. HotelApi rearranges the request according to the conditions of the service users and resend request to https://www.enuygun.com/otel/. The returned string has includes available hotels informations and it splits appropriately and then converted into an available JSON data for my service's model structure. After then,you can use the service for gets all available hotels or specificaly you can get available hotels accourding to specific town.

***RUN***

Firstly,you should complete installation of MongoDb before the running our service, afterwards you need to package it with;

```mvn clean package```

You'll see that there're controller tests.

If you wanna change default configuration,parameters set in src/main/resources/application.properties you need to give a new properties file with the following parameter;

```java -jar target/assessment-1.0.0-SNAPSHOT.jar --spring.config.location=file:////home/ufuk/my_application.properties```

***Swagger UI***

<br/>By default this assesment will be executed on 8080 port and you'll see the entire endpoints from http://localhost:8081//hotel/swagger-ui.html

***Front-End***

<br/>After lifting the project in your local,you can check front look of the Api from below url:
<br/>http://localhost:8081/hotel/hotelApi



