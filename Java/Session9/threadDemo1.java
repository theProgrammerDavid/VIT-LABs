import java.io.*;
import java.util.*;

class Account {
    private String name;
    private String accountNumber;
    public int balance;

    Account(int b, String name, String no) {
        this.balance = b;
        this.name = name;
        this.accountNumber = no;
    }

    synchronized public void withdraw(int b) throws InterruptedException {
        while (this.balance < b) {
            System.out.println("Insufficient balance. thread " + Thread.currentThread().getId() + " is waiting");
            wait();
        }
        System.out.println("Withdrawal done by thread " + Thread.currentThread().getId());

        this.balance -= b;
    }

    synchronized public void deposit(int b) {
        System.out.println("Deposit done by " + Thread.currentThread().getId());

        this.balance += b;
        notify();
    }

    public void showBalanace() {
        System.out.println(
                "\n\nDetails are:\nname: " + this.name + "\naccount number: " + this.accountNumber + "\nbalance:" + this.balance);
    }

    synchronized public void withdrawAndDeposit(int w, int d) {
        synchronized (this) {
            this.balance -= w;
            this.balance += d;
        }
    }
}

public class threadDemo1 {
    public static void main(String args[]) throws InterruptedException {
        Account ac = new Account(20000, "Arushi Jain", "AC1019214");

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    ac.withdraw(30000);
                } catch (Exception e) {

                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    ac.deposit(40000);
                } catch (Exception e) {

                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        ac.showBalanace();
    }
}