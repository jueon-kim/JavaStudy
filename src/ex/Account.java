package ex;

public class Account {
    int balance; //잔액

    //입금시 잔액증가
    void deposit(int amount){
        balance += amount;
    }

    //출금시 잔액 감소
    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;

        } else {
            System.out.println("잔액 부족 ");
        }
    }
}