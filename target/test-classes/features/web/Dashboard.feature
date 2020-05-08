Feature: Test the Resource Dashboard scenario

  Scenario Outline: check the Resource dashboard option visible to respective user
    And click on the login button
    And Fill the "<username>" and "<password>"in field
    Then I click on the menu option
    And Resource dashboard option visible or not and "<resource dashboard>"
    Then click on the logout button
    Examples:
      | username | password      | resource dashboard |
      | RM       | RMpassword    | present            |
      | BU       | BUpassword    | present            |
      | GO       | GOpassword    | present            |
      | Sales    | Salespassword | present            |


  Scenario Outline: check the project dashboard option visible to respective user
    And click on the login button
    And Fill the "<username>" and "<password>"in field
    Then I click on the menu option
    And project dashboard option visible or not and "<project dashboard>"
    Then click on the logout button
    Examples:
      | username | password      | project dashboard |
      | RM       | RMpassword    | present           |
      | BU       | BUpassword    | present           |
      | GO       | GOpassword    | present           |
      | Sales    | Salespassword | present           |


  Scenario Outline: check the initiation and edit option visible to which user
    And click on the login button
    And Fill the "<username>" and "<password>"in field
    Then I click on the menu option
    And initiation option visible or not and "<project initiation>"
    And I check edit button visible to GO/Sales
    Then click on the logout button
    Examples:
      | username | password      | project initiation |
      | RM       | RMpassword    | absent             |
      | BU       | BUpassword    | absent             |
      | GO       | GOpassword    | present            |
      | Sales    | Salespassword | present            |


  Scenario: Fill the input Fields and check validation on Initiation form
    And I fill the username as "GO" and password as "GOpassword"
    Then I click on the menu option
    When I click on the project initiation option from the Menu
    Then I Fill the Fields input and verify the validation message in the Initiation form
      | Fields input | validation message                              |
      | kawaljeet    | This field required only positive integer value |
      | aman123      | This field must contain alphabet and spaces     |
      | 123          | This field must be a valid email                |


  Scenario: Fill the Initiation form
    And I fill the username as "GO" and password as "GOpassword"
    Then I click on the menu option
    When I click on the project initiation option from the Menu
    Then I Fill The All Fields In the Initiation Form
      | Project name | Project Summary | Company name | Total Approved Hours | Company Address | Client Name 1 | Client Email address 1 | Project Domain | Project Components/ Deliverables | Technology | Project Documents Link 1                           | Any specific set of requests/concerns | Assign Account Manager | Assign Project Manager |
      | canada 666   | ABC             | Successive   | 123                  | south anarkali  | rubal         | rubal@gmail.com        | zxc            | Web Application                  | PHP        | http://resource-dash.writso.com/project-initiation | Do not write anything                 | hr test                | kawaljeet singh        |
    When I click on the submit button
    Then I click on the pop up message
    Then click on the logout button


  Scenario: Check the creation option and fill the creation form
    And I repeate the Initiation scenario with "GO" and "GOpassword"
      | Project name     | Project Summary | Company name | Total Approved Hours | Company Address | Client Name 1 | Client Email address 1 | Project Domain | Project Components/ Deliverables | Technology | Project Documents Link 1                           | Any specific set of requests/concerns | Assign Account Manager | Assign Project Manager |
      | close the window | ABC             | Successive   | 123                  | south anarkali  | rubal         | rubal@gmail.com        | zxc            | Web Application                  | PHP        | http://resource-dash.writso.com/project-initiation | Do not write anything                 | hr test                | kawaljeet singh        |
    And I use username as "RM" and password as "RMpassword"
    Then I click on the menu option
    When I click on the open request of project dashboard
    Then I verify creation option visible and then click on that option
      | Action | projectwisecreation |
      | 4      | 1                   |
    And I enter in to the creation form
    Then click on the submit button and check pop message display
    Then click on the logout button

  Scenario: Fill The Wrong Input In The Fields And Check The Validation On The Requisition Form
    And I repeate the Initiation scenario with "GO" and "GOpassword"
      | Project name          | Project Summary | Company name | Total Approved Hours | Company Address | Client Name 1 | Client Email address 1 | Project Domain | Project Components/ Deliverables | Technology | Project Documents Link 1                           | Any specific set of requests/concerns | Assign Account Manager | Assign Project Manager |
      | requisition scenarios | ABC             | Successive   | 123                  | south anarkali  | rubal         | rubal@gmail.com        | zxc            | Web Application                  | PHP        | http://resource-dash.writso.com/project-initiation | Do not write anything                 | hr test                | kawaljeet singh        |
    And I repeate the creation scenario with "RM" and "RMpassword"
      | Action | projectwisecreation |
      | 4      | 1                   |
    And I fill the username as "GO" and password as "GOpassword"
    Then I click on the menu option
    When I click on the open request of project dashboard
    Then I Click On The Requisition option
      | Action | projectwiserequisition |
      | 4      | 1                      |
    Then Enter In To The Requisition Form and Fill The WongInput In The Fields And Verify It
      | WongInput | Validation message                                 |
      | @abc      | This field required only positive integer value    |
      | 10        | This field must be greater than 0 and less than 8  |
      | 40        | This field must be greater than 0 and less than 35 |

  @smoke
  Scenario: Fill The Requisition Fields And Submit The Requisition Form
    And I repeate the Initiation scenario with "GO" and "GOpassword"
      | Project name    | Project Summary | Company name | Total Approved Hours | Company Address | Client Name 1 | Client Email address 1 | Project Domain | Project Components/ Deliverables | Technology | Project Documents Link 1                           | Any specific set of requests/concerns | Assign Account Manager | Assign Project Manager |
      | Automation Task | ABC             | Successive   | 123                  | south anarkali  | rubal         | rubal@gmail.com        | zxc            | Web Application                  | PHP        | http://resource-dash.writso.com/project-initiation | Do not write anything                 | hr test                | kawaljeet singh        |
    And I repeate the creation scenario with "RM" and "RMpassword"
      | Action | projectwisecreation |
      | 4      | 1                   |
    And I fill the username as "GO" and password as "GOpassword"
    Then I click on the menu option
    When I click on the open request of project dashboard
    Then I Click On The Requisition option
      | Action | projectwiserequisition |
      | 4      | 1                      |
    Then I Fill The Fields In to The Requisition Form
      | NumberofResources | DailyEfforts | Experience | Department | Technology | Role |
      | 3                 | 4            | 7          | 4          | 5          | 3    |
    When I click On The Requisition Submit Button
    Then I submit The Pop Up Message
    Then click on the logout button






