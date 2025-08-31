# Deadlock and Prevention Techniques

## What is a deadlock?
A deadlock is a situation in multithreaded application where two or more threads are blocked forever, each waiting for the other to release the lock.  

## Four Coffman conditions for deadlock
If all 4 of these below conditions hold try simultaneously, a deadlock is bound to happen
1. Mutual Exclusion : Only one thread can own a resource at a time.
2. Hold and Wait : A thread holds one resource and waits for another.
3. No preemption : A resource cannot be forcefully taken from a thread.
4. Circular Wait : A closed chain of thread exists, each waiting for a resource occupied by the next.

**Prevention**: Break at-least one of the above conditions to get rid of deadlock.

### Classic Problem : Dining Philosophers
5 philosophers sit around a table. Each need two forks to eat. If every philosopher picks up their left fork at the same time, no one can pick up the right one which is a **deadlock**

### Deadlock prevention techniques
1. Lock ordering (Breaks circular wait)
2. Using tryLock() with timeout (Breaks hold and circuit)
3. Minimize nested locking (Breaks hold and circuit)
4. Recovery strategies (more relevant to DBs)
   1. Wait and Die Scheme : When a thread requests a lock held by another thread, the db accesses the relative priority. If the requesting thread has higher priority, it waits, otherwise it dies.
   2. Wound-wait Scheme : If the requesting thread has a higher priority, it wounds the lower priority thread to release the lock. 

### Final Words
1. Deadlocks are hard to debug and often happen under load.
2. Use thread dumps to detect deadlock in real applications. 