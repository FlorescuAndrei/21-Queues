package com.andrei;

public class MainCircularArrayQueue {

    public static void main(String[] args) {

        Customer jj = new Customer("Jane", "Jones");
        Customer jd = new Customer("John", "Doe");
        Customer ms = new Customer("Mary", "Smith");
        Customer mw = new Customer("Mike", "Wilson");
        Customer be = new Customer("Bill", "End");

        CircularArrayQueue queue = new CircularArrayQueue(5);

        queue.add(jj);
        queue.add(jd);
        queue.remove();
        queue.add(ms);
        queue.remove();
        queue.add(mw);
        queue.remove();
        queue.add(be);
        queue.remove();
        queue.add(jj);
        
        queue.printQueue();


    }
}
