package org.threads;

class ThreadDemo1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread "+Thread.currentThread().getId()+" is running");

    }
}
public class ThreadRunnableDemo{
    public static void main(String[] args) {
        for(int i=0;i<8;i++){
            Thread obj=new Thread(new ThreadDemo1());
            obj.start();
        }
    }
}
