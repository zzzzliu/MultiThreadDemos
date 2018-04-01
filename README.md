# MultiThreadDemos
Several Java Multithreading demos I played with these days.

## countDownLatchDemo
Use `CountDownLatch` and `ExecutorService` threadpool in this case. Basically, the main program creates 100 threads with the `newCachedThreadPool()`, and for each thread, the `countDown()` is executed. In this case, the `SampleThread` has to wait until all `WorkingThreads` has been terminated. 
A typical result is shown below:
```
SampleThread started!
pool-1-thread-6  started, #6 execution
pool-1-thread-4  started, #4 execution
pool-1-thread-1  started, #1 execution
pool-1-thread-5  started, #5 execution
pool-1-thread-7  started, #7 execution
pool-1-thread-3  started, #3 execution
pool-1-thread-8  started, #8 execution
pool-1-thread-2  started, #2 execution
pool-1-thread-9  started, #9 execution
pool-1-thread-10 started, #10 execution
pool-1-thread-11 started, #11 execution
pool-1-thread-12 started, #12 execution
pool-1-thread-13 started, #13 execution
pool-1-thread-14 started, #14 execution
pool-1-thread-15 started, #15 execution
pool-1-thread-16 started, #16 execution
pool-1-thread-17 started, #17 execution
pool-1-thread-18 started, #18 execution
pool-1-thread-19 started, #19 execution
pool-1-thread-20 started, #20 execution
pool-1-thread-21 started, #21 execution
pool-1-thread-22 started, #22 execution
pool-1-thread-23 started, #23 execution
pool-1-thread-24 started, #24 execution
pool-1-thread-25 started, #25 execution
pool-1-thread-6  end
pool-1-thread-26 started, #26 execution
pool-1-thread-27 started, #27 execution
pool-1-thread-6  started, #30 execution
pool-1-thread-28 started, #28 execution
pool-1-thread-29 started, #29 execution
pool-1-thread-30 started, #31 execution
pool-1-thread-31 started, #32 execution
pool-1-thread-32 started, #33 execution
pool-1-thread-33 started, #34 execution
pool-1-thread-34 started, #35 execution
pool-1-thread-35 started, #36 execution
pool-1-thread-36 started, #37 execution
pool-1-thread-37 started, #38 execution
pool-1-thread-38 started, #39 execution
pool-1-thread-39 started, #40 execution
pool-1-thread-40 started, #41 execution
pool-1-thread-4  end
pool-1-thread-41 started, #42 execution
pool-1-thread-4  started, #44 execution
pool-1-thread-42 started, #43 execution
pool-1-thread-1  end
pool-1-thread-43 started, #45 execution
pool-1-thread-5  end
pool-1-thread-44 started, #46 execution
pool-1-thread-1  started, #48 execution
pool-1-thread-5  started, #50 execution
pool-1-thread-46 started, #49 execution
pool-1-thread-45 started, #47 execution
pool-1-thread-47 started, #51 execution
pool-1-thread-47 end
pool-1-thread-49 started, #53 execution
pool-1-thread-46 end
pool-1-thread-1  end
pool-1-thread-43 end
pool-1-thread-42 end
pool-1-thread-41 end
pool-1-thread-5  end
pool-1-thread-37 end
pool-1-thread-36 end
pool-1-thread-35 end
pool-1-thread-45 end
pool-1-thread-34 end
pool-1-thread-33 end
pool-1-thread-31 end
pool-1-thread-30 end
pool-1-thread-48 started, #52 execution
pool-1-thread-29 end
pool-1-thread-6  end
pool-1-thread-27 end
pool-1-thread-24 end
pool-1-thread-23 end
pool-1-thread-32 end
pool-1-thread-22 end
pool-1-thread-38 end
pool-1-thread-21 end
pool-1-thread-39 end
pool-1-thread-20 end
pool-1-thread-40 end
pool-1-thread-19 end
pool-1-thread-4  end
pool-1-thread-18 end
pool-1-thread-44 end
pool-1-thread-16 end
pool-1-thread-25 end
pool-1-thread-17 end
pool-1-thread-26 end
pool-1-thread-15 end
pool-1-thread-28 end
pool-1-thread-14 end
pool-1-thread-13 end
pool-1-thread-12 end
pool-1-thread-11 end
pool-1-thread-10 end
pool-1-thread-7  end
pool-1-thread-9  end
pool-1-thread-3  end
pool-1-thread-2  end
pool-1-thread-8  end
pool-1-thread-50 started, #54 execution
pool-1-thread-51 started, #55 execution
pool-1-thread-7  started, #60 execution
pool-1-thread-13 started, #64 execution
pool-1-thread-14 started, #65 execution
pool-1-thread-26 started, #68 execution
pool-1-thread-17 started, #69 execution
pool-1-thread-21 started, #79 execution
pool-1-thread-24 started, #84 execution
pool-1-thread-27 started, #85 execution
pool-1-thread-31 started, #89 execution
pool-1-thread-8  started, #56 execution
pool-1-thread-2  started, #57 execution
pool-1-thread-3  started, #58 execution
pool-1-thread-33 started, #90 execution
pool-1-thread-35 started, #93 execution
pool-1-thread-36 started, #94 execution
pool-1-thread-9  started, #59 execution
pool-1-thread-30 started, #88 execution
pool-1-thread-1  started, #100 execution
pool-1-thread-11 started, #62 execution
pool-1-thread-38 started, #80 execution
pool-1-thread-12 started, #63 execution
pool-1-thread-15 started, #67 execution
pool-1-thread-50 end
pool-1-thread-44 started, #72 execution
pool-1-thread-23 started, #83 execution
pool-1-thread-40 started, #76 execution
pool-1-thread-20 started, #77 execution
pool-1-thread-39 started, #78 execution
pool-1-thread-32 started, #82 execution
pool-1-thread-6  started, #86 execution
pool-1-thread-29 started, #87 execution
pool-1-thread-34 started, #91 execution
pool-1-thread-4  started, #74 execution
pool-1-thread-19 started, #75 execution
pool-1-thread-18 started, #73 execution
pool-1-thread-25 started, #70 execution
pool-1-thread-10 started, #61 execution
pool-1-thread-7  end
pool-1-thread-51 end
pool-1-thread-5  started, #96 execution
pool-1-thread-14 end
pool-1-thread-45 started, #92 execution
pool-1-thread-22 started, #81 execution
pool-1-thread-16 started, #71 execution
pool-1-thread-28 started, #66 execution
pool-1-thread-48 end
pool-1-thread-26 end
pool-1-thread-49 end
pool-1-thread-43 started, #99 execution
pool-1-thread-42 started, #98 execution
pool-1-thread-41 started, #97 execution
pool-1-thread-37 started, #95 execution
pool-1-thread-24 end
pool-1-thread-21 end
pool-1-thread-17 end
pool-1-thread-13 end
pool-1-thread-31 end
pool-1-thread-27 end
pool-1-thread-8  end
pool-1-thread-2  end
pool-1-thread-3  end
pool-1-thread-33 end
pool-1-thread-35 end
pool-1-thread-9  end
pool-1-thread-36 end
pool-1-thread-30 end
pool-1-thread-11 end
pool-1-thread-38 end
pool-1-thread-1  end
pool-1-thread-12 end
pool-1-thread-15 end
pool-1-thread-44 end
pool-1-thread-23 end
pool-1-thread-40 end
pool-1-thread-20 end
pool-1-thread-39 end
pool-1-thread-32 end
pool-1-thread-6  end
pool-1-thread-29 end
pool-1-thread-34 end
pool-1-thread-4  end
pool-1-thread-19 end
pool-1-thread-18 end
pool-1-thread-25 end
pool-1-thread-10 end
pool-1-thread-5  end
pool-1-thread-45 end
pool-1-thread-22 end
pool-1-thread-16 end
pool-1-thread-28 end
pool-1-thread-43 end
pool-1-thread-42 end
pool-1-thread-41 end
pool-1-thread-37 end
SampleThread end!
```
As previously discussed, the `SampleThread` starts first but ends last. Besides, the `number of execution` is always guaranteed to be larger or equal to the `thread number`, this is because the `CachedThreadPool` helps us create/save/reuse threads dynamically.

