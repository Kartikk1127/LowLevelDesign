# Mediator Pattern

## Problems
For a document collaborating problem let's say Google Docs:
1. Each user has references to every other user.
2. Adding/removing user breaks the structure.
3. Hard to orchestrate roles (editor/viewer/commenter)
4. Difficult to manage permissions, states and notifications.

## What is it?
It is a behavioural design pattern that centralizes complex communication between objects into single mediator object.  
It promotes loose coupling and organizes the interaction between components.

## Real life example
Air traffic control. 
Planes while landing connect with air traffic control system to notify them of their landing which then mediates to all other planes to not land.

Auction.

## When to use?
1. Multiple users or services interact but should remain decoupled.
2. You want to manage rules or permissions centrally.
3. You need flexible broadcasting, filtering or transformation of messages.

## Pros
1. Users don't need to know about other users.
2. Easy to manage user roles and access centrally.
3. Easier to test and extend.
4. Clean separation of business logic and interaction.

## Cons
1. Mediator can become complex overtime.
2. One point of failure.
3. Adds an abstraction layer.