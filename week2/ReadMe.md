# Week 2 : 

## Operators : 
* ### Arithmetic Operator 
  * `+ , - , * , / , %`
* ### Unary Operators 
  * `+` , `-`
  * `++` , `--`
  * `!`
* ### Assignment Operators 
  * `=` 
  * `+=`, `-=`, `*=`, `\=`, `%=`
* ### Relational Operators  
  * `==` , `!=`
  * `>=` ,  `<=` ,  `>` ,  `<` 
* ### Logical Operators 
  * `&&` , `&`
  * `||` , `|`
  * `^` 

Logical AND `&&` and `&` 
| Expression 1   | Expression 2 |  Result |
|---             |    ---       |   ---   |
|  true |  true  | true  |
|  true |  false | false  |
|  false |  true | false  |
|  false |  false| false  |

---
Logical OR `||` and `|` 
| Expression 1   | Expression 2 |  Result |
|---             |    ---       |   ---   |
|  true |  true  | true  |
|  true |  false | true  |
|  false |  true | true  |
|  false |  false| false |

---
Logical exclusive OR `^` 
| Expression 1   | Expression 2 |  Result |
|---             |    ---       |   ---   |
|  true |  true  | false  |
|  true |  false | true  |
|  false |  true | true  |
|  false |  false| false |

---


## Type Casting
    Conversion of the data types 
    From larger data type to smaller data type  --> narrowing 
    or 
    From smaller data type to larger data type --> widening 

 - **Implicit casting** : this happen automatically by compiler 
 - **Explicit casting** : this is done by the programmer 
   - >There could be loss of data. 
  
For example : 
```java
int num = 100 ; 
// type widening example
// 100 as int will be autoimatically turn into 100L
//long lNum = 100 ;  
long lNum2 = num ; 

// type narowwing exmple : 

double price = 10.99d ; 
// store this variable value into an int 

// This does not compile , just like we can not put big cup coffee into small cup directly.
//int price2 =  10.99d ; 
int price2 = (int) 10.99d ;  // 10, we lose the .99 because int only store whole number 

// does this work 
// long num1 = 789.78; // compiler error because long data type only can hold whole number
long num1 = (long) 789.78 ;  // 789

```
## Conditional Statements 

A program will excecute from top to bottom from the first line of code in main method till last line of the code in main method unless it's specified otherwise with condition. 

```java
// The syntax
// single if statement with no else 
if( some condition here is true) {
    // execute some code here
}

// if else 
if( some condition here is true) {
     // execute some code here
} else {
 // execute some other code here
}

// if else if else

if( condition is true){
    // go here 
}else if( other condition is true){
    // go here
}else if( more condition true){
    // go here
}else{
    // if none of the above true come here
}

// nested if : if statement inside another if statement 

if( store has the milk){

    if(store has 2% milk){
        //go here and buy it 
    }else{
        // buy regular milk
    }
    
}else{
    // go to some other store
}


```
