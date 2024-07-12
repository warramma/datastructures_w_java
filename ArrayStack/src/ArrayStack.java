/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramma
 */
public class ArrayStack<T> {
    private int top;
    private T[] stack;
    private final int MAX = 100;
    
    public ArrayStack(){
        //this is a default constructor, no parameters
        top = 0;
        stack = (T[])(new Object[MAX]);
    }
    
    public void push(T newElement){
        stack[top] = newElement;
        top++;
    }
    
    public T pop(){
        T result = stack[top-1];
        top--;
        return result;
    }
    
    public T peek(){
        return stack[top-1];
    }
    
    public void displayStack(){
        for(int i = 0; i < top; i++){
            System.out.println(stack[i]);
        }
    }
}
