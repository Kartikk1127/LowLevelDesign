# Visitor Pattern

## What is it?
It is a behavioural design pattern that lets you add new operations to the existing classes hierarchies without modifying the classes themselves.  
It achieves this by moving the logic of the operation into a separate class visitor.  
The element classes define an accept(visitor) method and the visitor class defines a visit(element) method for each element type.  
Key idea -> decouples operations from the objects on which they operate.  
Concept of double dispatch is used. During runtime, it resolves the item type and the item visitor type.  

## Product Example
1. Different types of product in shopping cart.

## When to use?
1. You have a complex object structure and want to perform unrelated operations on the elements.
2. You want to add operations without modifying the element classes.
3. You have to differentiate types of elements and each requires different logic.
4. Avoid if object structure change differently.

## Pros
1. Follows OCP
2. Clean separation of logic
3. Easy to add new operations
4. Helps centralise operations.

## Cons
1. Adding new element requires modifying Visitor interface.
2. Can be an overkill for simple object structure.
3. Double dispatch() might be unintuitive for some.
4. Element and visitor are tightly coupled.

## Real life use cases
1. E commerce.
2. Compilers and abstract system trees.