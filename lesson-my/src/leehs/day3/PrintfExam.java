package day3;

public class PrintfExam {
    public static void main(String[] args) {
        //printf : 출력한 후 줄바꿈을 하지 않는다. "\n" , "%n"
//          %b :boolean 출력 %d : 10진 정수 출력 %o : 8진수  %x: 16진수 %f :소수출력 %e %c:문자 출력 %s: 문자열 출력

        //result = [    10]
        long l1 = 10;
        System.out.printf("result = [%5d]%n",l1);
        System.out.printf("result = [%-5d]%n",l1);
        System.out.printf("result = [%05d]%n",l1);

        long hx = 0xFFFF;
        System.out.printf("hx = %x%n", hx);
        System.out.printf("hx = %#x%n", hx);
        System.out.printf("hx = %#X%n",hx);

        //10진수를 2진수로 출력하는 지시자는 없다. Integer.toBinaryString(int i) 사용한다.
        //해당 메소드는 정수를 2진수로 변환해서 문자열로 반환한다. %s

        int binaryNum = 0b10;
        System.out.printf("binaryNum = %s%n", Integer.toBinaryString(binaryNum));

        char c = 'A';
        System.out.printf("c = %c , %d  %n", c,(int)c);
    }
}
