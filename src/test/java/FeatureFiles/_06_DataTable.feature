Feature: DataTable Functionality

  Background: login
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Create Country

    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | yasin12343 |
      | codeInput | 45zfd45  |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | yasint123 |

    Then Success message should be displayed

  @Regression
  Scenario: Create Nationality

    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | yasint46968 |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | yasint46968 |

    Then Success message should be displayed

  @Regression
  Scenario: Fee Functionality

    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | yasnt4Fee123 |
      | codeInput       | i3434t       |
      | integrationCode | 16143t       |
      | priorityCode    | 142321t      |

    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | yasnt4Fee123 |

    Then Success message should be displayed

