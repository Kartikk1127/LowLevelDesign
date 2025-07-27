# Singleton Pattern

## What is this?
The singleton pattern ensures that the class has only one instance throughout the application's lifecycle and provides a global access point to that instance.

## Why do we need this?
1. Should exist only once due to global state, resources constraints or logical reasoning.
2. Need to be accessed from different parts of the system.

## Prime Examples
1. Database connections
2. Logging
3. Analytics.

## How do we implement?
1. Eager loading :: [Click Here](eager/EagerSingleton.java)
2. Lazy loading :: [Click Here](lazy/LazySingleton.java)

### Three ways to make your singleton class thread safe
1. Synchronized keyword. :: [Click Here](synchronize/Synchronized.java)
2. Double-checked locking. :: [Click Here](doublechecked/DoubleCheckedLocking.java)
3. Bill Pugh Singleton :: [Click Here](billpugh/Main.java)

### Pros
1. Cleaner implementation
2. Guarantees one instances.
3. Provides to maintain a global resource
4. Supports Lazy loading.

### Cons
1. Used with parameters and confused with factory.
2. Hard to write unit tests.
3. Classes using it are tightly coupled to it.
4. Special cases to avoid race conditions.
5. violates the SRP