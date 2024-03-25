Feature: Create User

  Scenario: Check if user can create an account with valid credentials
    Given The service is up
    When I send a POST request having valid credentials
    Then I have 200 status code
#
#    Examples:
#      | id | userName    | firtstName | lastName | email                   | password | phoneNumber | userStatus |
#      | 1  | roxanapancu | Roxana     | Pancu    | roxanapancu@yopmail.com |Pass123!  |0740131233   |active      |

#  Scenario: Get 400 response code for empty request
#    Given The service is up
#    When I send a POST request to create a new account with empty body
#    Then I have 400 status code