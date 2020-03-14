package singleton;

import java.util.concurrent.CountDownLatch;

public class EffectTest {
    public static void main(String[] args) throws InterruptedException {
        int count=10;
        final CountDownLatch cd=new CountDownLatch(count);
        long start=System.currentTimeMillis();
        for(int i=0;i<count;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<10000000;i++){
                        Object o=SingletonDemo04.getInstance();
                    }
                    cd.countDown();
                }
            }).start();
        }
        cd.await();
        long end=System.currentTimeMillis();
        System.out.println(end-start);

    }
}
