package PACKAGE_NAME.CallableInterface;

public class Definition {
    /**
     * 实现Callable接口，需要返回值类型
     * 重写call方法，需要抛出异常
     * 创建目标对象
     * 创建执行服务：ExecutorService ser = Executors.newFixedThreadPool(1);
     * 提交执行：Future<Boolean>result1 = ser.submit;
     * 获取结果： boolean r1 = result.get();
     * 关闭服务： ser.shutdownNow();
     */
    /**
     * Callable的好处
     * 可以定义返回值
     * 可以抛出异常
     */
}
