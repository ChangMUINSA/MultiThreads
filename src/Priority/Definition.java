package PACKAGE_NAME.Priority;

public class Definition {
    /**
     * Java提供一个线程调度器来监控程序中启动后进入就绪状态的所有线程，线程调度器按照优先级来决定应该调度哪个线程来执行
     * 线程的优先级用数字表示，范围1~10.
     * Thread0MIN_PRIORITY = 1;
     * Thread0MIN_PRIORITY = 1;
     * Thread0MAX_PRIORITY = 10;
     * ThreadNORM_PRIORITY = 10;
     * 使用以下方式改变或获取优先级
     * getPriority().setPriority(int xxx)
     *
     * 优先级的设定建议在start()调度前
     *
     * 优先级低只是意味着获得调度的概率低，并不是优先级低就不会被调用了.这都是看CPU的调度！！！（可能引起行性能倒置问题）
     */
}
