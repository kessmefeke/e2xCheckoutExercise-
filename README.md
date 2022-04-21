---------------- REQUIREMENTS TO RUN TESTS ----------------
1. Maven should be available on PC.
2. PC is configured with maven home, java home and at least chrome browser.
3. Depending on your Java version might need to configure tools.jar on pom.xml


---------------- RUNNING TESTS --------------------
1. Pull the framework to your local directory of choice
2. Open command prompt
3. cd to the directory where the framework is located
4. do "mvn compile" (to compile the framework and download all dependencies)
5. do "mvn install test" (to run all tests)
6. To view TEST REPORT go to -> {user.dir}/target/cucumber.xml
7. When importing the project into IntelliJ, use the pom.xml file.
8. Can also run tests from pom.xml or from the feature files.


---------------- NOTE ----------------------------
Versions of cucumber and Junit could be different on other system and could cause conflict, for this exercise
versions 6.10.4 is used.

---------------- TECH DEBT -----------------------
1. Page object model was applied for easy maintainability 
2. A waithelper utitliy file added for global handling of wait times for element.
3. Test output folder for HTML reports.

