package PACKAGE_NAME.Runnable;
//推荐使用Runnable对象，因为java单继承的局限性
/**
 * 实现Runnable接口
 * 定义MyRunnable类实现Runnable接口
 * 重写run()方法，编写线程执行体
 * 执行线程需要丢入runnable接口实现类
 * 创建线程对象，调用start()方法启动线程
 */
public class RunnableInterface implements Runnable{
    @Override
    public void run() {
        //run 方法线程体
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码"+i);
        }
    }

    public static void main(String[] args) {

        //创建一个Runnable接口的实现对象
        RunnableInterface runnableInterface = new RunnableInterface();
        //创建线程对象，通过线程对象来开启我们的线程，代理
//        Thread thread = new Thread(runnableInterface);
//        thread.start();
        new Thread(runnableInterface).start();
        //main线程， 主线程
        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习多线程--"+i);
        }

    }


}
