# Creating and Managing Threads

1. Problem statement(place order -> send sms -> send email -> ETA)
2. Using Thread class(start()/run())
3. Runnable Interface(start()/run())
4. Using Callable and Future for result oriented tasks : Wait for results
5. Thread lifecycle flow.

## Note
1. Both thread class and runnable interface are fire and forget.

## Callable
It is a functional interface (like Runnable) introduced in Java 5 as part of the java.util.concurrent package.  
Unlike Runnable, it allows:
1. Returning a result.
2. Throwing checked exceptions.

## FutureTask
FutureTask is a concrete class that implements both Runnable and Future<V>
1. Bridges the gap between Callable and Threading

## Java Thread Lifecycle

### 1. NEW
- A thread object is created but **not yet started**.
- State: `Thread t = new Thread();`

➡️ Transition: Call `t.start()` → moves to **RUNNABLE**.

---

### 2. RUNNABLE
- The thread is **ready to run** and waiting for CPU time.
- Actual execution depends on the thread scheduler.

➡️ Transition:
- If CPU assigned → **RUNNING**
- If not → stays **RUNNABLE**

---

### 3. RUNNING
- The thread is actively executing its `run()` method.

➡️ Can transition to:
- **WAITING** → via `wait()`
- **TIMED_WAITING** → via `sleep(ms)`, `join(ms)`, `wait(ms)`
- **BLOCKED** → waiting to acquire a lock
- **TERMINATED** → finishes execution

---

#### 4. WAITING
- Thread is waiting **indefinitely** for another thread’s signal.
- Enters this state via:
    - `Object.wait()`
    - `Thread.join()` (without timeout)

➡️ Transition:
- Another thread calls `notify()` / `notifyAll()` → back to **RUNNABLE**

---

#### 5. TIMED_WAITING
- Thread is waiting for a **specified time**.
- Enters this state via:
    - `Thread.sleep(ms)`
    - `Object.wait(ms)`
    - `Thread.join(ms)`
    - `LockSupport.parkNanos()` / `parkUntil()`

➡️ Transition:
- Timeout expires → back to **RUNNABLE**
- Or notified → back to **RUNNABLE**

---

#### 6. BLOCKED
- Thread is waiting to acquire a **monitor lock**.
- Happens when another thread is already holding the lock.

➡️ Transition:
- Lock acquired → back to **RUNNABLE**

---

#### 7. TERMINATED (DEAD)
- The thread has finished executing.
- Cannot be restarted.

---
