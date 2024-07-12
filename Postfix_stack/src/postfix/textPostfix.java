/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postfix;

/**
 *
 * @author ramma
 */
public class textPostfix {
    public static void main(String[] args){
        Postfix expression = new Postfix();
        expression.loadExpression("3 + 5 + 6");
        expression.displayExpression();
        System.out.println(expression.evaluateExpression());
        
        Postfix pemdas = new Postfix();
        pemdas.loadExpression("3 - 4 x 5");
        pemdas.displayExpression();
        System.out.println(pemdas.evaluateExpression());
    }
}
