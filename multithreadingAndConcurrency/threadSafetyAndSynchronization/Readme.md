# Thread safety and Synchronization

## What is thread safety?
Thread safety means that a piece of code, object, or method behaves correctly and predictably when accessed by multiple threads at the same time, without corrupting data or producing incorrect results.  
Thread safety ensures correctness under concurrent access.  
**Example**: TUF+ purchase counter. A coupon code can be used by 1 user at a time. Once used, shouldn't be valid anymore but if two users are trying to use the coupon code at the same time the issue might occur if there isn't any thread safety in place.  

## Race condition with naive counter example
[Check this out](RaceConditionDemo.java)

## Synchronized keyword (methods vs blocks, object monitor lock)
**Concept** : Acquires an object monitor lock, allowing only one thread at a time.
**Fix it via** :
1. Synchronized Method: Simpler but locks the entire method. 
2. Synchronized Block: More fine-grained, locks only critical section.

### Monitor Lock
1. Every object in java has an intrinsic lock(monitor)
2. Synchronized acquires the lock on that object.
3. Only one thread can hold lock at that time.

## Volatile Keyword
Ensures visibility, not atomicity(single operation)  
1. Volatile keyword only ensures that the latest value of count is visible across threads.
2. count++ is still not atomic.
3. Use it only when one thread writes, other only read.(Stock trading platforms are a classic example)

## Core Guarantees of volatile
**Visibility** : Changes made by one thread are immediately visible to another thread.  
**No Caching** : Value is always read from and written to the main memory(not cached copy in CPU register).  
**No atomicity** : Does not make operations atomic.

## Atomic Variables(Atomic Integer, Atomic Boolean)(Compare and Set)
Instagram likes are a classic example.  
Both of them use compare and swap method at hardware level. It is lock free, and highly performant.

### CAS Concept
1. Think of it like "If value is what I expect, then set it to the new value".
2. Prevents race conditions without locking

**Pros**
1. Highly performant
2. Non-blocking

**Cons**
1. May fall under high contention(too many retries)

## What enables the atomicity?
The magic is in hardware-level lock-free instructions and java's unsafe class under the hood.  
Only one thread can win, and this is guaranteed by the atomicity at the hardware level.


| Feature / Aspect | `synchronized`                                                                       | `volatile`                                                               | `AtomicInteger`                                                                            |
|------------------|--------------------------------------------------------------------------------------|--------------------------------------------------------------------------|--------------------------------------------------------------------------------------------|
| **Atomicity**    | ✅ Guarantees atomic execution of block/method                                        | ❌ Does not guarantee atomicity for compound operations (e.g., increment) | ✅ Supports atomic operations (increment, decrement, compare-and-set)                       |
| **Visibility**   | ✅ Changes visible to all threads after block/method                                  | ✅ Guarantees visibility across threads                                   | ✅ Guarantees visibility across threads                                                     |
| **Blocking**     | ✅ Blocks other threads attempting same synchronized block/method                     | ❌ Non-blocking                                                           | ❌ Non-blocking, uses CAS (Compare-And-Swap)                                                |
| **Performance**  | ⚠ Can be slower due to blocking and context switching                                | ✅ Very fast, minimal overhead                                            | ✅ Faster than `synchronized` for simple atomic operations; may spin under high contention  |
| **Use cases**    | - Protect complex critical sections<br>- Multiple operations must be atomic together | - Flags / indicators<br>- Single read/write shared variable              | - Counters, sequence generators<br>- Increment/decrement or CAS operations without locking |


