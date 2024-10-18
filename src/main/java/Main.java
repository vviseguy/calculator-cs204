public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        String command = args[0];
        int a, b;

        switch (command) {
            case "add":
                a = Integer.parseInt(args[1]);
                b = Integer.parseInt(args[2]);
                System.out.println(calculator.add(a, b));
                break;
            case "subtract":
                a = Integer.parseInt(args[1]);
                b = Integer.parseInt(args[2]);
                System.out.println(calculator.subtract(a, b));
                break;
            case "multiply":
                a = Integer.parseInt(args[1]);
                b = Integer.parseInt(args[2]);
                System.out.println(calculator.multiply(a, b));
                break;
            case "divide":
                a = Integer.parseInt(args[1]);
                b = Integer.parseInt(args[2]);
                System.out.println(calculator.divide(a, b));
                break;
            case "fibonacci":
                a = Integer.parseInt(args[1]);
                System.out.println(calculator.fibonacciNumberFinder(a));
                break;
            case "binary":
                a = Integer.parseInt(args[1]);
                System.out.println(calculator.intToBinaryNumber(a));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
