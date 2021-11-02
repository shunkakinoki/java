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
        int[] list = { 3, 2, 7, 8, 9 };
        int oddCount = 0;
        for (Integer n : list) {
            if (n % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println(oddCount);
    }

    public static void four() {
        int[] list = { 3, 2, 7, 8, 9 };
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if (i == 0) {
                continue;
            }
            count += list[i];
        }
        System.out.println(count);
    }

    public static void five(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += i;
        }
        System.out.println(count);
    }

    public static void sum_to(int n) {
        five(n);
    }

    public static void main(String[] args) {
        sum_to(10);
    }
}