## deadLock
3 accounts trying to transfer money to each other. However, this process will create a loop, i.e. A -> B -> C -> A. Since each trasfer thread has to get the lock of both `in` account and `out` account, the loop will cause dead lock.

Below is a typical result of `DeadLockTest`:
```
Tom has money: 3000
Jerry has money: 3000
Cory has money: 3000

TOMTOJERRY Start
CORYTOTOM Start
JERRYTOCORY Start
CORYTOTOM gets lock of in account(Cory)
TOMTOJERRY gets lock of in account(Tom)
JERRYTOCORY gets lock of in account(Jerry)
```
All 3 threads get the lock of their respective `in` account, and trying to get the lock of `out` account. No one can execute one more step.

Below is a typical result of `GoodTest`:

```
Tom has money: 3000
Jerry has money: 3000
Cory has money: 3000

JERRYTOCORY Start
CORYTOTOM Start
TOMTOJERRY Start
JERRYTOCORY gets lock of OUT account(Cory)
TOMTOJERRY gets lock of OUT account(Jerry)
TOMTOJERRY gets lock of IN account(Tom)
TOMTOJERRY finishs transfering
JERRYTOCORY gets lock of IN account(Jerry)
JERRYTOCORY finishs transfering
CORYTOTOM gets lock of IN account(Cory)
CORYTOTOM gets lock of OUT account(Tom)
CORYTOTOM finishs transfering

Tom has money: 2800
Jerry has money: 3100
Cory has money: 3100
```
To deal with the deadlock loop, we forced each thread to get lock by the increasing order of the account, no matter which one is `in` account and which one is `out` account. In this example, `Cory` -> `Jerry` -> `Tom`. 

