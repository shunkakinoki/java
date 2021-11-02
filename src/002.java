import java.util.Scanner;

class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter first number: ");
            int first = in.nextInt();
            System.out.println("Enter second number: ");
            int second = in.nextInt();
            System.out.println("Enter third number: ");
            int third = in.nextInt();
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
            System.out.println(first + second + third);
            System.out.print(String.format("%s %s %s", first, second, third));
        } finally {
            in.close();
        }
    }
}