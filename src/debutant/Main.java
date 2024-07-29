package debutant;

import debutant.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercice : Gestion de la mémoire et POO (Classes et Objets)");
        Person personne = new Person("BANHAKEIA",29);
        personne.displayinfo();
        personne.celebrateBirthday();
        try{
            List<Integer> listNombre = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            String valueUser = sc.next();
           while (!valueUser.toLowerCase().equals("stop")) {

            Integer valeurInteger = Integer.parseInt(valueUser);

            listNombre.add(valeurInteger);
            System.out.println(listNombre);
            valueUser = sc.next();
            }

        }catch (NumberFormatException e){
            System.out.println("Invalid integer ");
        }



    }
}
