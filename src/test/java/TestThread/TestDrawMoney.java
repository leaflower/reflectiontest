package TestThread;

public class TestDrawMoney {
    public static void main(String[] args) {
        Account acc =new Account("124214",5000);
        new DrawThread("zs",acc,3000).start();
        new DrawThread("ss",acc,3000).start();

    }
}
