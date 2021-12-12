import java.util.Scanner;

import java.text.SimpleDateFormat;
import java.util.Date;

class Six {
    public static void main(String[] args) {
        char operator;
        Scanner input = new Scanner(System.in);

        System.out.println("Which Language Do You Speak? 0 for English or 1 for Pig Latin");
        operator = input.next().charAt(0);

        SimpleDateFormat englishFormatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat latinFormatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        switch (operator) {
            case '0':
                System.out.println("What is your name?");
                System.out.println(englishFormatter.format(date));
                break;

            case '1':
                System.out.println("nomen tuum?");
                System.out.println(latinFormatter.format(date));
                break;

            default:
                System.out.println("Invalid option!");
                break;
        }

        input.close();
    }
}