


# Description

This is an assignment project where we are automating below test flow.

1.	Navigate to wikipedia.org page
2.	Search for “OOP”
3.	Select first item in suggested results list
4.	Validate that you successfully navigate to https://en.wikipedia.org/wiki/OOP page
5.	Click on link with title “Object-oriented programming”
6.	Validate that you successfully navigate to https://en.wikipedia.org/wiki/Object-oriented_programming page
7.	On page bottom expand “Software engineering” area, and select third name from “Software engineers” list (e.g. “Grady Booch”).  

# Guidelines

Below guidelines have been followed during the development of this automation framework.

1.	Create a simple prototype of testing framework using Selenium WebDriver and Java programming language. 
2.	Follow the Java Style guide: https://google.github.io/styleguide/javaguide.html
3.	Use Junit for testing and Gradle or Maven as build system.
4.	Solution should run from command line. 
5.	Provide a README.md file with solution description. 
6.	Completed solution should uploaded to the Github. 

# Installation

Below prerequsitions are needed to run the tests

1. Java8
2. Maven
3. GoogleChrome Browser

GIT URL : https://github.com/AshishEPAM/assignment-wikipedia-test.git

This needs to be cloned on your local workspace to run the test.

# Tests

Open cmd or Windows PowerShell ISE and go to the root pom directory and type command 
mvn clean test -DbrowserName="browserName"

'browserName' is the name of the browser where you want to run the test. Only 'GoogleChrome' is supported at the moment.

Example : PS C:\Users\Ashish_Sahu\AssignmentWorkspace\assignment-wikipedia-test> mvn clean test -DbrowserName="GoogleChrome"

If the test runs successfully, then you will get below report.

[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 10.268 s - in com.assignment.tests.AssignmentTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 12.923 s
[INFO] Finished at: 2017-10-16T16:14:40+05:30
[INFO] Final Memory: 17M/168M
[INFO] ------------------------------------------------------------------------

If the test fails for example unsupported or invalid browser name, then we get below error.

Example : PS C:\Users\Ashish_Sahu\AssignmentWorkspace\assignment-wikipedia-test> mvn clean test -DbrowserName="IE"

[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.032 s <<< FAILURE! - in com.assignment.tests.AssignmentTest
[ERROR] testAssignment(com.assignment.tests.AssignmentTest)  Time elapsed: 0 s  <<< ERROR!
java.lang.IllegalArgumentException: Invalid/Unsupported Browser Name: IE, only 'GoogleChrome' is supported.
	at com.assignment.tests.AssignmentTest.setUp(AssignmentTest.java:29)
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2.587 s
[INFO] Finished at: 2017-10-16T17:04:56+05:30
[INFO] Final Memory: 17M/166M
