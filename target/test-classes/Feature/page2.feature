@mahe
Feature: To  validate forgotten password functionality in fb

@sanity
Scenario Outline: To validate Forgottenpassword link in fb
Given user have to be in fb Login page      
And user have to Maximize screen
When user have to click Forgotten password link and enter "<Email or password>"
And user have to click search button

Examples: |
|Email or password|
|mahendran|
|srimahe|
|gethaa|








