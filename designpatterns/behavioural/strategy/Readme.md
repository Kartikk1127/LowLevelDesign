# Strategy Pattern

## What is it?
It is a behavioural deign pattern that defines a family of algorithms, puts each of them in a separate class and makes their objects interchangeable.  
It is about how we change the behaviour of an object at runtime without changing its class. 

## When to use ?
1. You have multi-interchangeable algos.
2. You want to follow the OCP.
3. You want to avoid if-else or switch.
4. You want to isolate unit testing behaviour-wise.
5. You want to select behaviour at runtime.

## Pros
1. Supports OCP.
2. Easy to add new behaviours.
3. Behaviour changes at runtime.
4. Encourages composition over inheritance.

## Cons
1. Can lead to many small classes.
2. Client must know about all available strategies.
3. Overhead of using interfaces.
4. Slightly more complex than if-else.

 