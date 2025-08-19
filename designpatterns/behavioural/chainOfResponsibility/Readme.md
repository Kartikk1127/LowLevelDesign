# Chain Of Responsibility

## What is it?
It is a behavioural design pattern that transforms particular behaviour into standalone objects called handler.  
It allows a request to be passed along a chain of handlers. Each handler decides whether to process a request or to pass it to the next handler in the chain.  
This pattern decouples the sender of a request from its receivers, giving multiple objects a chance to handle the object.

## When to use?
1. When multiple objects can handle a request but the handler is not known beforehand.
2. When you want to decouple request, sender and receiver.
3. When you want to dynamically specify the chain of processing.

## Pros
1. Reducing coupling between sender and receiver.
2. Easy to add or remove handler without change.
3. Follows srp and ocp.
4. Dynamic control over handler execution sequence.

## Cons
1. May lead to performance issues if chain is too long.
2. Debugging can be harder due to flow being dynamic.
3. Risk of request not being handled at all.
4. Sequence is important, wrong order can break logic.

## Real Life example
1. Sign up example(email -> password -> otp -> username)
2. Via google (g-signup -> username)