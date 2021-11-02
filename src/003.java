
class Three {
    static String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December" };

    public static void one() {
        for (String s : months) {
            System.out.println(String.format("One of the months of the year is %s", s));
        }
    }

    public static void main(String[] args) {
        one();
    }
}