# app_stack_API
The java API for the app_stack framework
API for mobile and Desktop development

This allows you to manage data and variables eisier and with less hastle
this API allows for 3 base methods .add(int pos, int value);, .pop(int pos);, and .mod(int[] positions, int[]
values , int[] types);
These methods allow developers to have a way to store variables and values quickly without sacrificing performace.
An ideal use for this is in lightweight desktop applications on mobile apps where less resources are avaible.

*HOW TO USE*
```
//declare the object

stack stackIdentifier = new stack();
//next call the methods on the object

//here are examples for each of the avaible methods
//This is the .add() methods, it takes 2 arguments int pos (Place to add value) and int value (The value)

//use it like this
stackIdentifier.add(5, 12);
//or use variables
int posistion = 5
int data = 12;
stackIdentifier.add(position, data);






//The .pop() method is used to remove objects from the stack give it a position for int pos
stackIdentifier.pop(5);
//or use variables
int position = 5;
stackIdentifier.pop(position) 
;

//THE .mod() method is a work in PROGRESS
