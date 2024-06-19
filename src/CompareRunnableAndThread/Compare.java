package PACKAGE_NAME.CompareRunnableAndThread;

public class Compare {
    /**
     * 继承Thread类
     * 子类继承Thread类具备多线程能力
     * 启动线程： 子类对象.start()
     * 不建议使用，避免opp单继承局限性
     *
     * 实现Runnable接口
     *
     * 实现接口Runnable具有多线程能力
     * 启动线程： Thread对象（传入目标对象）.start（）
     * 推荐使用： 避免但继承局限性，灵活方便，方便同一个对象被多个对象使用
     */
    /**
     * 一份资源
     * StartThread station = new StartThread()
     *
     * 多个代理
     * new Thread(station,"小明").start();
     * new Thread(station,"小红").start();
     * new Thread(station,"老师").start();
     */
}
