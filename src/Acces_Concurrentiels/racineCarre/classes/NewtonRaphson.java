package Acces_Concurrentiels.racineCarre.classes;

public class NewtonRaphson implements Runnable {
    private int nb_iteration;
    private double x0;
    private double result;

    public NewtonRaphson(int nb_iteration, double x0) {
        this.nb_iteration = nb_iteration;
        this.x0 = x0;
    }
    public double getResult() {
        return result;
    }



    /**
     * Cette méthode surchargée aura pour but de executer la recherche d'approximation
     * chaque thread crée va executer cette méthode avec différent point de depart
     *
     * La suite utilisée est Xn+1 = Xn²-2/2xn*
     * @return la valeur proche de racine de deux avec une marge d'erreur.
     *
     * */
    @Override
    public void run() {
        double valeur_approximative = x0;
        System.out.println("Lancement du thread N° "+ Thread.currentThread().getName()+"....");
        for(int i=0; i<nb_iteration;i++){
            valeur_approximative = valeur_approximative - (valeur_approximative*valeur_approximative -2 ) /(2*valeur_approximative);
            System.out.println();
        }
        result = valeur_approximative;
        System.out.println("La valeur approximative est : "+result);
    }

}
