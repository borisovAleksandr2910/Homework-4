import java.util.Arrays;

public class Car {

    private final int year;
    private int horsePower;
    private String color;
    private double speedMax;
    private final String brand;


    public Car() {
        this(1999, 90, "white", 150.0, "Toyota");
    }

    public Car(int a, int b, String c, double d, String e) {
        this.year = a;
        this.horsePower = b;
        this.color = c;
        this.speedMax = d;
        this.brand = e;
    }

    public void engineTuning() {
        horsePower += 20;
        speedMax += 15.0;
    }

    private String[] getParameters (){
        String[] parameters = new String[5];
        parameters[0] = String.valueOf(year);
        parameters[1] = String.valueOf(horsePower);
        parameters[2] = color;
        parameters[3] = String.valueOf(speedMax);
        parameters[4] = brand;
        System.out.println(Arrays.toString(parameters));
        return parameters;
    }
    public void printParameters(){
        getParameters();
    }


    void setColor(String recolor) {
        this.color = recolor;
    }

    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getColor() {
        return color;
    }

    public double getSpeedMax() {
        return speedMax;
    }

    public String getBrand() {
        return brand;
    }
}
