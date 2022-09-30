@homepage
Feature: Sign In Validation

  # Feature is nothing but test in BDD
  Scenario: Sign In
    Given user is in the homepage
    When user clicks signIn1
    And clicks signIn2
    Then user will be in Sign into your Target account page
    
@dataDriven1
  Scenario Outline: Sign into Your Target Account Page Validation
    
    Given user is in the homepage
    When user clicks signIn1
    And clicks signIn2
    Then user will be in <Sign into your Target account> page
    And url of the page is <url>
    
    Examples: 
                     |title|                               |url|                                          
    |"Sign into your Target account"|   |"https://www.target.com/login?client_id=ecom-web-1.0.0&ui_namespace=ui-default&back_button_action=browser&keep_me_signed_in=true&kmsi_default=false&actions=create_session_signin"|
    |"Sign into your Target account"|   |"https://www.target.com/login?client_id=ecom-web-1.0.0&ui_namespace=ui-default&back_button_action=browser&keep_me_signed_in=true&kmsi_default=false&actions=create_session_signin"|                              
    |"Sign into your Target account"|   |"https://www.target.com/login?client_id=ecom-web-1.0.0&ui_namespace=ui-default&back_button_action=browser&keep_me_signed_in=true&kmsi_default=false&actions=create_session_signin"|                             
    
    #@dataDriven2
    #Scenario Outline: Input Email and Password
    #Given user will be in <Sign into your Target account> page
    #And url of the page is <url>
   #When user inputs <email>
    #And inputs <password>
    #And clicks signIn
    #Then user will be in the homepage
    #
    #Examples:      
    #|email|                           |password|              
    #|"taha@gmail.com"  |     |"987453#$!"|
    #|"tahira@gmail.com"|     |"987453#$!"|
    #|"abcd@gmail.com"  |     |"987453#$!"|                                            