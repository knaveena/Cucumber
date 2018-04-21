Feature: Automating the end to end test for a sample shopping website
@currentTest
Scenario: User places an order by purchasing the first item from search 
Given The user has to be on the home page
When The user selects dress in search bar
And Adds the item to the cart
And Checkouts the item from the mini cart icon
And Enter all the details for billing
And Selects the payment method as check
And Same delivery address as billing
And Place the order
