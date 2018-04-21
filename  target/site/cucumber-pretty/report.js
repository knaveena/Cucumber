$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E2E_Tests.feature");
formatter.feature({
  "line": 1,
  "name": "Automating the end to end test for a sample shopping website",
  "description": "",
  "id": "automating-the-end-to-end-test-for-a-sample-shopping-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User places an order by purchasing the first item from search",
  "description": "",
  "id": "automating-the-end-to-end-test-for-a-sample-shopping-website;user-places-an-order-by-purchasing-the-first-item-from-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@currentTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "The user has to be on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "The user selects dress in search bar",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Adds the item to the cart",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Checkouts the item from the mini cart icon",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter all the details for billing",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Selects the payment method as check",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Same delivery address as billing",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Place the order",
  "keyword": "And "
});
formatter.match({
  "location": "stepsTest.the_user_has_to_be_on_the_home_page()"
});
formatter.result({
  "duration": 4618973379,
  "status": "passed"
});
formatter.match({
  "location": "stepsTest.the_user_selects_dress_in_search_bar()"
});
formatter.result({
  "duration": 4665768021,
  "status": "passed"
});
formatter.match({
  "location": "stepsTest.adds_the_item_to_the_cart()"
});
formatter.result({
  "duration": 2173390946,
  "status": "passed"
});
formatter.match({
  "location": "stepsTest.checkouts_the_item_from_the_mini_cart_icon()"
});
formatter.result({
  "duration": 4781888589,
  "status": "passed"
});
formatter.match({
  "location": "stepsTest.enter_all_the_details_for_billing()"
});
formatter.result({
  "duration": 12880387687,
  "status": "passed"
});
formatter.match({
  "location": "stepsTest.selects_the_payment_method_as_check()"
});
formatter.result({
  "duration": 68068700,
  "status": "passed"
});
formatter.match({
  "location": "stepsTest.same_delivery_address_as_billing()"
});
formatter.result({
  "duration": 3083605960,
  "status": "passed"
});
formatter.match({
  "location": "stepsTest.place_the_order()"
});
formatter.result({
  "duration": 282444174,
  "status": "passed"
});
});