package day13.amount;

public class CheckingAccount extends Account {

  private String cardNo;


  public CheckingAccount(String accid, String ownerName, long balance, String cardNo) {
    super();
    this.accId = accid;
    this.ownerName = ownerName;
    this.balance = balance;
    this.cardNo = cardNo;
  }

  public void pay(long amount, String cardNo) {
    if (this.cardNo.equals(cardNo) && this.balance >= amount) {
      this.withdraw(amount);
    } else {
      System.out.println("지불이 불가능합니다.");
    }
  }
}
