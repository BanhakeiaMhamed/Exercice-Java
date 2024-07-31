package Acces_Concurrentiels.racineCarre;

import Acces_Concurrentiels.racineCarre.classes.NewtonRaphson;
import Acces_Concurrentiels.racineCarre.tools.utils;

public class Main {
    /**
     * nous allons simuler la recheche de l'approximation en utilisant 4 threads.
     * */
    public static void main(String[] args) {
        int nb_iteration = 1000;
        double results[]={0,0,0,0};
        double[] list_valeur_depart = {0.5,1,1.5,0.09};
        Thread[] threads = new Thread[list_valeur_depart.length];

        NewtonRaphson[] newtonRaphsonsTask = new NewtonRaphson[list_valeur_depart.length];

        for(int i = 0; i<list_valeur_depart.length; i++) {
            newtonRaphsonsTask[i] = new NewtonRaphson(nb_iteration,list_valeur_depart[i]);
            threads[i] = new Thread(newtonRaphsonsTask[i]);
            threads[i].start();
        }

        try {
            for(int i =0;i<threads.length; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        /**
         * chercher la meilleure approximation*/
        for(int i = 0; i<newtonRaphsonsTask.length;i++) {
             results[i] = newtonRaphsonsTask[i].getResult();
        }
        System.out.println("La meilleure Approximation : "+ utils.meilleureApproximation(results));
    }
}
