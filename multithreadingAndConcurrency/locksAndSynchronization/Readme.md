# Locks and Synchronization mechanism

## What is the problem? (Book My Show example)

### Why not use synchronized to solve race conditions?
1. No timeout support
2. No explicit control
3. Can't interrupt a waiting thread
4. No fairness guarantee

## Lock and Mutex

### Lock
1. General terms for mutual exclusion.
2. Not always enforced
3. Synchronized
4. In programming, may allow another thread to unlock.
5. Real life :: Public washroom

### Mutex
1. A specific type of lock with ownership semantics
2. Only the thread that can acquire can release
3. Re-entrant locks(work like mutex)
4. Only the thread that locked it can unlock it.
5. Home.

## Re-entrant Lock(Fine grained control, fairness)

Use it when you want:
1. Explicit control over locking/unlocking
2. To try acquiring a lock without timeout
3. Fine-grained control without synchronized

## tryLock()
### What does it do?
1. Tries to acquire lock immediately.
2. If the lock is available, it acquires it and returns true.
3. If the lock is held by another thread, it returns false immediately.

## ReadWrite Lock(Read heavy data structure)
Example: Stock Trading Apps

1. Optimized for frequent reads and rare writes.
2. Multiple threads can read concurrently
3. Only one can write (no readers/writers allowed)
4. Use case: Stock market app
5. Read lock will block all writers, and they need to wait.
6. Write lock will block everyone.

## Semaphores (Limiting concurrent access)
It is a concurrency control primitive that is used to limit the number of threads accessing a shared resource.
**Real world problem** :: TUF+ account sharing.
**Solution** :: A tool that controls concurrent access to a shared resource and limit access to N users/device at any given time.

### What is semaphore?
1. Think of it like a token bucket.
2. It has a very fixed number of permits.
3. A thread can only proceed if it acquires a token.
4. Once done, it releases the token back.
5. Acquire, release, tryAcquire.
6. Example: DB Pool/Netflix account sharing

# Synchronization is not optional, it's infrastructure.


