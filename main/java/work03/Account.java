package work03;

import work01.Utilitor;
import work02.Person;

import java.util.Objects;

public class Account {
    private static long nextNo = 100_000_000;
    private final long no;
    private Person owner;
    private double balance;

    public Account(Person owner) {
        if (owner == null) {
            throw new NullPointerException("Owner can't null");
        }
        this.owner = owner;
        this.balance = 0.0;
        long result = Utilitor.computeIsbn10(nextNo);
        while (result == 10) {
            nextNo++;
            result = Utilitor.computeIsbn10(nextNo);
        }
        this.no = 10 * nextNo + result;
        nextNo++;
    }

    public long getNo() {
        return no;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        Utilitor.testPositive(amount);
        this.balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        Utilitor.testPositive(amount);
        this.balance -= amount;
        return this.balance;
    }

    public void transfer(double amount, Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account can't null");
        }
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Can't transfer");
        }
        withdraw(amount);
        account.deposit(amount);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("no=").append(no);
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        else return false;
    }
}
