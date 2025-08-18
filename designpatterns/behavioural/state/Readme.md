# State Pattern

## What is it?
 It is a behavioral design pattern that lets an object change its behaviour when its internal state changes.  
 It helps to encapsulate state specific logic into separate classes.  
 It also follows the OCP, state can be added without modifying the existing code.  
 
## Product Example
1. Food deliver app where the state changes from Order Placed -> Preparing -> Picking up shortly -> delivery partner assigned -> picked up -> on its way -> delivered.  

## When to use it?
1. Whenever the object's behaviour depends on its internal state.
2. State transitions are well-defined and finite.
3. You want to avoid complex if-else or switch case statements.
4. State transitions should be explicit.
5. You want each state to have its own behaviour and rules.

## State vs Strategy

### State
1. Changes the behaviour based on object's internal state.
2. States can be dependent as you can easily jump from one state to another.
3. It is about doing different things based on the state, hence the results may vary.
4. Workflow models, lifecycle processes, UI states.

### Strategy
1. Select an algorithm or behaviour at runtime based on context.
2. Are completely independent and are unaware of each other.
3. They can end up having the same result.
4. Algorithm selection, formatting, sorting.

## Pros 
1. Clean separation of concerns.
2. Easy to add new state.
3. OCP
4. Avoids huge if-else blocks.

## Cons
1. Adds more classes.
2. Slightly more complex setup.
3. Context needs to manage state behaviour.
4. Requires familiarity.

## Real life examples
1. Swiggy
2. ATM
3. Uber