Feature: Baykartech test cases
  @Navbar
  Scenario: Check the navbar elements
    Given The user is on the home page
    Given Close the popup
    Then Click on the navbar elements

  @Language
  Scenario: Dil sayfalari arasinda gecis
    Given The user is on the home page
    Given Close the popup
    Then Language changes to English
    Then Close the popup
    Then The language will be Turkish
    Then Close the popup