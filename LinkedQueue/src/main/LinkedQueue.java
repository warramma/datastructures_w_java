/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ramma
 * @param <T>
 */
public class LinkedQueue<T> implements LinkedQueueADT<T> {
    private LinearNode<T> first, last;
    private int count;
    
    public LinkedQueue(){
        first = last = null;
        count = 0;
    }
    
    @Override
    public void queue(T elem) {
        LinearNode<T> temp = new LinearNode<>(elem);
        if(count == 0){
            temp.setNext(null);
            first = last = temp;
        }
        else{
            temp.setNext(last);
            last = temp;
        }
        count++;
    }

    @Override
    public T dequeue() {
        T result = first.getElement();
        if(count == 1){
            first = last = null;
        }
        else{
            LinearNode<T> current = last;
            while(current.getNext()!= first){
                current = current.getNext();
            }
            current.setNext(null);
            first = current;
        }
        
        count--;
        return result;
    }

    @Override
    public T first() {
        return first.getElement();
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
        LinearNode<T> current = last;
        while(current != null){
            result = result + current.getElement() + " ";
            current = current.getNext();
        }
        result = result + "<- first";
        return result;
    };
}
