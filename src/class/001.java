class NumberUtil {

    public static int getNthOddNumber(int[] InputArray, int n) {
        int k = 0;
        for (int element : InputArray) {
            if (element % 2 == 1) {
                k++;
                if (k == n)
                    return element;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] intArray = { 2, 4, 1, 55, 2, 33, 41, 20 };
        int n = 3;
        System.out.println("The " + n + "th odd number in the array is: " + getNthOddNumber(intArray, n));
    }
}
