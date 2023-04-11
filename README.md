# United-Portal

This project contains the services required in the United Common Case Portal. Services are developed using Spring boot and Hibernate.

Local Setup Instructions:

1) Download project zip
2) Extract and open project in any IDE (Suggested: Intellij)
3) Navigate to the pom.xml file in the file navigation pannel
4) Right click and add as Maven project
5) Setup project SDK as required
6) Start MYSQL server in your local machine
7) Configure the JDBC URL, username and password in the application.properties file of the project
8) Run the entire script "data.sql" or execute each statement in it on your MYSQL server 
9) Run UnitedCapstoneProjectApplication.java
10) Open http://localhost:8080/swagger-ui.html to view the swagger page and all the available APIS
11) Open http://localhost:8080/h2-console to access H2 console
12) Navigate to bulk save workstation controller and save data (Entire content is in the workstationData.json file) 
13) Navigate to bulk save checklist controller and save data (Entire content is in the checklistData.json file)
