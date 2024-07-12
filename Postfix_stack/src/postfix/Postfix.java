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
    ArrayStack<Float> numbers = new ArrayStack<>();
    ArrayStack<Character> operators = new ArrayStack<>();
    public void loadExpression(String expression){
        String token;
        Scanner read = new Scanner(expression);
        while(read.hasNext()){
            token=read.next();
            if(isOperator(token)){
                operators.push(token.charAt(0));
            }else{
                numbers.push(Float.valueOf(token));
            }
        }
    }
    public void displayExpression(){
        numbers.displayStack();
        operators.displayStack();
        System.out.println();
    }
    public Float evaluateExpression(){
        while (numbers.getTop() != 1){
            char operator = operators.pop();
            float num2 = numbers.pop();
            float num1 = numbers.pop();
            switch (operator) {
                case '+':
                    numbers.push(num1 + num2);
                    break;
                case '-':
                    numbers.push(num1 - num2);
                    break;
                case '/':
                    if(num1 > 0 && num2 == 0){
                        String error = "Error: " + num1 + " / " + num2 + " is undefined";
                        System.out.println(error);
                    }
                    numbers.push(num1 / num2);
                    break;
                case 'x':
                    numbers.push(num1 * num2);
                    break;
                default:
                    break;
            }
        }
        
        return numbers.peek();
    }
    private boolean isOperator(String token){
        boolean result = false;
        if(token.equals("+") || token.equals("-") || token.equals("/") || token.equals("x")){
            result = true;
        }
        return result;
    }
}
