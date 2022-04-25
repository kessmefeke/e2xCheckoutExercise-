# e2xCheckoutExercise-
Exercise
 ---------------- REQUIREMENTS TO RUN TESTS ----------------

Maven should be available on PC. PC is configured with maven home, 
java home and at least chrome browser. Depending on your Java version 
might need to configure tools.jar on pom.xml 

---------------- RUNNING TESTS --------------------

Pull the framework to your local directory of choice 
Open command prompt cd to the directory where the framework is located do 
"mvn compile" (to compile the framework and download all dependencies) 
do "mvn install test" (to run all tests) 
To view TEST REPORT go to -> {user.dir}/test-outout/report.html. 
When importing the project into IntelliJ, use the pom.xml file. 
Can also run tests from pom.xml or from the feature files. 

---------------- NOTE ---------------------------- 

Versions of cucumber and Junit could be different on other system 
and could cause conflict, for this exercise versions 6.10.4 is used.

---------------- TECH DEBT -----------------------

Page object model was applied for easy maintainability 
A waithelper utitliy file added for global handling of wait times for element. 
For reports after run refresh test output folder for version of HTML reports.
