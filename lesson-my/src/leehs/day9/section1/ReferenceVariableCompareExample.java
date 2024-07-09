package day9.section1;

public class ReferenceVariableCompareExample {

  public static void main(String[] args) {
    //1. 변수란? 데이터 (값) 하나만을 저장하는 상자, 저장해야 할 데이터가 많아지면 변수도 많아진다.
    //2. 배열이란? 많은 데이터(값)를 좀더 효율적으로 관리(CRUD), 연속된 공간에 값을 나열시키고, 각 값에 인덱스를 부여해 놓은 자료구조
    //3. 배열의 인덱스는 0 부터 시작하고 대괄호[]를 사용하여 각 항목의 값을 읽거나 저장할때 사용
    //4. 배열의 특징 : 같은 데이터 타입의 값만 관리한다. 배열은 초기에 길이가 정해진다.(저장공간을 늘리거나 줄일 수 없다)

    //정수형 배열 변수 arr1 선언하시오
    int[] arr1;

    //정수형 배열 변수 arr2 선언
    int[] arr2;
    //정수형 배열 변수 arr3 선언
    int[] arr3;

    //배열 { 1, 2, 3 }을 생성하고 arr1 변수에 대입
    arr1 = new int[]{1, 2, 3};
    //배열 { 4, 5, 6 }을 생성하고 arr2 변수에 대입
    arr2 = new int[]{4, 5, 6};
    //배열 변수 arr2의 값을 배열 변수 arr3에 대입
    arr3 = arr2;

    System.out.println(arr1[0]);
    System.out.println(arr1[1]);
    System.out.println(arr1[2]);
    for (int i = 0; i < arr1.length; i++) {
      System.out.println(arr1[i]);
    }
    System.out.println("===============");
    System.out.println(arr2[0]);
    System.out.println(arr2[1]);
    System.out.println(arr2[2]);
    for (int i = 0; i < arr3.length; i++) {
      System.out.println(arr3[i]);
    }
    // arr1과 arr2 변수가 같은 배열을 참조하는지 검사
    System.out.println(arr1 == arr2);

    // arr2와 arr3 변수가 같은 배열을 참조하는지 검사
    System.out.println(arr2 == arr3);

    char[] data = {'a', 'b', 'c'};
    String str1 = new String(data);
    String str2 = new String();
    String str3 = new String("홍길동");
    System.out.println(str1.toString() + " , " + str2.toString() + " ," + str3.toString());
  }
}