


@login
Feature: To  validate login functionality in fb
Background:
Given user have to be in fb login page
And user have to maximize screen

@sanity @reg
Scenario: To validate login using valid email and invalid password
When user have to enter valid Email and invalid password
|Watch|Mobile|
And user have to click login button
Then user have to be in password incorrect page

@smoke
Scenario: To validate login using invalid email and invalid password
When user have to enter invalid Email and invalid password
|srimahe|mahe|darshika|
|mahe@123|poornisha|sugan123|
|chennai|Tambaram|sanatorium|

And user have to click login button
Then user have to be in password incorrect page

@sanity
Scenario: To validate login using Invalid email and invalid password
When user have to enter Invalid email and invalid password
|Email|mahendransri97@gmail.com|
|phoneno|9843113158|
|Name|sridarshika|

And user have to click login button
Then user have to be in password incorrect page

@smoke @sri
Scenario: To validate login using Invalid email and invalid password
When user have to Enter Invalid Email and invalid Password
|Name|phoneno|Email|
|dev |arun   |mahend|
|jeeve|anitha|vishva|
And user have to click login button
Then user have to be in password incorrect page



