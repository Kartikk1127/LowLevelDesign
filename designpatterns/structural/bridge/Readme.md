# Bridge Pattern

It is a structural design pattern that decouples an abstraction from its implementation so that they can vary independently.

## Real life analogy
Appliances and their remotes

## Product example
Streaming platform 

## When to use?
1. You have two dimensions.
2. You want to evolve independently.
3. You want to avoid class explosion.

## Pros
1. Decouples abstraction and implementation, changes in either side do not affect each other.
2. Avoids class explosion
3. Supports OCP
4. Ideal for cross-platform development
5. Improves maintainability and testing.

## Cons
1. Increased complexity in small scale systems.
2. Can be confused with other patterns.
3. Co-ordination needed if separate teams handle it.