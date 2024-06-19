package PACKAGE_NAME.Lamda;

public class TestLambda2 {
    static class Love1 implements ILove{
        @Override
        public void love(int a) {
            System.out.println("I love You -->"+a);
        }
    }

    public static void main(String[] args) {

        class Love2 implements ILove{
            @Override
            public void love(int a) {
                System.out.println("I love You -->"+a);
            }
        }








        ILove love = new Love();
        love.love(1);
        love = new Love1();
        love.love(2);
        love = new Love2();
        love.love(3);


        love = new ILove(){
            @Override
            public void love(int a) {
                System.out.println("I love You -->"+a);
            }
        };

        love.love(4);
        //Lambda表达式简化
        love = (int a) -> {
            System.out.println("I love You -->"+a);
        };
        //简化1.参数类型
        love =(a)-> {
            System.out.println("I love You -->"+a);
        };
        //简化2.简化括号
        love = a -> {
            System.out.println("I love You -->"+a);
        };
        //简化3.去掉花括号
        love = a -> System.out.println("I love You -->"+a);

        /**
         * 总结：Lambda表达式只能有一行代码的情况下才能简化成为一行，如果有多行，那么就用代码块包裹.
         * love = a -> {
         *             System.out.println("I love You -->"+a);
         *             System.out.println("I love You --> too");
         *         };
         * 前提是接口为函数式接口
         * 多个参数也可以去掉参数类型，要去掉就都去掉，必须加上括号，
         * love = (a,b) -> {
         *             System.out.println("I love You -->"+a);
         *             System.out.println("I love You --> too");
         *         };
         * 多线程的Runnable接口实现类，如果代码简单，则可以用Lambda表达式简化
         * new Thread(() -> System.out.println("我爱你")).start();
         */
        love.love(521);
    }
}



interface ILove{
    void love(int a);
}
class Love implements ILove{
    @Override
    public void love(int a) {
        System.out.println("I love You -->"+a);
    }
}