package com.andrei;

public class MainArrayQueue {

    public static void main(String[] args) {

        Customer jj = new Customer("Jane", "Jones");
        Customer jd = new Customer("John", "Doe");
        Customer ms = new Customer("Mary", "Smith");
        Customer mw = new Customer("Mike", "Wilson");

        Customer be = new Customer("Bill", "End");

        ArrayQueue queue = new ArrayQueue(10);



        queue.add(jj);
        queue.add(jd);
        queue.add(ms);
        queue.add(mw);
        queue.add(be);

        queue.printQueue();

        queue.remove();
        queue.remove();
        queue.printQueue();

        System.out.println(queue.peek());
        System.out.println("*****");


        queue.remove();
        queue.remove();
        queue.remove();

//        queue.remove();

        queue.add(mw);
        queue.printQueue();

    }
}
