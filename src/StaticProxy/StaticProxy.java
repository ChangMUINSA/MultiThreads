package PACKAGE_NAME.StaticProxy;

/**
 * 代理类和被代理类都实现同一个接口，然后被代理类（You，自定义线程类实现Runnable接口）交给代理类（WeddingCompany,Threads)
 */
public class StaticProxy {
    public static void main(String[] args) {
        You you = new You();//你要结婚
        //Threads也是代理对象，Threads代理和Runnable接口都有run方法，Threads的start方法最终会调用target对象的run方法
        new Thread(() -> System.out.println("我爱你")).start();
        new WeddingCompany(new You()).HappyMarry();
//        WeddingCompany weddingCompany = new WeddingCompany(new You());
//        weddingCompany.HappyMarry();
    }
}


interface Marry{

    void HappyMarry();

}

//真实角色，你去结婚
class You implements Marry{
    @Override
    public void HappyMarry() {
        System.out.println("小明结婚了");
    }
}
//代理角色，帮助你结婚
class WeddingCompany implements Marry{

    private Marry target;

    public WeddingCompany(Marry target) {
        //代理谁---》真实目标角色
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();//这就是真实对象
        after();
    }

    private void after() {
        System.out.println("结婚之后，收尾款");
    }

    private void before() {
        System.out.println("结婚之前，布置现场");
    }

}