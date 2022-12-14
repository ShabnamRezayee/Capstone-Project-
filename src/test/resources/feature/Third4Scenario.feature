@books
Feature: Retail Page Feature   - for this feature you have to have an existing account
  Background: 
    Given User is on Retail website
    And User click  on MyAccount
    When User click on Login
    And User enter username "khjamal@gmail.com" and password "123456789"
    And User click on Login button
    Then User should be logged in to MyAccount dashboard
  @RgisterAsAnAffiliate
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company | website              | taxID | paymentMethod | payeeName |
      | tekbook | tekschoolbook@us.com |  2525 | Cheque        | ajmal     |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message
  @EditYourAffiliate
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | BOA      | 123456789 |    234567 | Tek         |     123456789 |
    And User click on Continue button
    Then User should see a success message
  @EditYourAccount
  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstName | lastName | Email               | Telephone |
      | khan    | jamal   | khjamal@gmail.com |    123456789 |
    And User click on Continue button
    Then User should see a message 'Success: Your account has been successfully updated'

