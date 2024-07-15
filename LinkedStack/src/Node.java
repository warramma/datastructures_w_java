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
    public Node (T elem){
        element = elem;
        next = null;
        previous = null;
    }
    public void setElement(T elem){
        this.element = elem;
    }
    public T getElement(){
        return this.element;
    }
    
    public void setNext(Node<T> node){
        this.next = node;
    }
    public Node<T> getNext(){
        return this.next;
    }
    
    public void setPrevious(Node<T> node){
        this.previous = node;
    }
    public Node<T> getPrevious(){
        return previous;
    }
}
