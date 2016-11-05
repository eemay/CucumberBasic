Feature: Submit a valid contact form

  Scenario: Title of your scenario
    Given I am on the lazada site
    When I navigate to signup
    And I submit the form with valid data
      | Fields   | Valie             |
      | Name     | Jack Joe          |
      | Address  | Happy Land        |
      | Postcode | A1 522            |
      | Email    | eemay88@gmail.com |
    Then I check that the form has been submitteduuuu
