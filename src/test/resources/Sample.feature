Feature: Validation of Facbebook Login Page

Scenario Outline: Validation of login with valid Username and valid Password 
Given User launch the browser
When User Login with Valid "<username>" and "<password>"

Examples:
|username|password|
|Valid user|bhsgdgf|

Scenario Outline: Validation of login with invalid Username and valid Password 
Given User launch the browser
When User Login with Valid "<username>" and "<password>"

Examples:
|username|password|
|InValid user|bhsgdgf|

Scenario Outline: Validation of login with valid Username and invalid Password 
Given User launch the browser
When User Login with Valid "<username>" and "<password>"

Examples:
|username|password|
|InValid pass|bhsgdgf|

Scenario Outline: Validation of login with invalid Username and invalid Password 
Given User launch the browser
When User Login with Valid "<username>" and "<password>"

Examples:
|username|password|
|InValid user and pass|bhsgdgf|
