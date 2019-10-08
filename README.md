# Java-Threads-Rendezvous
My implementation of the Rendezvous example

Any number of threads can attempt to enter a rendezvous.
Rendezvous ensures that threads do not run parallel to each other
to enforce mutual exclusion between threads that use same variables.
In this example we have two threads that start, but only one can "run" at a time
in the rendezvous, as shown in the image below.

![alt text](https://github.com/MenelaosK/Java-Threads-Rendezvous/blob/master/rendezvous.png)
