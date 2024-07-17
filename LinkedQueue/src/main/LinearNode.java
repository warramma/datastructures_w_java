/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ramma
 */
public class LinearNode<T> {
    private T element;
    private LinearNode<T> next;
    
    public LinearNode(T elem){
        element = elem;
        next = null;
    }
    public void setElement(T elem){
        element = elem;
    }
    public T getElement(){
        return element;
    }
    public void setNext(LinearNode<T> node){
        next = node;
    }
    public LinearNode<T> getNext(){
        return next;
    }
}
