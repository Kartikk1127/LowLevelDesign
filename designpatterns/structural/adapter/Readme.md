# Adapter Pattern
Structural design patterns focus on classes and objects to form larger components.

## What is it?
It is a structural design pattern that allows two incompatible interfaces to work with each other. It acts as a bridge between the interface a client expects and the actual interface of an existing class.

## Real life analogy
Chargers(Indian chargers would not fit in us charger ports)- what to do?  
You'll buy an adapter which will be put into us charger port. This is exactly how **Adapter Pattern** works.

## When to use?
1. When we want to use an existing class but its interface does not make the one we need.
2. We want to reuse legacy code without modifying it.
3. You are integrating third party APIs on external services.

## Pros
1. Code reusability.
2. Code extensibility
3. Minimises changes to client code.
4. Helps with integrating third party.

## Cons
1. Adds extra layer of abstraction.
2. Can lead to overuse of adapters making the system harder to understand.

## Real product use cases
1. Logging Framework
2. Cloud Providers
3. Payment Gateway