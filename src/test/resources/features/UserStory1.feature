@user_story1
Feature: Main tabs on home page

    Background:
      Given navigates to url

      @testCase1
      Scenario Outline:verify that user can open main tabs
        And verify user can see main tabs
        And click to "<mainTabs>" tabs
        Then verify that the "<mainTabs>" is opened
        Examples:
        |mainTabs        |
        |Our Technologies|

     @testCase2
      Scenario Outline:verify that user can open Software Development section
        When scroll down to the page
        Then verify Open roles section is present
        Then verify that "<positions>" position is under the Software Development section
        And click to "<positions>" section
        Then verify the new tab is opened
        Examples:
        |positions    |
        |iOS Developer|







