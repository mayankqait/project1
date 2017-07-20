Feature: annotation 
#This is how background can be used to eliminate duplicate steps 

Background: 
   User navigates to Facebook 
   Given I am on webmail.qainfotech.com login page 

#Scenario with AND 
Scenario Outline: 
   When I enter username as "<username>"
   And I enter password as "<password>" 
   Then Login should pass 

Examples:
   |username|password|
   |mayankchauhan|dfff|
   