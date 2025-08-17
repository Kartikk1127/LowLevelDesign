# Template Pattern

## What is it?
To enforce a flow.  
It is a behavioral design pattern that defines the skeleton of the algorithm in the superclass but let's subclass override specific steps of the algorithm without changing the structure.

## Key Steps
1. Template method(final method in base class)
2. Primitive operations(abstract methods)
3. Concrete operations(final or private methods )
4. Hooks(optional methods with default behaviour)

## When to use it?
1. You have multiple classes that follow the same overall algorithm, but differ in few steps.
2. You want to avoid code duplication of common steps.
3. You want to enforce a fixed order of steps.
4. You want to provide optional customizations.
5. Don't call us, we'll call you.

## Pros
1. Promotes code reusability by sharing the same steps.
2. Supports OCP.
3. Enforces a consistent flow.
4. Allows optional customization via hook methods.

## Cons
1. Inheritance based, limits flexibility.
2. Subclasses are tightly coupled with the base class.
3. Not ideal if algo varies, switch to strategy.
4. May result in too many subclasses.

## Real life examples
1. Payments flow
2. Game engines
3. Frameworks