/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulararrayqueue;

/**
 *
 * @author ramma
 * @param <T>
 */
public class CircularArrayQueue<T> implements QueueADT<T>{
    private int front, rear, count;
    private T[] queue;
    private final int DEFAULT_CAPACITY = 100;
    
    public CircularArrayQueue(){
        queue = (T[])(new Object[DEFAULT_CAPACITY]);
        front = rear = 0;
        count = 0;
    }
    @Override
    public void queue(T elem) {
        if(size()== queue.length){
            expandCapacity();
        }
        queue[rear] = elem;
        count++;
        rear = (rear + 1) % queue.length;
    }

    @Override
    public T dequeue() {
        T result = queue[front];
        count--;
        front = (front + 1) % queue.length;
        return result;
    }

    @Override
    public T first() {
        return queue[front];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }
    @Override
    public String toString(){
        String result = "";
        int current = front;
        while(current != rear){
            result = result + queue[current] + " ";
            current = (current + 1) % queue.length;
        }
        return result;
    };
    
    private void expandCapacity(){
        T[] larger = (T[])(new Object[queue.length * 2]);
        for(int scan = 0; scan < count; scan++){
            larger[scan] = queue[front];
            front = (front+1) % queue.length;
        }
        front = 0;
        rear = count;
        queue = larger;
    }
}
