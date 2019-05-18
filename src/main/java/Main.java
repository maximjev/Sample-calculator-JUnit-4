import impl.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setLog(true);

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            calculator.evaluate(scanner.nextLine());
        }
    }
}
