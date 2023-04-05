#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Application Login


 


// some times we might be tag two tags to only one scenario that time 
@SmokeTest @RegTest
Scenario Outline: Home page Login
Given User on login page
When User login in to application with <username> and password <password>
Then page is displayed
And card details are displayed "true"
 Examples:
 |username|password|
 |user1   |pass1   |
 |user2   |pass2   |
 |user3   |pass3   |
    
