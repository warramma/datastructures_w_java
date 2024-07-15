/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramma
 */
public class LinkedStack<T> implements StackADT<T> {
    private Node<T> top;
    private int count;

    @Override
    public void push(T elem) {
        Node<T> temp = new Node<>(elem);
        temp.setNext(top);
        top = temp;
        count++;
    }

    @Override
    public T pop() {
        T result = top.getElement();
        top = top.getNext();
        count--;
        return result;
    }

    @Override
    public T peek() {
        return top.getElement();
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }
    
    @Override
    public String toString(){
        String result = "Stack: ";
        Node<T> current = top;
        while(current!=null){
            result = result + current.getElement() + " ";
            current = current.getNext();
        }
        return result;
    }
}
