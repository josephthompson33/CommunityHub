# CommunityHub
Community hub project for Xavier University, Designed as a software solution to the heroin epidemic.
The goal of Community Hub is to, on load of the mobile app/web page, show the user the closest drug rehabilitation centers in the city.
In addition to this, rehabilitation centers will be able to change the number of slots they have available for various programs, and this
information will be immediately viewable to the user.  
This involves a database of rehabilitation centers, getting the user's location, and a host of other technologies. 
Implemented using spring MVC, Amazon DynamoDB to name a few.  
To run, you need Java 8 installed, and the maven package manager(or an IDE with maven built in, i.e, eclipse, intellij)
navigate to the directory of the project, then run the command : mvn package
this command will compile all of the source code as well as download any needed dependencies.  
Also requires a valid Google maps API key and amazon dynamodb credentials file in the proper directory.
