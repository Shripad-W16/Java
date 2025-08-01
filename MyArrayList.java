import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList {
    public static void main(String[] args) {
        long starttime = System.nanoTime();
        System.out.println("Start Time: " + starttime);

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("SUV");
        cars.add("SEDAN");
        cars.add("HATCHBACK");
        cars.add("MPV");

        ArrayList<Integer> NoOfTYRES = new ArrayList<Integer>();
        NoOfTYRES.add(2 * 4);  // SUV, HASH
        NoOfTYRES.add(4 * 4);  // SEDAN, MPL

        ArrayList<Integer> CC = new ArrayList<Integer>();
        CC.add(1000);  // SUV, SEDAN
        CC.add(1500);  // HATCHBACK
        CC.add(2000);  // MPV

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER CAR MODEL (SUV, SEDAN, HASH, MPL) TO KNOW ABOUT NO OF TYRES AND ITS CC:");
        String carInput = sc.nextLine();

        if (carInput.equals("SUV")) {
            System.out.println("Model: " + cars.get(0));
            System.out.println("Tyres: " + NoOfTYRES.get(0));
            System.out.println("CC: " + CC.get(0));
        } else if (carInput.equals("SEDAN")) {
            System.out.println("Model: " + cars.get(1));
            System.out.println("Tyres: " + NoOfTYRES.get(1));
            System.out.println("CC: " + CC.get(0));
        } else if (carInput.equals("HASH")) {
            System.out.println("Model: " + cars.get(2));
            System.out.println("Tyres: " + NoOfTYRES.get(0));
            System.out.println("CC: " + CC.get(1));
        } else if (carInput.equals("MPL")) {
            System.out.println("Model: " + cars.get(3));
            System.out.println("Tyres: " + NoOfTYRES.get(1));
            System.out.println("CC: " + CC.get(2));
        } else {
            System.out.println("Invalid car model entered.");
        }

        long stoptime = System.nanoTime();
        System.out.println("Stop Time: " + stoptime);
        System.out.println("Execution Time: " + (stoptime - starttime) + " nanoseconds");
    }
}
