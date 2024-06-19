package PACKAGE_NAME.ThreadSynchronization;

//不安全的买票
//线程不安全有负数， 每个线程都有自己的工作内存，他们都把最后的资源拷贝到自己的内存当中
public class UnsafeBuyTickets {
    public static void main(String[] args) {
        BuyTickets station = new BuyTickets();
        new Thread(station,"小红").start();
        new Thread(station,"小明").start();
        new Thread(station,"我").start();

    }

}
class  BuyTickets implements Runnable{
    //票
    private int ticketNum = 10;
    boolean flag = true;//外部停止方式
    @Override
    public void run() {
        //买票
        while (flag){
            try {
                buy();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    //synchronized 同步方法，锁的是this
    private synchronized void buy() throws InterruptedException {
        //判断是否有票
        if (ticketNum <= 0) {
            flag = false;
        }
        //模拟延时

        //买票
        System.out.println(Thread.currentThread().getName()+"--->拿到了第"+ticketNum--+"票");

    }
}