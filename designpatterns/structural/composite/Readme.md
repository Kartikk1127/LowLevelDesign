# Composite Pattern

## What is it?
It is a structural design pattern that lets you compose objects into tree structures to represent part-whole hierarchies.  
You can treat a group of objects just like you would treat a single object.

## Real product example
1. Amazon shopping cart

## When to use it?
1. You have a hierarchical structure.
2. You want to treat individual and groups in the same way.
3. You want to avoid client side logic to differentiate leaf and composition.

## Pros
1. Uniformity, treats them in the same way
2. Extensible
3. Cleaner client code
4. Supports OCP

## Cons
1. Violates SRP on scale
2. Overkill for flat and simple structure
3. In tightly regulated systems, uniform treatment can hide important distinctions between item types.