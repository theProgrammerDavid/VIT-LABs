import java.io.*;
import java.util.*;

class chatbox {
    private boolean inputAvailable;
    public boolean isActive;
    private ArrayList<String> chats;

    synchronized public boolean isInputAvailable() {
        return this.inputAvailable;
    }

    synchronized public void waitForInput() throws InterruptedException {
        while (!this.inputAvailable) {
            wait();
        }
        this.blockInput();
    }

    public void blockInput() {
        this.inputAvailable = false;
    }

    synchronized public void releaseInput() {
        this.inputAvailable = true;
        notify();

    }

    synchronized public void addChats(String s) {
        chats.add(s);
    }

    public void getChats() {
        System.out.println(this.chats);
    }

    public chatbox() {
        inputAvailable = true;
        this.chats = new ArrayList<String>();
        this.isActive = true;
    }

}

public class chat {
    public static void main(String args[]) throws InterruptedException {
        chatbox c = new chatbox();
        Scanner sc = new Scanner(System.in);
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    while (c.isActive) {

                        c.waitForInput();
                        c.getChats();
                        System.out.println("Enter message#1: ");
                        String s = sc.nextLine();
                        c.releaseInput();
                        if (s.equals("bye")) {
                            throw new Exception("End program");
                        }
                        c.addChats(s);
                        Thread.sleep(20);
                    }
                } catch (Exception e) {
                    c.isActive = false;
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    while (true) {
                        c.waitForInput();
                        c.getChats();

                        System.out.println("Enter message#2: ");

                        String s = sc.nextLine();
                        c.releaseInput();
                        if (s.equals("bye")) {
                            throw new Exception("End program");
                        }
                        c.addChats(s);
                        Thread.sleep(20);

                    }
                } catch (Exception e) {
                    c.isActive = false;

                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        sc.close();
    }
}