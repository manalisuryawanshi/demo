Feature: To search an Item

Scenario Outline: To search for an item
Given Browser initialized
And Navigate to "https://www.gillette.co.in/en-in" site and click on search
When user search for <item>
Then System seaches for item

Examples:
|item	|
|Razor 	|