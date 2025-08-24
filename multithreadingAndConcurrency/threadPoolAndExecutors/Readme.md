# Thread Pools and Executors

## Why not create threads manually?
1. **Thread explosion** : OS cannot handle that many requests at the same time.
2. **Memory Issues** : Each thread takes ~1mb of memory stack by default.
3. **Thread leaks** : Created but never terminated properly.
4. **Context Switching** : CPU spends more time switching between threads than actually doing the work.

## Better Approach -- Use Thread Pools
Use a pool of worker threads, that are reused.
**Real life analogy** : Instead of hiring multiple chefs, use a fixed team to fulfill orders.

## Introduction to Executor framework
Java framework, it's a high level replacement for manually managing threads. It decouples :
1. Task submission(what you want to do)
2. Task execution(how and when it runs)

## Methods to submit task
1. execute(runnable)
   1. Fire and forget
   2. No result tracking.
2. submit(runnable/callable)
   1. You want to return a value
   2. You want to cancel or track task progress.

### Shutting down executors
1. shutdown() : No new tasks, waits for current tasks to complete.
2. shutdownNow() : Attempts to shut down all tasks immediately.

## Thread starvation and Fairness
When long-running tasks hog the threads, smaller/critical tasks get delayed.
**Fix** : Use priority queues, or separate pools.

## When to use(Fixed vs Cached vs Scheduled Thread pools)

### Fixed
1. We want exactly N threads.
2. We want to reuse them.
3. Predictable and Limited Bursty load.

### Cached
1. Creates new Threads as needed, reuses idle ones.

### Scheduled
1. Supports delays, repeating tasks.
2. For periodic tasks.