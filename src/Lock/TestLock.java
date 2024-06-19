package PACKAGE_NAME.Lock;

import java.util.concurrent.locks.ReentrantLock;

//测试Lock锁
public class TestLock {
    public static void main(String[] args) {
        TestLock2 testLock2 = new TestLock2();

        new Thread(testLock2,"小红").start();
        new Thread(testLock2,"小明").start();
        new Thread(testLock2,"我").start();
    }


}

class TestLock2 implements Runnable{

    int ticketNums = 10;
    
    //定义lock锁
    private final ReentrantLock lock = new ReentrantLock();
    
    @Override
    public void run() {
        while (true){
            try {
                lock.lock();//加锁
                if (ticketNums > 0) {

                    System.out.println(Thread.currentThread().getName()+ticketNums--);
                }else {
                    break;
                }
            }finally {
                //解锁
                lock.unlock();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}