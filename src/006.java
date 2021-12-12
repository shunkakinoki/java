import java.util.Scanner;

class Six {
    public static void main(String[] args) {
        char operator;
        Double first, second, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("Enter first number");
        first = input.nextDouble();

        System.out.println("Enter second number");
        second = input.nextDouble();

        switch (operator) {
            case '+':
                result = first + second;
                System.out.println(first + " + " + second + " = " + result);
                break;

            case '-':
                result = first - second;
                System.out.println(first + " - " + second + " = " + result);
                break;

            case '*':
                result = first * second;
                System.out.println(first + " * " + second + " = " + result);
                break;

            case '/':
                result = first / second;
                System.out.println(first + " / " + second + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}