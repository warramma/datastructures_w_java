/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramma
 */
public interface StackADT<T> {
    public void push(T elem);
    public T pop();
    public T peek();
    @Override
    public String toString();
    public boolean isEmpty();
    public int size();
}
