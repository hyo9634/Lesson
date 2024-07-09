package day11.addressprogram.addressexception;

public class AddressException extends RuntimeException {

  private ErrorCode errorCode;

  public AddressException(ErrorCode codes) {
    this.errorCode = codes;
    System.out.println("\n*************** error 발생 *************** ");
    System.out.println(
        errorCode.getCode() + " / " + errorCode.getMessage() + " / " + errorCode.getStatus());
    System.out.println("*****************************************");
  }


}
