import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Kia");
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Renault");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        cars.add(1, "Ford");

        cars.remove("Tesla");

        cars.set(2, "Audi");

        System.out.println("MODIFIED LIST");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        Collections.sort(cars);

    
        System.out.println("SORTED LIST");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}

