# Single Responsibility Principle

## Definition: 
A class should have only 1 reason to change. This means that the class should have only one job, one responsibility, one purpose.
If a class takes more than one responsibility, these responsibilities become coupled, and changes to one might break the other.

## Why SRP matters?
Tightly coupling everything within the same class makes it hard to debug in case something breaks. Imagine you have a compiler that does:  
1. adds driver code
2. syntax processing
3. code run with the test cases.
4. store the output in DB.
5. return the necessary things.

If all this is put in a single class, on breaking you'll have to look at the entire logic to see where it broke. If it was with separate classes, we would exactly know where the issue occurred.  

## Benefits of SRP
1. Improved maintainability.
2. Better test coverage.
3. Lower risk in changes.
4. Reusable modules.

## Common mistakes when violating SRP
1. Putting DB logic  and business logic in same class.
2. UI code coupled with logic.

## Is SRP just for classes?
No. Functions can also be designed in a way that handles a single thing.