package postfix;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramma
 */
import stack.ArrayStack;
import java.util.Scanner;

public class Postfix<T> {
    ArrayStack<Integer> integers = new ArrayStack<>();
    ArrayStack<Character> operators = new ArrayStack<>();
    public void loadExpression(String expression){
        String token;
        Scanner read = new Scanner(expression);
        while(read.hasNext()){
            token=read.next();
            if(isOperator(token)){
                operators.push(token.charAt(0));
            }else{
                integers.push(Integer.valueOf(token));
            }
        }
    }
    public void displayExpression(){
        integers.displayStack();
        operators.displayStack();
        System.out.println();
    }
    
    private boolean isOperator(String token){
        boolean result = false;
        if(token.equals("+") || token.equals("-") || token.equals("/") || token.equals("x")){
            result = true;
        }
        return result;
    }
}
