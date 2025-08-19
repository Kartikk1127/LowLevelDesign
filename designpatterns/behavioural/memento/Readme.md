# Memento Pattern

## What is it?
It is a behavioral pattern that allows an object to capture its internal state and retore it later without violating encapsulation.  
It has 3 components:
1. Originator : the object whose state we want to save.
2. Memento: An object that stores the state of the originator.
3. Caretaker: The object responsible for saving and restoring the mementos. 

Think of it as uno/redo mechanism.

It delegates creating the state snapshots to the actual owner of the state. Hence, the original class can make the snapshots since it has full access to its own state.

## Product Example
1. Resume Editor
2. Code Editor 

## When to use?
1. You need to implement undo/redo functionality.
2. You want to preserve the encapsulation of the object's state.
3. You are handling non-trivial state history management.

## Pros
1. Preserves encapsulation.
2. Simplifies undo/redo functionality.
3. Cleaner separation of concerns.

## Cons
1. Can be memory intensive if storing too many states.
2. Might introduce caretaker complexity.
3. Needs careful management of old mementos.