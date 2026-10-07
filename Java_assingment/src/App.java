import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Kia");
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Renault");

        // i want to add ford after kia and remove tesla and put audi in 3rd place
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        cars.add(1, "Ford");

        cars.remove("Tesla");

        cars.set(2, "Audi");

        System.out.println("MODIFIED LIST");
        // want to print the array
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        Collections.sort(cars);

        System.out.println("SORTED LIST");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
         System.out.println("Please Choose one of the cars :");
         String car=in.nextLine();
          System.out.println("You choose :" + car);

    }
}
