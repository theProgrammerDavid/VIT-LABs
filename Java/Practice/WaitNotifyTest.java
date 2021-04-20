class Account {
    private int amount;

    public Account() {
        this.amount = 10000;
    }

    public void printBal() {
        System.out.println("balance is " + this.amount);
    }

    synchronized void deposit(int money) {
        amount += money;
        notifyAll();
    }

    synchronized void withdraw(int money) throws InterruptedException {
        while (this.amount < 20000) {
            System.out.println("thread with id "+Thread.currentThread().getId()+" is waiting");
            wait();
        }
        amount -= money;
    }
}

public class WaitNotifyTest {

    public static void main(String[] args) throws InterruptedException {
        Account ac = new Account();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    ac.withdraw(5000);
                } catch (InterruptedException e) {
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    ac.withdraw(5000);
                } catch (InterruptedException e) {
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            public void run() {
                ac.deposit(6000);
                ac.deposit(6000);
                

            }
        });

        t1.start();
        t2.start();
        t3.start();

        Thread.currentThread().sleep(2000);
        ac.deposit(6000);
        ac.deposit(6000);
        ac.deposit(6000);

        t1.join();
        t2.join();
        t3.join();

        ac.printBal();
    }
}