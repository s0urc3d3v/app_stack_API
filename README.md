# app_stack_API
The java API for the app_stack framework
API for mobile and Desktop development

This allows you to manage data and variables eisier and with less hastle
this API allows for 3 base methods .add(int pos, int value);, .pop(int pos);, and .mod(int[] positions, int[]
values , int[] types);
These methods allow developers to have a way to store variables and values quickly without sacrificing performace.
An ideal use for this is in lightweight desktop applications on mobile apps where less resources are avaible.

The base of this program is a series engine which can be understood like so 

.add() is repeptented by <sup>512</sup>∑<sub>n = 1</sub> m[n] = n

.pop() is repensened by <sup>512</sup>∑<sub>n = 1</sub> m[n] = null

.get() is reprensented by <sup>512></sup>∑<sub>n = 1</sub>m[n]

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


//The .get() method is for getting a value at a place

stackIndentified.get(5);
//or with variables
int n = 5;
stackIdentifier.get(n);
//CHECK FOR 0 as this is a FAIL
int get = 
stackIdentifier.get(5);
if (get != 0){
  int y = get
else{
  //ERROR

  
//THE .mod() method is a work in PROGRESS
```















follow me on [twitter](www.twitter.com/m3lbing)

