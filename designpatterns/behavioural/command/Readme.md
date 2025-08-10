# Command Pattern

## What is it?
It is a behavioral design pattern that turns a request into a separate object, allowing you to decouple the code that issues the request from the code that performs it.  
This lets you add features like undo, redo, logging and dynamic command execution without changing the core business logic.

## Four key components
1. Client -> sets Invoker -> command.execute() -> receiver
2. Invoker
3. Command
4. Receiver

## Product Example 
Remote Control

## What happens without Command Pattern?
1. Tight coupling between invoker and receiver.
2. No reusability or abstraction for actions.
3. Undo/Redo or any other operation is poorly supported.
4. Hard to implement BATCH(Night mode) actions.
5. No plug and play flexibility.
6. Scalability breaks down.

## When to use it?
1. You need to decouple the sender from the receiver.
2. You need undo/redo support.
3. You want batch operations.
4. You want plug-in architecture.
5. You want to create macro or composite commands.

## Pros
1. Decouples sender and receiver.
2. Supports undo/redo functionality.
3. Easily extensible and re-usable.

## Cons
1. Increases number of classes.
2. Can add unnecessary complexity for simpler tasks.
3. Requires careful design for undo/redo. 