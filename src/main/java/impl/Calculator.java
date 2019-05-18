package impl;

import exception.CalculatorException;

public class Calculator {

    private boolean log;

    public int divide(int a, int b) throws CalculatorException {
        if (b == 0) {
            throw new CalculatorException("Division by zero");
        }
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int evaluate(String expression) {
        String[] tokens = expression.split(" ");
        int res;

        if (tokens.length != 3) {
            throw new CalculatorException("Invalid expression");
        }

        int a = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[2]);

        switch (tokens[1]) {
            case "+":
                res = sum(a, b);
                break;
            case "-":
                res = sub(a, b);
                break;
            case "/":
                res = divide(a, b);
                break;
            case "*":
                res = multiply(a, b);
                break;
            default:
                throw new CalculatorException("Operation not supported");
        }

        log(a, b, res, tokens[1]);

        return res;
    }

    public boolean isLog() {
        return log;
    }

    public void setLog(boolean log) {
        this.log = log;
    }

    private void log(int a, int b, int c, String operation) {
        if (log) {
            System.out.println(String.format("%s %s %s = %s", a, operation, b, c));
        }
    }
}