If Tom wants transfer money to Jerry, he has to wait the lock of `Jerry` to be released, then he get the lock `Jerry`, then he get the lock of `Tom`. In previous example, he get `Tom` first then `Jerry`.

## productorAndConsumer
According to Wikipeida the Producer-Consumer Problem is defined as:
```
In computing, the producer–consumer problem (also known as the bounded-buffer problem) is a classic example of a multi-process synchronization problem. The problem describes two processes, the producer and the consumer, who share a common, fixed-size buffer used as a queue. 
```

In our example, the `Producer` and `Consumer` share a same `Basket` whose size is strictly `10`. Every time the `Producer` produces a new `Bread`, they add it into the `Basket`, and every time the `Consumer` is hungry, they take one `Bread` from the `Basket`. If the `Basket` is full, the `Producer` cannot add anymore `Breads`. If the `Basket` is empty, the `Consumer` cannot eat anymore.

A typical result is shown below:
```
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #1, still have 1 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #1, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #2, still have 1 breads
Produces Bread #3, still have 2 breads
Produces Bread #4, still have 3 breads
Produces Bread #5, still have 4 breads
Produces Bread #6, still have 5 breads
Produces Bread #7, still have 6 breads
Produces Bread #8, still have 7 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #2, still have 6 breads
Consumes Bread #3, still have 5 breads
Consumes Bread #4, still have 4 breads
Consumes Bread #5, still have 3 breads
Consumes Bread #6, still have 2 breads
Consumes Bread #7, still have 1 breads
Consumes Bread #8, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #9, still have 1 breads
Produces Bread #10, still have 2 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #9, still have 1 breads
Consumes Bread #10, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #11, still have 1 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #11, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #12, still have 1 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #12, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #13, still have 1 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #13, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #14, still have 1 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #14, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #15, still have 1 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #15, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #16, still have 1 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #16, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #17, still have 1 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #17, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #18, still have 1 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #18, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #19, still have 1 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #19, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #20, still have 1 breads
Produces Bread #21, still have 2 breads
Produces Bread #22, still have 3 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #20, still have 2 breads
Consumes Bread #21, still have 1 breads
Consumes Bread #22, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #23, still have 1 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #23, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #24, still have 1 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #24, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #25, still have 1 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #25, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #26, still have 1 breads
Produces Bread #27, still have 2 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #26, still have 1 breads
Consumes Bread #27, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #28, still have 1 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #28, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #29, still have 1 breads
Produces Bread #30, still have 2 breads
Produces Bread #31, still have 3 breads
Produces Bread #32, still have 4 breads
Produces Bread #33, still have 5 breads
Produces Bread #34, still have 6 breads
Produces Bread #35, still have 7 breads
Produces Bread #36, still have 8 breads
Produces Bread #37, still have 9 breads
Produces Bread #38, still have 10 breads
Tell Producer Thread, the basket is full, enter wait()!!!
Consumer Thread awakes from the wait() in poll()
Consumes Bread #29, still have 9 breads
Consumes Bread #30, still have 8 breads
Consumes Bread #31, still have 7 breads
Consumes Bread #32, still have 6 breads
Consumes Bread #33, still have 5 breads
Consumes Bread #34, still have 4 breads
Consumes Bread #35, still have 3 breads
Consumes Bread #36, still have 2 breads
Consumes Bread #37, still have 1 breads
Consumes Bread #38, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Producer Thread awakes from the wait() in add()
Produces Bread #39, still have 1 breads
Produces Bread #40, still have 2 breads
Produces Bread #41, still have 3 breads
Produces Bread #42, still have 4 breads
Produces Bread #43, still have 5 breads
Produces Bread #44, still have 6 breads
Produces Bread #45, still have 7 breads
Produces Bread #46, still have 8 breads
Produces Bread #47, still have 9 breads
Produces Bread #48, still have 10 breads
Tell Producer Thread, the basket is full, enter wait()!!!
Consumer Thread awakes from the wait() in poll()
Consumes Bread #39, still have 9 breads
Consumes Bread #40, still have 8 breads
Consumes Bread #41, still have 7 breads
Consumes Bread #42, still have 6 breads
Consumes Bread #43, still have 5 breads
Consumes Bread #44, still have 4 breads
Consumes Bread #45, still have 3 breads
Consumes Bread #46, still have 2 breads
Consumes Bread #47, still have 1 breads
Consumes Bread #48, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Producer Thread awakes from the wait() in add()
Produces Bread #49, still have 1 breads
Produces Bread #50, still have 2 breads
Produces Bread #51, still have 3 breads
Produces Bread #52, still have 4 breads
Produces Bread #53, still have 5 breads
Produces Bread #54, still have 6 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #49, still have 5 breads
Consumes Bread #50, still have 4 breads
Consumes Bread #51, still have 3 breads
Consumes Bread #52, still have 2 breads
Consumes Bread #53, still have 1 breads
Consumes Bread #54, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Produces Bread #55, still have 1 breads
Produces Bread #56, still have 2 breads
Produces Bread #57, still have 3 breads
Produces Bread #58, still have 4 breads
Produces Bread #59, still have 5 breads
Produces Bread #60, still have 6 breads
Produces Bread #61, still have 7 breads
Produces Bread #62, still have 8 breads
Produces Bread #63, still have 9 breads
Produces Bread #64, still have 10 breads
Tell Producer Thread, the basket is full, enter wait()!!!
Consumer Thread awakes from the wait() in poll()
Consumes Bread #55, still have 9 breads
Consumes Bread #56, still have 8 breads
Consumes Bread #57, still have 7 breads
Consumes Bread #58, still have 6 breads
Consumes Bread #59, still have 5 breads
Consumes Bread #60, still have 4 breads
Consumes Bread #61, still have 3 breads
Consumes Bread #62, still have 2 breads
Consumes Bread #63, still have 1 breads
Consumes Bread #64, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Producer Thread awakes from the wait() in add()
Produces Bread #65, still have 1 breads
Produces Bread #66, still have 2 breads
Produces Bread #67, still have 3 breads
Produces Bread #68, still have 4 breads
Produces Bread #69, still have 5 breads
Produces Bread #70, still have 6 breads
Produces Bread #71, still have 7 breads
Produces Bread #72, still have 8 breads
Produces Bread #73, still have 9 breads
Produces Bread #74, still have 10 breads
Tell Producer Thread, the basket is full, enter wait()!!!
Consumer Thread awakes from the wait() in poll()
Consumes Bread #65, still have 9 breads
Consumes Bread #66, still have 8 breads
Consumes Bread #67, still have 7 breads
Consumes Bread #68, still have 6 breads
Consumes Bread #69, still have 5 breads
Consumes Bread #70, still have 4 breads
Consumes Bread #71, still have 3 breads
Consumes Bread #72, still have 2 breads
Consumes Bread #73, still have 1 breads
Consumes Bread #74, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Producer Thread awakes from the wait() in add()
Produces Bread #75, still have 1 breads
Produces Bread #76, still have 2 breads
Produces Bread #77, still have 3 breads
Produces Bread #78, still have 4 breads
Produces Bread #79, still have 5 breads
Produces Bread #80, still have 6 breads
Produces Bread #81, still have 7 breads
Produces Bread #82, still have 8 breads
Produces Bread #83, still have 9 breads
Produces Bread #84, still have 10 breads
Tell Producer Thread, the basket is full, enter wait()!!!
Consumer Thread awakes from the wait() in poll()
Consumes Bread #75, still have 9 breads
Consumes Bread #76, still have 8 breads
Consumes Bread #77, still have 7 breads
Consumes Bread #78, still have 6 breads
Consumes Bread #79, still have 5 breads
Consumes Bread #80, still have 4 breads
Consumes Bread #81, still have 3 breads
Consumes Bread #82, still have 2 breads
Consumes Bread #83, still have 1 breads
Consumes Bread #84, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Producer Thread awakes from the wait() in add()
Produces Bread #85, still have 1 breads
Produces Bread #86, still have 2 breads
Produces Bread #87, still have 3 breads
Produces Bread #88, still have 4 breads
Produces Bread #89, still have 5 breads
Produces Bread #90, still have 6 breads
Produces Bread #91, still have 7 breads
Produces Bread #92, still have 8 breads
Produces Bread #93, still have 9 breads
Produces Bread #94, still have 10 breads
Tell Producer Thread, the basket is full, enter wait()!!!
Consumer Thread awakes from the wait() in poll()
Consumes Bread #85, still have 9 breads
Consumes Bread #86, still have 8 breads
Consumes Bread #87, still have 7 breads
Consumes Bread #88, still have 6 breads
Consumes Bread #89, still have 5 breads
Consumes Bread #90, still have 4 breads
Consumes Bread #91, still have 3 breads
Consumes Bread #92, still have 2 breads
Consumes Bread #93, still have 1 breads
Consumes Bread #94, still have 0 breads
Tell Consumer Thread, the basket is empty, enter wait()!!!
Producer Thread awakes from the wait() in add()
Produces Bread #95, still have 1 breads
Produces Bread #96, still have 2 breads
Produces Bread #97, still have 3 breads
Produces Bread #98, still have 4 breads
Produces Bread #99, still have 5 breads
Produces Bread #100, still have 6 breads
Consumer Thread awakes from the wait() in poll()
Consumes Bread #95, still have 5 breads
Consumes Bread #96, still have 4 breads
Consumes Bread #97, still have 3 breads
Consumes Bread #98, still have 2 breads
Consumes Bread #99, still have 1 breads
Consumes Bread #100, still have 0 breads

End of the demo
```

