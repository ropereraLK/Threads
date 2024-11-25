ExecutorService

Concurrency API introduces the ExecutorService, which creates and manages threads for you. 

(1) Obtain an instance of an ExecutorService interface.
(2) Send the service tasks to be processed. 

The framework includes numerous useful features, such as thread pooling and scheduling.

Introducing the Single-Thread Executor

With a single-thread executor, results are guaranteed to be executed in the order in which
they are added to the executor service