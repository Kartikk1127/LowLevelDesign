# Iterator Pattern

## What is it?
It is a behavioral design pattern that extracts the traversal behaviour of a collection into a separate design pattern. It traverses the elements without exposing the underlying operation.  
It encapsulates all the traversal details. Several iterators can go through the same collection at the same time.

## Real life example
YouTube Playlist

## When to use it?
1. You want to traverse a collection without exposing its internal structure.
2. You need multiple ways to traverse a collection.
3. You want a unified way to traverse different types of collection.
4. You want to decouple iteration logic from collection logic.

## Example of where do we use it?
It's used almost in every data structure. 

## Pros
1. Hides internal structure of the collection.
2. Unified way to traverse.
3. Supports multiple traversal algorithm.
4. SRP and OCP followed.

## Cons
1. Adds extra classes and interfaces.
2. Might be overkill for simple DS.
3. External iteration is needed.

 