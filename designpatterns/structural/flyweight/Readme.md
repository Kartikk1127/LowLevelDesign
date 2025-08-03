# Flyweight Pattern
For optimizing the memory consumption

## What is it?
1. It is a structural design pattern which is used to minimise memory usage or computational cost by sharing as much data as possible with similar objects.
2. Think of it as a data re-use pattern, if many objects are similar, store their common data in one place and share it across instances.
3. Intrinsic(_shared_) and extrinsic(_unique_) attributes.

## Product example
Google Maps

## When to use?
1. When you need to create a large number of similar objects.
2. When memory and performance optimizations are crucial.
3. When the object's intrinsic properties could be shared independently of its extrinsic properties.

## Pros
1. Greatly reduces the memory usage when there are a lot of similar objects
2. Improves performance in resource constrained environments.
3. Faster object creation.

## Cons
1. Adds complexity(factory+management)
2. Harder to debug because of shared state
3. Can lead to tight complexity between flyweight and client code if not designed well.

## Example of real world apps that uses it
1. Google maps
2. Uber