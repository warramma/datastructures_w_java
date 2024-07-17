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
public interface LinkedQueueADT<T> {
    public void queue(T elem);
    public T dequeue();
    public T first();
    public int size();
    public boolean isEmpty();
    @Override
    public String toString();
}
