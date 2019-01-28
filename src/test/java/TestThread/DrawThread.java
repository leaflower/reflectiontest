package TestThread;

public class DrawThread extends Thread {
    private Account account;
    private double drawMoney;

    public DrawThread(String name, Account account, double drawMoney) {
        super(name);
        this.account = account;
        this.drawMoney = drawMoney;
    }

    @Override
    public void run() {
        //利用同步方法，方式2
        account.draw(3000);

//        //利用代码块进行线程同步,方式1
//        synchronized (account) {
//            if (account.getBalance() > drawMoney) {
//                System.out.println(getName()+"取款成功，去除余额" + drawMoney);
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                account.setBalance(account.getBalance() - drawMoney);
//                System.out.println("目前账户余额" + account.getBalance());
//
//            } else {
//                System.out.println("余额不足！！");
//            }
//        }
    }
}
