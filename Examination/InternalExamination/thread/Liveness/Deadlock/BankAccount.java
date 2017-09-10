package InternalExamination.thread.Liveness.Deadlock;

public class BankAccount {

    private double balance;
    private int id;
    public BankAccount(double balance, int id){
        this.balance = balance;
        this.id = id;
    }
    private void withdraw(double amount) throws InterruptedException {
        Thread.sleep(10);
        balance -= amount;
    }
    private void deposit(double amount) throws InterruptedException{
        Thread.sleep(10);
        balance += amount;
    }
    private boolean transfer(BankAccount from, BankAccount to, double amount) throws InterruptedException{
        synchronized (from){
            from.withdraw(amount);
            synchronized (to){
                to.deposit(amount);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        final BankAccount firstAccount = new BankAccount(1000d, 1250);
        final BankAccount secondAccount = new BankAccount(2500d, 1256);
        Thread send1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    firstAccount.transfer(firstAccount, secondAccount, 50d);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread send2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    secondAccount.transfer(secondAccount, firstAccount, 10d);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        send1.start();
        send2.start();
    }
}
