# SportyShoes_SpringBootApp

SportyShoes is aiming to digitise a project SportyShoes.com which is a online ecommerce system capable of performing operations such as managing products for  example adding, deleting, updating, retrieving on various conditions etc. The admin of the site can also define and redefine categories the shoes belong to. Also the admin of the site can manage all the users of the ecommerce website and also get all the purchases done on the site filtered on various parameters such as by product, category, user etc. The admin requires a login username and password for performing all these activities. The admin can change his/her username anytime he wants and can logout as well. 

**Currently the system performs admin specific functionalities (as mentioned in the problem statement), a sample get all products endpoint is defined as “/products” which requires no admin login. 

**All the admin REST endpoints have the prerequisite that an admin MUST first log in (“admin/login”). All admin endpoints start with “/admin”.



Start Up Admin username and password (POST request to “localhost:XXXX(default 8080)/admin/login with following body)

{
	“username”:”root”
	“password”:”root”
}



#How to run the app

Step 1:  
If using HTTPS, run the following command on the terminal to clone the Sporty Shoes App made with SpringBoot, https://github.com/siddharth-basu98/SportyShoes_SpringBootApp.git , otherwise if using SSH, git@github.com:siddharth-basu98/SportyShoes_SpringBootApp.git 

Step 2: 
Using any IDE of choice, open the cloned project in the workspace as a SpringBoot project with Maven. The IDE upon reading the pom.xml file will download all the dependencies. Currently the app runs on the default embedded TOMCAT server port of 8080, if in case the port needs to be changed, add the following code in the “application.properties” file “server.port=XXXX”, where XXXX is any port which is free on your system. 

Step 3:
The app used the in memory database H2 to store, retrieve, update data, the initial data in entered in the file “data.sql” in the “application.properties” file, to see the tables generated in H2, open localhost:XXXX/h2 on your system, and make sure the JDBC url is “jdbc:h2:mem:testdb”. Upon pressing connect, all the tables with the initial data can be viewed. 

Step 4:
The application for REST API documentation used Swagger. One can also test the APIs directly from swagger. To access the swagger API documentation page, visit “localhost:XXXX/swagger-ui.html” on your browser to see the complete list of API endpoints defined in the system. 

Step 5: 
The app majorly as required were to perform admin related tasks, so to access any API starting with /admin which is most of them as it was the requirement, you first need to login by sending a POST request to “localhost:XXXX/admin/login”, The request body for the admin login will be by default, 

{
	“username”:”root”
	“password”:”root”
}

You may change the password or even add new admin later on by first logging in with the above credentials. 


Step 6:
Enjoy testing out all the APIs endpoints.

