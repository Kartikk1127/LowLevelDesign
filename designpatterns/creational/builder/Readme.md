# Builder Pattern

## What is it?
It is a creational pattern used to construct complex objects step by step. It separates the object construction from it's representation, allowing the same construction process to create different representations.

### Problem :: Burger Meal
1. choose bun type
2. add patty
3. add cheese
4. add sides
5. add drink
6. add toppings

## Telescoping constructor Anti Pattern 
This is fine if the number of parameters stays less, however if there are a lot of parameters it becomes nearly impossible to create constructor for them. Hence it is an anti pattern.  
This is because Java doesn't give you an option to set the parameter's value by default. You can't have a constructor having 3 parameters and while building the object you pass just two arguments thinking the last parameter would be considered by its default value. No, it doesn't happen like that in java.


## When to use it?
1. When object has multiple fields.
2. Immutability is preferred.
3. You want readable, maintainable object creation.

## When to avoid it?
1. Your class is with simply 1-2 fields.
2. You don't need object customization or immutability.

## Pros
1. Avoids constructor telescoping.
2. Ensures immutability.
3. Clean, readable object creation.
4. Great for complex configurations

## Cons
1. Slightly tough to set it up.
2. Overkill for small cases.
3. Separate builder class needed.

## Real world products
1. Lombok library
2. Amazon's cart.