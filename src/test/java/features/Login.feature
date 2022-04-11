Feature: Login functionality of application 
@regression
 Scenario Outline: Testing with valid credentials 
	Given Launch the browser    
	And Load the URL 
	And Enter the username & password 
	When Click on login button 
	Then homepage should be displayed 
	
	Examples:
	|username|password|test|
	|Kang|shi|test|
	|fasd|sgggggggg|sdfss[]]|
	@smoke
	Scenario: Testing with invalid credentials 
	Given Launch the browser    
	And Load the URL 
	And Enter the username & password 
	When Click on login button 
	But error should be displayed 