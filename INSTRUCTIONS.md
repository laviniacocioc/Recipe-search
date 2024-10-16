=> In this exercise I created a program that allows for searching for recipes based on their name, cooking time, or the name of an ingredient. 
The program should read the recipes from a file that the user provides. 

=> Each recipe consists of three or more rows in a recipe file. The first row is for the name of the recipe, the second the cooking time (an integer), and the third and possibly following rows list the ingredients used in the recipe. An empty row follows the last ingredient row. There can be many recipes in a single file. Below, an example file containing recipes is described.

Sample output
Pancake dough
60
milk
egg
flour
salt
butter

Meatballs
20
ground meat
egg
breadcrumbs

Tofu rolls
30
tofu
rice
water
carrot
cucumber
avocado
wasabi


=> Reading and listing recipes
=> Below it is assumed that the example recipes description are stored in the file recipes.txt.

Sample output
File to read: recipes.txt

Commands:
list - lists the recipes
stop - stops the program

Enter command: list

Recipes:
Pancake dough, cooking time: 60
Meatballs, cooking time: 20
Tofu rolls, cooking time: 30

Enter command:  stop

=> Finding recipes by name

Sample output
File to read: recipes.txt

Commands:
list - lists the recipes
stop - stops the program
find name - searches recipes by name

Enter command: list

Recipes:
Pancake dough, cooking time: 60
Meatballs, cooking time: 20
Tofu rolls, cooking time: 30

Enter command: find name
Searched word: roll

Recipes:
Tofu rolls, cooking time: 30

Enter command:  stop

=> Searching for recipes by cooking time
=> Next, I implemented the possibility to find recipes based on their cooking time. This was done with the command find cooking time, after which the user is asked for the longest acceptable cooking time. The program reacts by printing all the recipes whose cooking times don't exceed the cooking time given by the user (so equal or less time).

Sample output
File to read: recipes.txt

Commands:
list - lists the recipes
stop - stops the program
find name - searches recipes by name
find cooking time - searches recipes by cooking time

Enter command: find cooking time
Max cooking time: 30

Recipes:
Meatballs, cooking time: 20
Tofu rolls, cooking time: 30

Enter command: find cooking time
Max cooking time: 15

Recipes:

Enter command: find name
Searched word: roll

Recipes:
Tofu rolls, cooking time: 30

Enter command:  stop

=> Finding recipes based on their ingredients
=> Finally, I added the functionality to search for recipes based on their ingredients. This is done by choosing the command find ingredient, after which the user is asked for a string. The program then prints all the recipes that contain the specified string. The given string must match exactly the ingredient that is searched for (e.g. "ugar" will return different results than "sugar").

Sample output
File to read: recipes.txt

Commands:
list - lists the recipes
stop - stops the program
find name - searches recipes by name
find cooking time - searches recipes by cooking time
find ingredient - searches recipes by ingredient

Enter command: find cooking time
Max cooking time: 30

Recipes:
Meatballs, cooking time: 20
Tofu rolls, cooking time: 30

Enter command: find ingredient
Ingredient: sugar

Recipes:
Pancake dough, cooking time: 60

Enter command: find ingredient
Ingredient: egg

Recipes:
Pancake dough, cooking time: 60
Meatballs, cooking time: 20

Enter command: find ingredient
Ingredient: gg

Recipes:

Enter command:  stop
