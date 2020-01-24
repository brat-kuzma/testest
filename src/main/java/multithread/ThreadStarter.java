package multithread;

import multithread.FuckinThread;

public class ThreadStarter {
    public static void isParallel() {
        Thread t1 = new FuckinThread("kokoko");
        System.out.println("Start kokoko");
        t1.start();
    }
    public static void main(String[] args) {
            Thread t = new FuckinThread("mimimmi");
            System.out.println("Starting mimimi");
        t.start();
           //  System.out.println("ERROR:");
            isParallel();
            t.start();


      }
}
