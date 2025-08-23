# Multithreading and Concurrency

## What is a program?
A program is an executable file(chrome.exe)

## What is a process?
A process is an executing instance of a program.(Own memory, program counter, system resources)

## What is a Thread?
Thread is the smallest executable unit of a process. Threads are sub-tasks of processes. **All threads can access shared memory.**

## What are the cores in CPU?
A core is an individual processing unit inside your CPU-capable of executing instructions independently. Mini CPU inside CPU.  
CPU :: Kitchen.
No of cores :: No of chefs working in that kitchen.

## What is context switching?
Context switching is the process where the cpu stops executing one thread/process, save its state, and switches to another.

### When a context switch happens?
1. The CPU saves the current thread's content.
2. Loads the next thread's content.
3. Resumes execution of new thread.

_Switching is managed by the thread scheduler._
1. Takes time to save/load states.
2. Performance degradation due to high number of threads

## What is Multithreading?
Multithreading is the ability of the program to run multiple threads(independent tasks) concurrently, either truly in parallel(multi cores) or via context switching(single core).  
Each thread:
1. Runs independently
2. Shares the same memory space as the process. 
3. Every thread performs a specific task.

### Why do we use it?
1. Better performance.
2. Non Blocking
3. Resource Sharing
4. Scalability in backend services.

**Example**: Trip Matching,ETA calculation, Pricing(all being executed concurrently)

## What is concurrency?
1. Means multiple tasks making progress over time, but not necessarily at the same exact time.(Can depend on the resources alloted to the process)
2. Can work with one core.
3. Tasks **appear** to run at the same time.
4. Focus is on the structure on how to do many things.

## What is Parallelism?
1. Means multiple tasks executing at the exact same time.
2. Can work with Multiple cores.
3. Tasks **actually** run at the same time.
4. Focus is on execution, how to finish many things.

## Process
1. Independent program in execution.
2. Has its own memory.
3. Fully isolated.
4. Communication is complex(InterProcessCommunicationChannel(IPC), Sockets)
5. Overhead is heavy.
6. One process crash doesn't affect others.
7. Example: PostgreSQL

## Thread
1. Subunit of a process.
2. Shares memory with other threads in the process.
3. Not isolated.
4. Communication is easy(Shared memory).
5. Overhead is light.
6. One thread crash may affect other threads.
7. Example: Chrome tabs(when one Chrome tab hangs, it leads to other tabs also get hanged), uber backend.

## When to use thread?
1. Tasks need to share data.
2. Low overhead is important.
3. Tasks are part of the same logic.
4. High performance needed.
5. Tightly coupled behaviour.
6. Responsiveness is key.

## When to use Process?
1. Tasks require isolation.
2. One crash shouldn't affect others.
3. Security boundaries are needed.
4. Different tech stack.
5. Resource limits needed.
6. Used by different users.

## Fault Tolerance 
1. Ability of a system to continue operating correctly, even when some of the components fail.
2. It detects, contains and recovers from failures without affecting the user experience.
3. Real life example: You don't want your entire cellphone not working just because camera app is crashing.
4. Redundancy.
5. Graceful degradation.
6. Self-healing
7. Error containment(do not flash errors to user :: keep it to the backend)

## Isolation
1. It means keeping different components or tasks independently of each other so that actions or failures do not affect each other.
2. Design strategy to ensure that the components are sandboxed(isolated) from each other.
3. Memory separation, failure containment.
4. Security boundaries, predictable behaviour.