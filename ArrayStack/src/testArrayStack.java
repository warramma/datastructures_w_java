/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramma
 */

public class testArrayStack {
    public static void main(String[] args){
        ArrayStack<Integer> intstack = new ArrayStack<>();
        
        intstack.push(5);
        intstack.push(4);
        intstack.push(3);
        
        System.out.println("peek: " + intstack.peek());
        
        System.out.println("pop: " + intstack.pop());
        System.out.println("peek: " + intstack.peek());
    }
}
