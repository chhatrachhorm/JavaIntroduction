package InternalExamination.thread.Liveness.Deadlock;

/**
 * I think the deadlock is the easiest one to understand.
 * It happens when a process wait for another one who is using some needed resource
 * (ie: file or database table row) to finish with it,
 * while the other process also wait for the first process to release some other resource.
 * */

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
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    firstAccount.transfer(firstAccount, secondAccount, 50d);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    secondAccount.transfer(secondAccount, firstAccount, 10d);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
