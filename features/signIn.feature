Feature: Sign In Validation

  Background: Given user is in the homepage

  # Feature is nothing but test in BDD
  @homepage
  Scenario: Sign In
    #Given user is in the homepage
    When user clicks signIn1
    And clicks signIn2
    Then user will be in Sign into your Target account page

  @dataDriven1
  Scenario Outline: Sign into Your Target Account Page Validation
    # Given user is in the homepage
    When user clicks signIn1
    And clicks signIn2
    Then user will be in Sign into your Target account page <title>
    And url of the page is <url>
    When user enters email <email>
    And user enters password <password>
    And click on signin3 button

    Examples: 
      |              title                          |  | url                                                                 |
      | 'Sign into your Target account' |  | "https://www.target.com/login?client_id=ecom-web-1.0.0&ui_namespace=ui-default&back_button_action=browser&keep_me_signed_in=true&kmsi_default=false&actions=create_session_signin" |
      |              email                        |  |  password      |
      | "taha@gmail.com"                  |  | "987453#$!"  |
      |"tahira@gmail.com"                 |  |"987453#$!"   |
      |"abcd@gmail.com"                   |  |"987453#$!"   |                                            
   
