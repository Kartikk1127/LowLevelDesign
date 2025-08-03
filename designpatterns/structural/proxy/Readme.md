# Proxy Design Pattern

## What is it?
1. It is a structural design pattern.
2. Provides a surrogate or placeholder for another object to control access.
3. Think of it like a security guard who controls access to the real VIP.

**Key Idea** : Instead of interacting with the real object directly, clients interact with a proxy that acts on behalf of the real object.  
eg: Firewall, filtering, caching, protection, privacy and security.

## When  to use it?
1. When object creation is expensive, and you want to delay the operation.
2. When you want to control access to sensitive operations or add permission.
3. When interacting with remote objects.
4. When you need lazy loading in your system.

## Types of Proxy
1. Virtual proxy: Controls access to a resource that is expensive to create.
2. Protection Proxy: Controls access based on permissions.
3. Remote Proxy: Controls access to an object located remotely.
4. Smart Proxy: Adds extra behaviour during access.

## Pros
1. Performance optimization.
2. Access control
3. Lazy initialization
4. Added functionality

## Cons
1. Adds complexity
2. Delay in access of real object
3. Maintenance overhead