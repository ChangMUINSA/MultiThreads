package PACKAGE_NAME.PoolThreads;

public class Definition {
    /**
     * 背景： 经常创建和销毁，使用量特别大的资源，比如并发情况下的线程，对性能影响很大
     * 思路： 提前创建好多个线程，放入线程池中，使用时直接获取，使用完放回池中
     * 可以避免频繁创建销毁，实现重复利用.类似生活中的公共交通工具
     *
     * 好处：
     * 提高响应速度（减少了创建新线程的时间）
     * 降低资源消耗（重复利用线程池中的线程，不需要每次都创建）
     * 便于线程管理（...）
     * corePoolSize: 核心池大小
     * maximumPoolSize: 最大线程数
     * keepAliveTime:线程没有任务时最多保持多长时间后会终止
     *
     */
    /**
     * JDK 5.0起提供了线程池相关API： ExecutorService 和 Executors
     * ExecutorService: 真正的线程池接口. 常见子类 ThreadPoolExecutor
     *
     * void execute(Runnable command) : 执行任务/命令，没有返回值，一般用来执行Runnable
     * <T>Future<T>submit(Callable<T>task):执行任务，有返回值，一般用来执行Callable
     * void shutdown():关闭连接池
     *
     * Executors: 工具类，线程池的工厂类，用于创建并返回不同类型的线程池
     */
}
