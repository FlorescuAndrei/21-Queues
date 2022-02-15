package com.andrei;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Customer[] queue;    //To do: use generics instead of customer.
    private int front;          // point to first element
    private int back;           // point to next available position

    public ArrayQueue(int capacity){
        queue = new Customer[capacity];
    }

    public void add(Customer customer){
        if(back == queue.length){
            Customer[] newArray = new Customer[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back++] = customer;
    }

    public Customer remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Customer customer = queue[front];
        queue[front] = null;

        front++;

        //if the queue is empty reset the queue
        if(size()==0){
            front = 0;
            back = 0;
        }

        return customer;
    }

    public Customer peek(){
        if(size() == 0){
            throw new NoSuchElementException();
        }

        return queue[front];
    }


    public int size (){
        return back - front;
    }

    public void printQueue(){

        for(int i = front; i < back; i++){
            System.out.println(queue[i]);
        }

        System.out.println("*****");
    }

}
