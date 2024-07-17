/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulararrayqueue;

/**
 *
 * @author ramma
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CircularArrayQueue<Integer> intqueue = new CircularArrayQueue<>();
        
        intqueue.queue(1);
        intqueue.queue(2);
        intqueue.queue(3);
        intqueue.queue(4);
        
        System.out.println(intqueue.toString());
        System.out.println(intqueue.size());
        System.out.println("first = " + intqueue.first());
        
        intqueue.dequeue();
        System.out.println(intqueue.toString());
    }
    
}
