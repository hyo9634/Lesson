package day3;

public class StringExam {
    public static void main(String[] args) {

        String name ="Java";
        String job = "Programming";

        String str = "나는 \" "+ name + job + "\" 를 배웁니다.";
        System.out.println(str);

        str = "번호\t이름\t직업";
        System.out.println(str);

        /*나는
        자바 프로그래머 입니다.
        백엔드 개발자 과정을 수료했습니다.*/

        System.out.println("나는\n자바 프로그래머 입니다.\n백엔드 개발자 과정 이수중입니다.\n");

       //Java13부터 텍스트 블럭 제공

        String str2 = "" +"{\n" +
                    " \t\"id \" : \"silver\",\n" +
                    "}";
        System.out.println(str2);


     String str4 = """
                { 안녕하세요
                  반갑습니다.
                  id : silver
                  pwd : 0000
                }
             """;

        System.out.println(str4);
    }
}
