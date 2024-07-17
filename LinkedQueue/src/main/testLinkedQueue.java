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
public class testLinkedQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedQueue<Integer> intqueue = new LinkedQueue<>();
        
        intqueue.queue(5);
        intqueue.queue(10);
        intqueue.queue(1);
        
        System.out.println(intqueue.toString());
        System.out.println("first = " + intqueue.first());
        System.out.println(intqueue.size());
        
        
        intqueue.dequeue();
        System.out.println(intqueue.toString());
        System.out.println(intqueue.size());
        System.out.println("first = " + intqueue.first());
        
    }
    
}
