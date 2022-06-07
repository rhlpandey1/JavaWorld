package org.threads;

public class PrintOddEven {
    int count=1;
    static int N;
    public void printOdd(){
            synchronized (this){
                while(count<N){
                    while(count%2==0){
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("printing odd "+count+" ");
                    count++;
                    notify();
                }
            }
    }
    public void printEven(){
        synchronized (this){
            while(count<N){
                while(count%2==1){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("printing even "+count+" ");
                count++;
                notify();
            }
        }
    }
    public static void main(String[] args) {

        N=10;
        PrintOddEven print=new PrintOddEven();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                print.printOdd();
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                print.printEven();
            }
        });
        t1.start();;
        t2.start();
    }
}
