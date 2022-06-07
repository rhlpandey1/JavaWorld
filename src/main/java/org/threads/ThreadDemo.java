package org.threads;

class MTDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Thread "+Thread.currentThread().getId()+" is running");
    }
}
public class ThreadDemo {
    public static void main(String[] args) {

        for(int i=0;i<8;i++){
            MTDemo mt=new MTDemo();
            mt.start();
        }
    }
}
