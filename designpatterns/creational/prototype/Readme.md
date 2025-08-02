# Prototype pattern

## What is it?
It is a creational design pattern used when the creation of an object is costly or time-consuming,  and we want to clone objects instead of creating new ones from scratch.  
We do a **deep cloning**

## When do we use it?
1. When object creation is expensive(db calls, expensive computations)
2. When a system should be independent on how it's products are created.
3. When you need to create a large number of similar objects with slight modifications.

### Shallow copy
1. only copies references to objects inside the classes
2. If internal objects are mutable and shared, both original and clone affect each other.

### Deep copy
1. Recursively copies everything inside.
2. Safer but heavier.

### Pros
1. Faster object creation
2. Reduces subclassing
3. Runtime object configuration
4. Great for ui/ux cloning.

### Cons
1. Deep cloning can be hard.
2. Difficult with circular reference.
3. Might introduce bugs.