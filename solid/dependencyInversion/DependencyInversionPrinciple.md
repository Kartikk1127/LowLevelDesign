# Dependency Inversion
High level modules should not depend on low level modules.  
Both should depend on abstraction.  
Abstraction shouldn't depend on details.  
Details should depend on abstraction.

## Example
Recommendation Algorithm :
1. Recent recommendation
2. Trending
3. Genre

## Benefits of DIP
1. Loosely coupled to the interface.
2. Just add new implementation.
3. Easy to mock unit tests.
4. Abstraction controls flow.
5. Fully open/closed friendly.