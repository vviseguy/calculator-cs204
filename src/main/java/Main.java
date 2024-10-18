public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        switch(args[0]){
            case "add":
                int a = Integer.parseInt(args[1]);
                int b = Integer.parseInt(args[2]);
                System.out.println(calculator.add(a,b));
                break;
            case "subtract":
                int a = Integer.parseInt(args[1]);
                int b = Integer.parseInt(args[2]);
                System.out.println(calculator.subtract(a,b));
                break;
            case "multiply":
                int a = Integer.parseInt(args[1]);
                int b = Integer.parseInt(args[2]);
                System.out.println(calculator.multiply(a,b));
                break;
            case "divide":
                int a = Integer.parseInt(args[1]);
                int b = Integer.parseInt(args[2]);
                System.out.println(calculator.divide(a,b));
                break;
            case "fibonacci":
                int a = Integer.parseInt(args[1]);
                System.out.println(calculator.fibonacciNumberFinder‎‎‎(a));
                break;
            case "binary":
                int a = Integer.parseInt(args[1]);
                System.out.println(calculator.intToBinaryNumber‎(a));
                break;
            default:
                System.out.println("Invalid operation");
    }
}
