### Make Change Project

#### Description
This is a program that will calculate change for a purchase.

#### Lessons Learned

#####Misplaced curly braces makes for strange and unwanted results.
I closed my code block for the if conditional loop to generate change after the separate if-else prompt loop to notify the user if they had given too much, or not enough money. This resulted in the "pennies" prompt being displayed to the user even if they were receiving zero pennies. Also nesting the if-else prompt in the if conditional change checking loop resulted in the program returning a negative value to the user if they had not given the correct amount of requested tender.

######Methods can make things messy
It is okay to work where you are at. I wanted to include methods by lacing my conditional loops each in their own methods, but the errors it was creating were generating messy code and not producing the desired results. I decided it is more important this time to get the assignment requirements down in the way I know best and to try again later. I will be studying today and trying to organize the code into methods like I had hoped but overall treating this as a happy little experiment.

After taking a break I was able to return to this program and successfully organize the different actions into methods. I learned that changing a variable rom a local to a static variable and placing it in the class code block allows for all of the methods to recognize the variables and use them.

#####Casting
This week in class I was taught that I could convert a double to an int with casting. I also was aware that I was at risk of losing accuracy if I did not proceed with caution. When it comes to money absolutely no one wants to be shorted, and that includes the customer and the register. Googling I found a method called Math.round(), this method can be utilized to round a number to the nearest integer. Initially, I was going to use this method but decided later that by making sure the precedence is correct and shifting the decimal place I could change a double to an integer and maintain accuracy. To make sure the precedes were correct I put the int inside parenthesis with the value I wanted to add or multiply it by, this allowed the computer to know to do that operation first and then to promote the double to an int. Throughout the creation of this program, Eclipse prompted me when the data types did not match and it was easy to then apply this skill over and over again.over and over again.

#### Technologies Used
Casting -
Math.round
IfElse
Terminal
Atom
Eclipse
Google
