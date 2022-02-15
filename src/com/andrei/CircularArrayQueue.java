package com.andrei;

//This implementation optimize the ArrayQueue.java
// so that when adding and removing items in the queue,
// the empty space is reused instead of resizing the backing array.

import java.util.NoSuchElementException;

public class CircularArrayQueue {

    private Customer[] queue;
    private int front;
    private int back;

    public CircularArrayQueue(int capacity){
        queue = new Customer[capacity];
    }

    //this method is optimized
    public void add(Customer customer){
        if(size() == queue.length - 1){

            int numItems = size();

            Customer[] newArray = new Customer[2 * queue.length];

            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length-front, back );

            queue = newArray;

            front = 0;
            back = numItems;
        }

        queue[back] = customer;

        if(back < queue.length -1){
            back++;
        }else{
            back = 0;
        }
    }

    public Customer remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Customer customer = queue[front];
        queue[front] = null;

        front++;

        if(front == queue.length){
            front =0;
        }

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

        if(front <= back) {
            return back - front;
        } else {
            return queue.length - front + back;
        }
    }

    public void printQueue(){

        if(front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }else{
            for(int i = front; i< queue.length ; i++ ){
                System.out.println(queue[i]);

            }
            for(int i = 0; i < back; i++){
                System.out.println(queue[i]);
            }
        }

        System.out.println("*****");
    }

}
