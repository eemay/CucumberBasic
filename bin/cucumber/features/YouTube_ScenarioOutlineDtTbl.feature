Feature: Submit a valid contact form

  #Scenario: Title of your scenario
  # Given I am on the lazada site
  # When I navigate to "Adoption"
  # And I submit the form with "Adoption"
  # Then I check that the form has been submitted
  
  #Scenario: Title of your scenario
  # Given I am on the lazada site
  # When I navigate to "About"
  # And I submit the form with "About"
  # Then I check that the form has been submitted
  
  Scenario Outline: Title of your scenario
    Given I am on the lazada site
    When I click on <Link>
    And I am on the <Title>
    Then I check that the form has been submitted

    Examples: 
      | Link          | Title    |
      | adoption_link | Adoption |
      | about_link    | About    |
      | contact_link  | Contact  |
      | home_link     | Home     |