Both the `Producer` and the `Consumer` has the mission of 100 `Breads`. If the thread find the situation is not satisfactory to it to produce/consume more `Breads`, it will invoke `wait()` and immediately exit the synchronized block and give up the key of the `Basket`. At the same time, the other thread has already been `notified` before so it can take charge of the key. This thread will `awake` from the `wait()` function which caused its previous sleep. 

At the end of each synchronized blocks (`add()` and `poll()` function in our example), we `notify` all threads that we are going to get out of the synchronized block, its their time to take charge of the key. Basically, there will be multiple threads that are able to get the key of the `Basket`, the JVM just randomly pick one. This is the reason why the `Producer` can produce again and again but the `Consumer` cannot eat a single bread. The `Consumer` just not lucky enough.

## theAtomicClass
This demo test the `Atomicity` of `volatile`. There is a field `count` to be marked as `static volatile` in `intWrapper` class. Every thread can invoke the static function `plus()` to add `count` by 1 **based on its current value**.

In `nonAtomicTest`, we create 1000 threads, and for every thread, we invoke `plus()`. The result shows below:

```
993
```
This indicates the non-atomicity of `volatile`. In fact, the `i++` command has 3 steps: 

1. Fetch value of `i` from memory
2. Add 1 to the value
3. Write back to the memory

Imagine the scenario:

<table>
    <tr>
        <th>Thread 1</th>
        <th>Thread 2</th>
    </tr> 
    <tr>
        <td>
            1. Fetch value of <i>i</i> from memory <br>
                <p style="margin-left: 30px">i = 6 in memory</p>
            2. Add 1 to the value <br>
                i = 7 in cache<br>
        </td>
        <td></td>
    </tr> 
    <tr>
        <td></td>
        <td>
            1. Fetch value of <i>i</i> from memory <br>
                i = 6 in memory<br>
            2. Add 1 to the value <br>
                i = 7 in cache<br>
            3. Write back to the memory <br>
                i = 7 in memory
        </td>
    </tr>
        <td>
            3. Write back to the memory <br>
                i = 7 in memory
        </td>
        <td></td>
</table>

This will cause two threads just increase `i` by 1, not 2.

To solve this problem, we can use `AtomicInteger` in this scenario, the `getAndIncrement()` function guarantees the atomicity of the variable. The result is always:

```
1000
```