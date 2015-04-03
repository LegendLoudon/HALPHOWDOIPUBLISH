Project 3 - Candy Machine


First step will have a menu-driven system

- Create a menu in an endless while loop.

- Selection of a menu item is to be in a switch
statement.

- Each number in the menu will list an item for sale,
insert coins, and change return

- when "insert money" (one of your menu items) is
selected, go to a method, insertMoney(), to insert a
coin and update the amount of credit in the machine,
and increment each coin inserted.


When an item is selected in your switch statement to
buy

- checks to see if enough money was deposited

- checks to see if item is not sold out

- dispense item

- decrement that particular item count variable from
the machine

- for this part of the project, do not give the
customer's change until they select "change return"
from the menu



vend() - create 2 vend methods (i.e. overloaded
methods). One will take a String as an argument and one
will take an int

- if the item is sold out, (in other words the else
part of the check) pass a string to the vend() method
and have it print out the "sold out" message.

- if the item is not sold out, pass the cost of the
item being sold to the vend() method and have it
decrement the credit the customer has in the machine.


2 switches are recommended -

4 global variables

credit - amount of total money the customer has in the
machine

nickels

dimes

quarters



insertMoney() method - this will ask the customer to
insert coins. Have a switch-case nickel, dime, quarter,
dollar bill and add each denomination to the credit
variable



changeReturn() NON-STATIC method - this will be called
when the customer wants change. You will pass it
nothing, give it the appropriate amount of quarters,
dimes, and nickels (no dollars). It will return a
string with nothing in it if everything is fine.
However, if you run out of a certain coin, short-change
the customer, put his credit at zero, and return a
String from the changeReturn method to be displayed by
the calling method. The String being returned from
changeReturn() should inform the customer he's just
been swindled.


// example of an item which has been out of stock since
the late 1970's

Credit: $0.00

0. Insert Money

1. Twix 95 cents

2. Snickers $1.00

3. Marathon Bar 25 cents

4. Change Return

Selection: 3

Please insert more money for this item.


// example of giving change

Credit: $0.75

0. Insert Money

1. Twix 95 cents

2. Snickers $1.00

3. Marathon Bar 25 cents

4. Change Return

Selection: 4

Amount owed to you: $0.75

Coins returned to you:

quarters: 3

dimes: 0

nickels: 0



Credit: $0.00

0. Insert Money

1. Twix 95 cents

2. Snickers $1.00

3. Marathon Bar 25 cents

4. Change Return

Selection:

// example of inserting money

Credit: $0.00

0. Insert Money

1. Twix 95 cents

2. Snickers $1.00

3. Marathon Bar 25 cents

4. Change Return

Selection: 0

1. Insert nickel

2. Insert dime

3. Insert quarter

4. Insert dollar bill

3


Credit: $0.25

0. Insert Money

1. Twix 95 cents

2. Snickers $1.00

3. Marathon Bar 25 cents

4. Change Return

Selection:



// example of the machine ripping off the customer if
there are not enough quarters

Credit: $0.75

0. Insert Money

1. Twix 95 cents

2. Snickers $1.00

3. Marathon Bar 25 cents

4. Change Return

Selection: 4

Amount owed to you: $0.75

Coins returned to you:

quarters: 2

dimes: 0

nickels: 0

Not enough changed returned to you, TOO BAD!


Credit: $0.00

0. Insert Money

1. Twix 95 cents

2. Snickers $1.00

3. Marathon Bar 25 cents

4. Change Return

Selection:
