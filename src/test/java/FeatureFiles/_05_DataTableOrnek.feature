Feature:Datable Ornek

  Scenario: Users List
    When Write usernma "yasin"
    And  Write username Password "yasin" and "1234"
    And Write username DataTable
      | yasin  |
      | mehmet |
      | ayse   |
      | halime |
    And Write username and password as DataTable
      | yasin  | 1234 |
      | mehmet | 2324 |
      | ayse   | 4545 |
      | kaya   | 4554 |