Feature: Fees multiple values functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario Outline: Fee Functionality
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | <name>     |
      | codeInput       | <code>     |
      | integrationCode | <intCode>  |
      | priorityCode    | <priority> |

    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | <name> |

    Then Success message should be displayed
    Examples:
      | name     | code   | intCode | priority |
      | yasin456 | 12348  | 123     | 23       |
      | ySAS1    | 23563  | 125     | 24       |
      | yasin456 | 123482 | 123768  | 25       |
      | ySAS1    | 23561  | 12589   | 26       |