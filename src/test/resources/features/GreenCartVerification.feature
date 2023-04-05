Feature: Search and Place the Order for Products

Scenario: Search the product in both home and offerpage

Given user is on Greencart home page
When User searched for the "Tom" product in the Home page
Then User searched the "Tom" product name on the offer page
And validate the both both product names
