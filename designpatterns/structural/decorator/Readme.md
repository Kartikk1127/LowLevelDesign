# Decorator Pattern

## What is it?  
It is a structural design pattern that allows you to add new behaviour to objects dynamically at runtime without modifying their original structure.

## Key Takeaways
1. Abstract classes can have constructors and they do get executed when a subclass is instantiated.
2. Each decorator is a layer, like wrapping gift boxes and each one just adds behaviour to the one it wraps.
3. The decorator pattern works like a call stack where behaviour is accumulated as calls.

## When to use it?
1. You need to add responsibilities to objects dynamically.
2. You want to avoid the explosion of subclasses.
3. You want to follow OCP.
4. You want reusable and composable behaviour.
5. You need layered step by step enhancements.

## Pros
1. Follows OCP.
2. Runtime flexibility to compose features.
3. Avoids subclass explosion
4. Promotes single responsibility for each add-on.

## Cons
1. Can result in small classes.
2. Stack trace debugging is difficult.
3. Overhead of multiple wrapping class.
4. Developers must understand decorator flow.

## Real world products
1. Google Docs(Text, Bold, Italics, Size)