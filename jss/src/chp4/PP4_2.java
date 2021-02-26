package chp4;

import java.util.Scanner;

/**
* Represents an integer evaluator of postfix expressions. Assumes
* the operands are constants.
*
* @see PP3_3 - Modified to verify expression/throw exception 
* @see PP4_2A - Modified to work with LinkedStack  
* @throws Exception is invalid expression is used
* @author Lewis and Chase
* @version 4.0
*/

public class PP4_2{
    private final static char ADD = '+';
    private final static char SUBTRACT = '-';
    private final static char MULTIPLY = '*';
    private final static char DIVIDE = '/';
    private LinkedStack<Integer> stack;

    /**Sets up this evaluator by creating a new stack */
    public PP4_2(){
        stack = new LinkedStack<Integer>();
    }
/**
* Evaluates the specified postfix expression. If an operand is
* encountered, it is pushed onto the stack. If an operator is
* encountered, two operands are popped, the operation is
* evaluated, and the result is pushed onto the stack.
* @param expr string representation of a postfix expression
* @return value of the given expression
*/
public int evaluate(String expr)
    throws Exception{
    
    int op1, op2,operandCount = 0, operatorCount =0, result = 0;
    String token;
    Scanner parser = new Scanner(expr);
    while (parser.hasNext()){
        token = parser.next();   
        if (isOperator(token)){
            operatorCount++;
            if (stack.size() >= 2){
                op2 = (stack.pop()).intValue();
                op1 = (stack.pop()).intValue();
            }else 
                throw new Exception("invalid expression");
            result = evaluateSingleOperator(token.charAt(0), op1, op2);
            stack.push(result);
        } else if(token.matches("[0-9]+")){
            operandCount++;
            stack.push(Integer.parseInt(token));

        } else
            throw new Exception("Invalid Expression");
          
    }
    if(operandCount - operatorCount == 1)
            return result;
    else 
        throw new Exception("Invalid Expression");
}
/**
* Determines if the specified token is an operator.
* @param token the token to be evaluated
* @return true if token is operator
*/
private boolean isOperator(String token){
    return ( token.equals("+") || token.equals("-") ||
            token.equals("*") || token.equals("/"));
}
/**
* Peforms integer evaluation on a single expression consisting of
* the specified operator and operands.
* @param operation operation to be performed
* @param op1 the first operand
* @param op2 the second operand
* @return value of the expression
*/
private int evaluateSingleOperator(char operation, int op1, int op2){
    int result = 0;
    switch (operation){
        case ADD:
            result = op1 + op2;
            break;
        case SUBTRACT:
            result = op1 - op2;
            break;
        case MULTIPLY:
            result = op1 * op2;
            break;
        case DIVIDE:
            result = op1 / op2;
    }
    return result;
}
}