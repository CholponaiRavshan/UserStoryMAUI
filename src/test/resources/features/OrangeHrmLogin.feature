@regression @ui @MB2P-129
Feature: Verify opensource-demo functionality

  Scenario Outline: Verify Add user functionality
    Given user navigates to the opensource-demo application
    When user login  in with username "Admin" password "admin123"
    And user clicks on Admin tab
    And user clicks on Add button
    And user provide user data
      | User Role        | <User Role>        |
      | Employee Name    | <Employee Name>    |
      | Username         | <Username>         |
      | Status           | <Status>           |
      | Password         | <Password>         |
      | Confirm Password | <Confirm Password> |

    And user clicks save button
    Then validates that new user name is created with success message "Successfully saved"
    Examples:
      | User Role | Employee Name | Username | Status  | Password   | Confirm Password |
      | ESS       | Fiona Grace   | Patel    | Enabled | patelharsh | patelharsh       |