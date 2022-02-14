public class Main {

    public static void main(String[] args) {

       Car car1 = new Car();
       Car car2 = new Car(2005, 150, "yellow", 180.0, "BMW");
       Car car3 = new Car(2020, 200, "red", 250, "Ford");
       car1.engineTuning();
       car2.setColor("Blue");
       car3.setColor("Orange");
       car1.printParameters();

    }
}
