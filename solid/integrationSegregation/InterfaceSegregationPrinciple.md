# Interface Segregation Principle
Clients should not be forced to depend on interfaces they don't use.  
Don't create large, bloated interfaces.  
Break them into smaller and more specific ones.  

## Benefits of ISP
1. Offer modularity and flexibility.
2. Improves testability (easy to mock smaller interfaces).
3. Prevents accidental implementation of irrelevant methods.
4. Makes code easier to understand.

## When to apply ISP?
1. When your interface is doing too many things.
2. When some classes implementing an interface throw errors.