package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(int amount) {
        if(isAmountValid(amount)){
        balance += amount;

        }else {
            System.out.println("유요하지 않은 금액 입니다");
        }
    }

    //public 매서드
    public void withdraw(int amount){
        if (isAmountValid(amount) && balance - amount >= 0){
            balance -= amount;
        }else {
            System.out.println("유요하지 않은 금액이거나 잔액이 부족합니다 ");
        }
    }
    //public 매서드
    public int getBalance(){
        return  balance;
    }

    public void deposit(int account){
        balance += account;
    }

    private boolean isAmountValid(int amount){
        // 금액은 0보다 켜야함
        return amount > 0;
    }
}
