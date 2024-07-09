package day2;

public class Car {
    //멤버변수
    private String model;
    private long distance;
    private int price;
    String company;
    char type;
    boolean auto;
    int year;
    float gasmi;
    //동작 메소드


    public String getModel() {
        return this.model;
    }

    public long getDistance() {
        return distance;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
