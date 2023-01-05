@stack
Feature: User tests the stack page 

Scenario: The User navigates the "stack" page
Given The user is on the "home page" with title "Numpy Ninja"
When The user selects stack from dropdown menu
Then The user should be directed to "stack" page

Scenario: The User navigates to "Operations in stack "page
Given The user is on the "stack" page after logged in
When The user clicks on the Operations in stack link
Then The user should be directed to "Operations in stack" page

Scenario: The User navigates to tryEditor page from Operations in stack page
Given The user is on the "Operations in stack "page after logged in
When The user clicks "Try here" button in Operations in "stack" page
Then The user should be directed to tryEditor page

Scenario: The User able to run Python code in tryEditor for Operations in Stack page 
Given The user is in tryEditor page of "Operations in Stack"
When The user enter a python code in try Editor
|print"Operations in Stack"|
Then The user get an Run output

Scenario: The User navigates to "Implementation" page
Given The user is on the "stack "page after logged in
When The user clicks on the Implementation link
Then The user should be directed to "Implementation" page

Scenario: The User navigates to tryEditor page from Implementation page
Given The user is on the Stack "Implementation" page after logged in
When The user clicks "Try here" button in "stack Implementation" page
Then The user should be directed to tryEditor page

Scenario: The User able to run Python code in tryEditor for Implementation page
Given The user is in tryEditor page of "Stack Implementation"
When The user enter a python code in try Editor
|print"Implementation"|
Then The user get an Run output

Scenario: The User navigates to "Applications" in stack page
Given The user is on the "Applications" page after logged in
When The user clicks on the Application link
Then The user should be directed to "Applications" page

Scenario: The User navigates to tryEditor page from Applications page
Given The user is on the "Applications" page after logged in
When The user clicks" Try here" button in " Applications" page
Then The user should be directed to tryEditor page

Scenario: The User able to run Python code in tryEditor for Application page
Given The user is in tryEditor page of" Stack Applications"
When The user enter a python code in try Editor
|print"Applications"|
Then The user get an Run output

Scenario: The User navigates to "practice Questions" in stack page
Given The user is on the "Stack page" after logged in
When the user clicks  on practice  Questions button
Then the user should be directed to "Practice Questions" Page

