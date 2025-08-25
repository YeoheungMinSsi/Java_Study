package ch11.sec06;

public class Account {
    private long balance;

    public Account() {}

    public long getBalance() { return balance; }

    public void deposit(int money){
        balance += money;
    }

    // throws InsufficientException을 통해 호출한 곳으로 예외를 넘김
    public void withdraw(int money) throws InsufficientException{
        if(balance < money){
            // 예외 발생 -> throws InsufficientException
            throw new InsufficientException("잔고 부족 : " +(money-balance) + "모자람");
        }
        balance -= money;
    }


}
