# Liskov Substitution Principle
If S is a subtype of T, then objects of T may be replaced with objects of S without altering any of the desirable properties of that program.  

In simple terms, if class B is a subclass of class A, then you should be able to use B anywhere you used A, and the behaviour should remain constant.

## Why does LSP matter?
Lsp violation leads to:
1. Broken functionality when subclasses replaces parent.
2. Fragile inheritance hierarchies.
3. Bugs that are hard to detect.
4. Client code being tightly coupled to specific types.

## How to spot LSP violations?
1. Subclasses throwing unexpected exceptions for base class methods.
2. Subclass changes behaviour so much, that the code fails.

## Key Principles
1. Design by contract.
2. Avoid over inheritance, use composition.
3. Refactor early.