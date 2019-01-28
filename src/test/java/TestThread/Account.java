package TestThread;

public class Account {

    private String accountNo;
    private double balance;

    public Account(String accountNo,double balance) {
        super();
        this.accountNo = accountNo;
        this.balance = balance;
    }


    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * 同步方法，方式2
     */
    public synchronized void draw(double drawMoney){
        if (getBalance() > drawMoney) {
            System.out.println(Thread.currentThread().getName()+"取款成功，去除余额" + drawMoney);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setBalance(getBalance() - drawMoney);
            System.out.println("目前账户余额" + getBalance());

        } else {
            System.out.println("余额不足！！");
        }
    }


}
