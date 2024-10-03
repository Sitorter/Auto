//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Vechicle {
    private String name;
    private String color;
    private int year;
    public Vechicle(String name, String color, int year) {
        this.name = name;
        this.color = color;
        this.year = year;

    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }

}
class Car extends Vechicle {
    private String engine;
    public Car(String name, String color, int year, String engine) {
        super(name, color, year);
        this.engine = engine;

    }
    public String getEngine() {
        return engine;
    }
}
public class Main {
    public static void main(String[] args) {
    Car car = new Car("Kia", "Black", 2024, "2.0");
    System.out.println(car.getColor());
    System.out.println(car.getYear());
    System.out.println(car.getName());
    System.out.println(car.getEngine());
    }
}