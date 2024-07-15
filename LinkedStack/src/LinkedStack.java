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
    public LinkedStack(){
        top = null;
        count = 0;
    }

    @Override
    public void push(T elem) {
        Node<T> element = new Node<>(elem);
        Node<T> current = top;
        while(current.getNext()!=null){
            current = current.getNext();
        }
        current.setNext(element);
        element.setPrevious(current);
        element.setNext(null);
    }

    @Override
    public T pop() {
        Node<T> last = top;
        while(last.getNext()!=null){
            last = last.getNext();
        }
        Node<T> previous = last.getPrevious();
        previous.setNext(null);
        return last.getElement();
    }

    @Override
    public T peek() {
        Node<T> last = top;
        while(last.getNext()!=null){
            last = last.getNext();
        }
        return last.getElement();
    }

    @Override
    public void display() {
        Node<T> current = top;
        while(current.getNext()!=null){
            System.out.print(current.getElement()+ " ");
        }
    }
    @Override
    public void displayreverse(){
        Node<T> last = top;
        while(last.getNext()!= null){
            last=last.getNext();
        }
        while(last.getPrevious()!=null){
            System.out.print(last.getElement() + " ");
        }
    }
}
