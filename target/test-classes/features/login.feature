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
/*
some times we might need to execute one particular test or scenario before we run for every scenario 
like in selenium every time we need to lunch the browser

This type of background applicable only for feature not applicable other feature file.
*/

Background: 
 Given Validate the browser
 When browser is triggered
 Then Check if browser is started
@SmokeTest
Scenario: Home page default Login

    Given User is on login page
    When User login into application with "radhika" and password "1234"
    Then Home page is displayed
    And All card details are displayed "true"
 @RegTest
 Scenario: Home page default Login

    Given User is on login page
    When User login into application with "Naresh" and password "12345"
    Then Home page is displayed
    And All card details are displayed "false"
@RegTest
    Scenario: Home page default Login

    Given User is on login page
    When User sign up with following details
    |Radhika | 1234| warangal|radhika.sangani@tcs.com |
    Then Home page is displayed
    And All card details are displayed "true"
 
    

