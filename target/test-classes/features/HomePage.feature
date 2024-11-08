
@tag
Feature: Search functionality test
  

  @tag1
  Scenario: Verify user can find a property based on filtered choice
    Given I am on the Homepage
    Then I enter keyword "Ashfield NSW 2131"
    When I click toggle filter button
    And I select property type house
    And I select beds 5+
    And I select cars 2+
		And I select feature balcony
    And I click on the search button
    And I choose first listing
    Then I click on read more
    Then I look for the keyword balcony