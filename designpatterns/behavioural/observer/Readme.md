# Observer Pattern

## What is it?
It is a behavioural design pattern that defines one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated accordingly.

## Real Life example
YouTube notifications

## When to use it?
1. A change in one object should automatically notify others.
2. You want to decouple the subject from the observers.
3. Dynamic subscription/unsubscription.

## When to avoid?
1. You have too many observers (celebrity goes live with 10M followers) : use event queues, pub-sub system.
2. Tight control over notification timing is required(message broker to publish events).

It works really well with small number of observers, but to scale, we need to move to event driven architecture.

## Pros
1. Promotes loose coupling. Observers and subject are decoupled, they interact via an interface.
2. Open for extension
3. Dynamic subscription.
4. Encourages reusability.

## Cons
1. Unexpected update sequences.
2. Performance issues on scale.
3. Memory leaks
4. Difficult debugging.
5. Time timing coupling. 

## Real life use cases
Snapchat(one snap to 100+ people)
