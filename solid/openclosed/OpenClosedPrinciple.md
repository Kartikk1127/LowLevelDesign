# Open Closed Principle
Software entities (classes, modules & functions) should be open for extension, but closed for modification.  
You should be able to add new behaviour for a class or module without changing the existing code.

## When you should apply OCP?
1. When you have business rules that are likely to expand.
2. When you are building a plugin system.
3. When your codebase is becoming a "God Class" with a lot of conditions.

## Misconceptions around OCP

### Misconceptions
1. OCP means never touching old code.
2. OCP leads to more classes, so it is an overkill.
3. It makes code harder to read.

### Reality
1. You can refactor old code to support OCP.
2. Extra classes are fine if they improve maintainability.
3. It makes harder only if not done right, you gain flexibility.