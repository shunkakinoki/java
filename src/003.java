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

    public static void five() {
        int[] list = { 2, 3, 4 };
        int count = 0;
        for (Integer n : list) {
            count += n * n;
        }
        System.out.println(count);
    }

    public static void six(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += i;
        }
        System.out.println(count);
    }

    public static void seven(Double r) {
        Double area = Math.PI * r * r;
        System.out.println(area);
    }

    public static String eight(String compass) {
        if (compass == "N") {
            return "E";
        }
        if (compass == "E") {
            return "S";
        }
        if (compass == "S") {
            return "W";
        }
        if (compass == "W") {
            return "N";
        }
        return "";
    }

    public static int nine(int month) {
        if (month == 2) {
            return 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public static int ten(int hours, int minutes, int seconds) {
        return hours * 60 * 60 + minutes * 60 + seconds;
    }

    public static void sum_to(int n) {
        six(n);
    }

    public static void area_of_circle(Double r) {
        seven(r);
    }

    public static String turn_clockwise(String compass) {
        return eight(compass);
    }

    public static int days_in_month(int month) {
        return nine(month);
    }

    public static int to_secs(int hours, int minutes, int seconds) {
        return ten(hours, minutes, seconds);
    }

    public static void main(String[] args) {
        to_secs(2, 30, 10);
    }
}