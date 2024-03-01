Feature: Verify date of given holiday

  Scenario Outline: Testing Login functionalty with valid Credentials
    Given User logs in to Client home page with valid credentials using "<email>" and "<password>"
    When User navigates to "leave->configure->holidays"
    Then user verifies given date of holiday


    Examples:
      | email | password |
      | Admin | admin123 |