# Facade Pattern

## Problem
Client dealing with all the services by itself. We don't want that.

## What is it?
It is a structural design pattern that provides a simplified, unified interface to a set of interfaces in a subsystem. A layer that could be put between the client and the system.

## Product Example
Movie Booking System

## When to use?
1. Subsystems are complex (too many classes, too many dependencies)
2. You want to provide a simpler API to outer world.
3. You want to reduce coupling between subsystems and client code.
4. You want to layer your architecture cleanly.

## Pros
1. Lightweight coupling
2. Flexibility
3. Simplifies client design
4. Promotes layered architecture
5. Better testability

## Cons
1. Fragile coupling
2. Hidden complexity
3. Runtime errors
4. Difficult to trace
5. Violation of SRP

**Tip** : Always try to depend on abstraction(interfaces) rather than concrete classes to minimise tight coupling.