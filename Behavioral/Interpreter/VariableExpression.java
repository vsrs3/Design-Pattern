package Interpreter;

import java.util.Map;

public class VariableExpression implements Expression {
    private String variable;

    public VariableExpression(String variable) {
        this.variable = variable;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return context.get(variable);
    }
}