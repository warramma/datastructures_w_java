/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramma
 */
public class Node<T> {
    private T element;
    private Node<T> next;
    private Node<T> previous;
    public Node (T element){
        element = null;
        next = null;
        previous = null;
    }
    public void setElement(T elem){
        element = elem;
    }
    public T getElement(){
        return element;
    }
    
    public void setNext(Node<T> node){
        next = node;
    }
    public Node<T> getNext(){
        return next;
    }
    
    public void setPrevoius(Node<T> node){
        previous = node;
    }
    public Node<T> getPrevious(){
        return previous;
    }
}
