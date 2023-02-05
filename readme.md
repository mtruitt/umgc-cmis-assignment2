# Assignment 2: Inheritance and Encapsulation
Before attempting this project, be sure you have completed all the reading assignments, non-graded exercises, discussions, and assignments to date.
Design and implement Java program as follows:

(1) There will be a Snack class with following attributes: id (combination of numbers and letters), size (values S, M, or L), and price

(2) There will be two child classes FruitSnack and SaltySnack with the following additional attributes:
- FruitSnack: It includes citrus fruit indication (value of this variable of is true or false). 
- SaltySnack: It includes nut snack indication (value of this variable of is true or false).

(3) The Snack class hierarchy must provide the following functionality:
- On creation, a snack instance must be given all attribute values except its price, which must be calculated
- Price is calculated as follows:
  - There is a flat fee of $19.99 for S snack, $29.99 for M snack, and $39.99 for L snack.
  - FruitSnack has an additional fee of $5.99 when it has a citrus fruit. Please add only a single citrus fruit, and no preventing coding is required to limit adding more than one.
  - SaltySnack has an additional fee of $4.50 when it has a nut snack. Please add only a single nut snack no preventing coding is required to limit adding more than one.
- Each class must have a method to return or display the class’s values to the console

(4) Implement OrderSystem class with main method with following functionality:
  - Order a snack and after ordering it will display the snack type, its size, id and price
  - Exit program

(5) Your classes must be coded with correct encapsulation: private/protected attributes, get methods, and set methods

(6) There should be appropriate overloading and overriding methods

(7) OrderSystem should take advantage of the inheritance properties (e.g., use Snack variable regardless which snack instance as appropriate)

(8) The prices for S, M, L, citrus fruit, nut snack can be hard coded in the program.
### Style and Documentation:
Make sure your Java program is using the recommended style such as:
- Javadoc comment with your name as author, date, and brief purpose of the program
- Comments for variables and blocks of code to describe major functionality
- Meaningful variable names and prompts
- Class names are written in upper CamelCase
- Constants are written in All Capitals
- Use proper spacing and empty lines to make code human readable