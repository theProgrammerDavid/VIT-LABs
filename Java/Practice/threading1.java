import java.io.*;
import java.util.*;

class S extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public S(String s){
        super(s);
    }
}

public class threading1 {
    public static void main(String args[]) throws InterruptedException {
        S t1 = new S("t1");
        S t2 = new S("t2");
        t1.setName("David");
        t1.start();
        t2.start();

        t1.setPriority(6);
        System.out.println(t1.getPriority());

        t1.join();
        t2.join();
    }
}