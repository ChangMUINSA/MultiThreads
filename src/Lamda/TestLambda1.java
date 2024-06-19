package PACKAGE_NAME.Lamda;

/**
 * 推导Lambda表达式
 */
public class TestLambda1 {
    //3.静态内部类
    static class Like2 implements ILike{
        @Override
        public void lambda() {
            System.out.println("I like Lambda2");
        }
    }

    public static void main(String[] args) {
        ILike iLike = new Like();//接口指向实现类对象、接口回调、向上转型
        iLike.lambda();

        iLike = new Like2();
        iLike.lambda();//接口指向实现类对象、接口回调、向上转型

        //4.局部内部类
        class Like3 implements ILike {
            @Override
            public void lambda() {
                System.out.println("I like Lambda3");

            }
        }
        iLike = new Like3();
        iLike.lambda();

        //5.匿名内部类,没有类的名称，必须借助接口或者父类
        iLike = new ILike() {
            @Override
            public void lambda() {
                System.out.println("I like Lambda4");
            }
        };
        iLike.lambda();
        //6.用Lambda简化（因为接口只有一个类，类只有一个方法）
        iLike = ()-> {
                System.out.println("I like Lambda5");
        };
        iLike.lambda();
    }
}


//1.定义一个函数式接口
interface ILike{
    void lambda();
}
//2.实现类
class Like implements ILike{
   @Override
    public void lambda() {
        System.out.println("I like Lambda");
    }
}