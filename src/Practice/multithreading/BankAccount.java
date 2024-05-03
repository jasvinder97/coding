package Practice.multithreading;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit funds into the account
    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw funds from the account
    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public synchronized double getBalance() {
        return balance;
    }


}

class Main {


    public static void main(String[] args) {
        BankAccount account = new BankAccount(50);

        // Creating threads for withdrawals and deposits
        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.withdraw(10);
            }
        });

        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(20);
            }
        });

        // Starting the threads
        withdrawThread.start();
        depositThread.start();

        // Waiting for threads to complete
        try {
            withdrawThread.join();
            depositThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Displaying the final balance
        System.out.println("Final balance: " + account.getBalance());
    }

}