package PACKAGE_NAME.FunctionSynchronized;

public class Definition {
    /**
     * 由于我们可以通过private关键字来保证数据对象只能被方法访问，所以我们只需要针对方法提出一套机制
     * 这套机制就是synchronized关键字
     * 它包括两种用法：synchronized方法和synchronized块
     * 同步方法： public synchronized void method(int args){}
     *
     * synchronized方法控制 ”对象“ 的访问，每个对象对应一把锁，
     * 每个synchronized方法都必须获得调用该方法的对象的锁才能执行，否则 线程会阻塞
     * 方法一但执行，就独占该锁，直到该方法返回才释放锁，后面被阻塞的线程才会获得这个锁，继续执行
     *
     * 缺陷： 若将一个大的方法申明为synchronized将会影响效率
     *
     * 方法里面需要修改的内容才需要锁，锁的太多，浪费资源
     *
     * 同步块 ：synchronized(Obj){}
     * Obj 称之为 同步监视器
     * Obj 可以是任何对象，但是推荐使用共享资源作为同步监视器
     * 同步方法中无需指定同步监视器，因为同步方法的同步监视器就是this，就是这个对象本身，或者是class[反射中讲解]
     *
     * 同步监视器的执行过程
     * 第一个线程访问，锁定同步监视器，执行其中代码.
     * 第二个线程访问，发现同步监视器被锁定，无法访问
     * 第一县城访问完毕，解锁同步监视器
     * 第二个线程访问，发现同步监视器没有锁，然后锁定并访问
     */
}
