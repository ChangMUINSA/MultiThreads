package PACKAGE_NAME.ThreadSynchronization;

//不安全的取钱
//两个人去银行取钱，账户
public class UnsafeBank {
    public static void main(String[] args) {
        //账户
        Account account = new Account("结婚基金",1000);

        Drawing you = new Drawing(account,50,"你");
        Drawing girlFriend = new Drawing(account,100,"girlFriend");

        you.start();
        girlFriend.start();
    }






}
//账户
class Account{
    int money;//余额
    String name;//卡名

    public Account(String name, int money) {
        this.name = name;
        this.money = money;
    }
}

//银行：模拟取款
class Drawing extends Thread{

    Account account;//账户
    //取了多少钱
    int drawingMoney;
    //现在手里有多少钱
    int nowMoney;
    public Drawing(Account account,int drawingMoney,String name){
        super(name);//super(name)=父类构造方法（name），即调用了父类Thread的线程名的方法，给线程取名字
        this.account = account;
        this.drawingMoney = drawingMoney;

    }
    //取钱
    @Override
    //synchronized 默认锁的是this(这个类本身实例化的对象）锁的对象即使共享的对象，
    // 锁的对象是变化的量，需要增删改
    public void run() {
        //判断有没有钱
        synchronized (account){
            if (account.money - drawingMoney < 0) {
                System.out.println(Thread.currentThread().getName()+"钱不够，取不了");
                return;
            }
            try {
                //sleep可以放大问题的发生性
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //卡内余额 = 余额 - 你取的钱
            account.money = account.money - drawingMoney;
            //你手里的钱
            nowMoney = nowMoney + drawingMoney;

            System.out.println(account.name+"余额为："+ account.money);
            //Thread.currentThread().getName() = this.getName()
            System.out.println(this.getName()+"手里的钱："+nowMoney);
        }

    }
}