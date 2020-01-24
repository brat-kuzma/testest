package multithread;

import java.util.concurrent.TimeUnit;

public class FuckinThread extends Thread {
    private String name;

    public FuckinThread(String name){
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println("Thread"+ name + ": started");

        try {
            for (int i=0; i<5; i++){
                System.out.println("multithread.FuckinThread" + name +":" + i);
                TimeUnit.SECONDS.sleep(1);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fuckin Thread : finished");
    }

    /*public static void main(String[] args) {
        Thread t = new multithread.FuckinThread();
        t.start();

    }*/
}
