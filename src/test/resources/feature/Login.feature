Feature: Verify date of given holiday

  Scenario Outline: Verifying Holidays labels and its date
    Given User logs in to Client home page with valid credentials using "<email>" and "<password>"
    When User navigates to "leave->configure->holidays"
    Then user verifies given date of holiday


    Examples:
      | email | password |
      | Admin | admin123 |