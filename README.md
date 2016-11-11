# capstone
capstone school project


This is the start of a simple git hub repo to utilize for my groups capstone project

Please if you are not part of the team do not push anything to this repo.

Steps to clone repo and install in IDE
  1. in the folder of your choice run this command line : git clone https://github.com/sjachimowicz/capstone.git
  2. (I'm using Eclipse so this part might be different) In your IDE you are going to want to import the maven project 
      This is done so in Eclipse by going to File -> Import Project -> Existing Maven Project
  3. In the import wizard select 'Existing Maven Projects' 
  4. Browse to he root director of the repo you cloned (Ex c:/users/%User%/capstone/
  5. choose the the project with the id of com.valenciatech:capstone-rapidoid:1.0.......
  6 The import wizard should import and build the project.
  
 # Note: If your IDEchoice does not support Maven look for a maven plugin.
 
 # Using the project
  The file we are interested in is Main.java in src/main/java/application running this will bootstrap the app and the console will log either success or failures.
  
  The default settings for the app are as follows:
    url: localhost:8888
    profile: dev
    db: using session memory atm (need to hook up sql server with hibernate!), app will still bootstrap successfully however
    
 Most of the test commands exist in Main.java, and there is a sample Controller file and Entity class to work with JPA.hibernate.
 
 To interact with the server here are some examples:
 
  all these url paths follow the host url (localhost:8888)
  
    /size?msg=Whatever message you want
    
    /concate?msg1=A Message&msg2= another message
    
    /perimeter?width=12.00&length=20.22
    
    /books //returns the array of current books, since no db this is blank every time you start the app
    
    /books?title=sometitle&year= 11111 //even though this is constructed like the other this is would actually do db work if
                                       // the db was currently configed properly
    
    /books //would then contain the book you entered if it was a valid book
    
  
    There a couple listed that I have not gone over- look through the current code and see if you can figure them out :)
    
    To make it easier if you have trouble constructing the url properly consider getting a app like Postman          https://www.getpostman.com/. It makes building the requests easy.
    
 Contact me with questions. 
    
