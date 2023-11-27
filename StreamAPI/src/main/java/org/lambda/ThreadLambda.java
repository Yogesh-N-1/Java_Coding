package org.lambda;

public class ThreadLambda {
        //create thread using lambda expression

    public static void main(String[] args) {
        Runnable t1 = () -> {

            for (int i = 0; i < 20; i++) {
                System.out.println("Thread 1 at :" + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };
        Runnable t2 =()-> {

            for(int i=1 ; i<=10 ; i++){
                System.out.println( i*2 );
            }

        };
        Thread ts=new Thread(t1);
        ts.setName("Thread 1");
        ts.start();

        Thread ts2=new Thread( t2);
        ts2.start();




        Runnable r= ()->{

            for (int j=0 ; j<=10; j++){
                System.out.println("run"  + j);
            }
        };

        Thread t= new Thread(r);
        t.setName("new");
        t.start();

    }


}
