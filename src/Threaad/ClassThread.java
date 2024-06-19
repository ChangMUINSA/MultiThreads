package PACKAGE_NAME.Threaad;
/**
 * 创建线程方式一：
 * 自定义线程继承Thread类
 * 重写run()方法，编写线程执行体
 * 创建线程对象，调用start()方法启动线程
 * 线程是程序中执行的线程. Java虚拟机准许应用程序同时执行多个执行线程
 */
//总结：注意，线程开启不一定立即执行，由CPU调度执行
public class ClassThread extends Thread{
    @Override
    public void run() {
        //run 方法线程体
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码"+i);
        }
    }

    public static void main(String[] args) {

        //创建一个线程对象
        ClassThread classThread = new ClassThread();
        //调用start()方法,开启线程
        classThread.start();
        //main线程， 主线程
        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习多线程--"+i);
        }

    }

}
