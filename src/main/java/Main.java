import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the calculator");
        
        while (true) {
            System.out.print("Enter a command: ");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            int a, b;

            switch (command) {
                case "add":
                    a = Integer.parseInt(parts[1]);
                    b = Integer.parseInt(parts[2]);
                    System.out.println(calculator.add(a, b));
                    break;
                case "subtract":
                    a = Integer.parseInt(parts[1]);
                    b = Integer.parseInt(parts[2]);
                    System.out.println(calculator.subtract(a, b));
                    break;
                case "multiply":
                    a = Integer.parseInt(parts[1]);
                    b = Integer.parseInt(parts[2]);
                    System.out.println(calculator.multiply(a, b));
                    break;
                case "divide":
                    a = Integer.parseInt(parts[1]);
                    b = Integer.parseInt(parts[2]);
                    System.out.println(calculator.divide(a, b));
                    break;
                case "fibonacci":
                    a = Integer.parseInt(parts[1]);
                    System.out.println(calculator.fibonacciNumberFinder(a));
                    break;
                case "binary":
                    a = Integer.parseInt(parts[1]);
                    System.out.println(calculator.intToBinaryNumber(a));
                    break;
                case "exit":
                    System.out.println("Exiting calculator. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid operation");
            }
        }
    }
}
