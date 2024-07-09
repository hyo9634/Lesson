package day2;

public class CarTest {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.company = "BMW";
        bmw.type = 'A';
        bmw.auto = true;
        bmw.year = 202410;
        bmw.gasmi = 20.5f;
        System.out.println(bmw.type);
        System.out.println(bmw.auto);
        bmw.setModel("BMW-1000");
        System.out.println(bmw.getModel());
        String model = bmw.getModel();
        System.out.println("현재 모델은" + model);
    }
}
