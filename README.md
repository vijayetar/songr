# Songr App  

## Routes  
1. __/hello__: a hello world route at /hello  
2. __/hello?name=enter-name-here__: a hello route that takes in query and renders it on the html page.   
3. __/capitalize/add-message-to-capitalize-here__: a route that turns words in the params into UPPER CASE. 
4. __/albums__: /albums that shows album instances. 
5. __/numbers/enter-number-here__: route that takes a number as a param and pings the numbersapi to generate a string quote for the number

## Album Routes
1. __/albums__: displays all the albums in the app, with form to add more albums, and add more songs to each album
2. __/detials/id__: when clicking on any album on the /albums page, it will be redirected to the details url where you can update relevant song information. Here you can udpate the songs and delete the songs in each album, and even delete the album.


## How to run the app
1. clone the repository to your terminal  
2. open the folder using IntelliJ  
3. update the applications.properties folder with the following:
```
spring.datasource.url=jdbc:postgresql://localhost:5432/songr
spring.datasource.username=<TYPE USERNAME>
spring.datasource.password=<TYPE PASSWORD>
#spring.jpa.hibernate.ddl-auto=create
spring.jpa.hibernate.ddl-auto=update
```
4. open the SongrApplication in the src/main/java/com.vijayetar.songr and run the application
5. open the application in "localhost:8080"  
6. Or run from command line
```
./gradlew bootRun
```

## References
1. [status exception](https://www.baeldung.com/spring-response-status-exception)