public class Account {
    private String name;
    private int balance;

    Account() {
        this.balance = 0;
    }

    Account(int balance) {
        this.balance = balance;
    }

    Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    Account(String name) {
        this.name = name;
    }

    public void withdraw(int withdrawal) {
        if (balance >= withdrawal) {
            this.balance -= withdrawal;
        } else {
            System.out.println("Your balance is " + this.balance + ".\n You cannot withdraw more than your balance.");
        }

    }

    public void deposit(int deposit) {
        this.balance += deposit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        String message = "Name: " + name + "\n Your balance is: " + balance;
        return message;
    }

}
