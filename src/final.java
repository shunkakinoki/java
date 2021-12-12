import java.util.Scanner;

class Final {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your customer account number?");
        int accountNumber = Integer.parseInt(input.nextLine());

        Accounts account;
        if (0 < accountNumber && accountNumber < 3000) {
            account = new Customer();
            account.Ask();
            account.Greet();
            account.Options();
        } else if (3000 < accountNumber && accountNumber < 9000) {
            account = new Company();
            account.Ask();
            account.Greet();
            account.Options();
        } else {
            System.out.println("Invalid customer number!");
        }
        input.close();
    }
}

abstract class Accounts {
    int balance;
    String name;

    public void Options() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Choose an option: 1)Balance, 2)Deposit, 3)Withdraw 4)Quit");
            char operator = input.next().charAt(0);
            switch (operator) {
                case '1':
                    this.Ask();
                    break;

                case '2':
                    this.Balance();
                    break;

                case '3':
                    this.Deposit();
                    break;

                case '4':
                    this.Quit();
                    break;

                default:
                    System.out.println("Invalid operator!");
                    break;
            }
            input.close();
        }

    };

    abstract public void Ask();

    public void Greet() {
        System.out.println("Welcome, " + this.name);
    }

    public void Balance() {
        System.out.println("Balance: " + this.balance);
    };

    public void Deposit() {
        System.out.println("What is your deposit value?");
        Scanner input = new Scanner(System.in);
        int value = Integer.parseInt(input.nextLine());
        this.balance += value;
        System.out.println("New Balance: " + this.balance);
        input.close();
    };

    public void Withdrawal() {
        System.out.println("What is your withdraw value?");
        Scanner input = new Scanner(System.in);
        int value = Integer.parseInt(input.nextLine());
        this.balance -= value;
        System.out.println("New Balance: " + this.balance);
        input.close();
    };

    public void Quit() {
        System.exit(0);
    };
}

class Customer extends Accounts {
    @Override
    public void Ask() {
        Scanner input = new Scanner(System.in);
        AccountManager manager = new AccountManager();

        System.out.println("What is your customer pin number?");
        int pinNumber = Integer.parseInt(input.nextLine());

        manager.CheckPin(pinNumber);

        input.close();
    }
}

class Company extends Accounts {
    @Override
    public void Ask() {
        Scanner input = new Scanner(System.in);
        AccountManager manager = new AccountManager();

        System.out.println("What is your company code?");
        int code = Integer.parseInt(input.nextLine());
        System.out.println("What is your employee id?");
        int employeeId = Integer.parseInt(input.nextLine());
        manager.CheckCompany(code, employeeId);

        System.out.println("What is your customer pin number?");
        int pinNumber = Integer.parseInt(input.nextLine());

        manager.CheckPin(pinNumber);

        input.close();
    }
}

class AccountManager {
    public Boolean CheckPin(int pinNumber) {
        return true;
    }

    public Boolean CheckCompany(int code, int employeeId) {
        return true;
    }
}