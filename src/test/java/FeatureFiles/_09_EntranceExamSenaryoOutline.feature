
Feature: Exam Create values functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario Outline: Exam Functionality

    And Click on the element in LeftNav
      | entranceExamsOne |
      | setupTwo         |
      | entranceExamsTwo |


    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | <nameInput> |

    And Click on the element in Dialog
      | academicPeriod  |
      | academicPeriod1 |
      | gradeLevel      |
      | gradeLevel2     |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And Click on the element in LeftNav
      | entranceExamsOne |
      | setupTwo         |
      | entranceExamsTwo |

    And User delete item from Dialog Content
      | <nameInput> |

    Then Success message should be displayed

    Examples:
      | nameInput   |
      | yasinExam14 |
      | yasinExam16 |
      | yasinExam17 |
      | yasinExam18 |
      | yasinExam19 |