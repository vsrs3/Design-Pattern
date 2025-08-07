package Interpreter;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        // Create expressions: x + y - 10
        Expression x = new VariableExpression("x");
        Expression y = new VariableExpression("y");
        Expression ten = new NumberExpression(10);
        
        Expression addExpression = new AddExpression(x, y);
        Expression finalExpression = new SubtractExpression(addExpression, ten);
        
        // Set up context
        Map<String, Integer> context = new HashMap<>();
        context.put("x", 20);
        context.put("y", 15);
        
        // Evaluate expression
        int result = finalExpression.interpret(context);
        System.out.println("Expression: x + y - 10");
        System.out.println("Where x = " + context.get("x") + ", y = " + context.get("y"));
        System.out.println("Result: " + result);
        
        // Change values and re-evaluate
        context.put("x", 5);
        context.put("y", 3);
        result = finalExpression.interpret(context);
        System.out.println("\nExpression: x + y - 10");
        System.out.println("Where x = " + context.get("x") + ", y = " + context.get("y"));
        System.out.println("Result: " + result);
    }
}