import java.util.Scanner;

class Three {
    static String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December" };
    static Integer[] numbers = { 12, 10, 32, 3, 66, 17, 42, 99, 20 };

    public static void one() {
        for (String s : months) {
            System.out.println(String.format("One of the months of the year is %s", s));
        }
    }

    public static void two() {
        int total = 0;
        int productSum = 0;
        for (Integer n : numbers) {
            System.out.println(n);
            System.out.println(n * n);
        }
        for (Integer n : numbers) {
            total += n;
        }
        System.out.println(total);
        for (Integer n : numbers) {
            productSum += n * n;
        }
        System.out.println(productSum);
    }

    public static void three() {
        int[] age = { 3, 2, 7, 8, 9 };
        int oddCount = 0;
        for (Integer n : age) {
            if (n % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println(oddCount);
    }

    public static void main(String[] args) {
        three();
    }
}