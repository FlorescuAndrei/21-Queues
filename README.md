# 21-Queues
Queues. Array Implementation. Circular  implementation

Queue  
-  Abstract data type  
-  FIFO 
-  add – also called enqueue - add item to the end (back)  
-  remove – also called dequeue - removes the top item (front) 
-  peek – gets the top item  


Ideal backing data structure: Doubly Linked List O(1).  
We wrap the linked list and expose only the queue specific methods add, remove, peek.  

When backing with array if array is not resize => O(1), else O(n). 

Circular Array Queue: when we add and remove items, the back reaches the array length and the array is resize even if it has empty space at the beginning. So, to upgrade, we create a circular implementation. 

Queues practical example:
-  Producer - Consumer: the producer send messages , the consumer recive messages and process in the order that they were sent. 


Deque Interface short for Double Ended Queue pronounced dec. 
A Deque supports insertion and removal at both ends.  



[BACK TO START PAGE](https://github.com/FlorescuAndrei/Start.git)
