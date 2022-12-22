package lesson4;

import java.util.Scanner;

public class HwMain {
    public static void main(String[] args) {

        System.out.println("Enter the Toy ID: ");
        Hw5 hw5 = new Hw5();
      Scanner scanner = new Scanner(System.in);
       // hw5.getToyById(12);

       int toyID = scanner.nextInt();
       hw5.getToyById(toyID);
        String toyName = hw5.getToyById(toyID);
       System.out.println(toyName);


        //hw5.getDay(int day);

       //String result = hw5.getDay(6);
      //  System.out.println(result);

       //hw5.arrayListNames();

    }
}
