package intermediaire;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer une valeur");
        String userValue = sc.next();


        try {
            while(!userValue.toLowerCase().equals("stop")){
                Integer x = Integer.parseInt(userValue);
                integers.add(x);
                System.out.println(integers);
                userValue = sc.next();
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } finally {
            Integer maximum= UtilsMaths.findMax((ArrayList<Integer>) integers);
            System.out.println("The maximum is "+ maximum);
            System.out.println("The minimum is "+  UtilsMaths.findMin((ArrayList<Integer>) integers));
        }
    }
}
