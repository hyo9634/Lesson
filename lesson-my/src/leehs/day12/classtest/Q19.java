package day12.classtest;

public class Q19 {

  public static void main(String[] args) {
    Account account = new Account();
    account.setBalance(10000);
    System.out.println("현재 잔고는 " + account.getBalance() + "원");

    account.setBalance(-100);
    System.out.println("현재 잔고는 " + account.getBalance() + "원");
  }

}

