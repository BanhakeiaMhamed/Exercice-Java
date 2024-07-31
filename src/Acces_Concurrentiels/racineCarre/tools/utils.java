package Acces_Concurrentiels.racineCarre.tools;

public class utils {
    /**
     * La meilleur approximation serait celle qui vérifie l'equation du depart
     *
     * x²-2 ~ 0
     *
     * */
    public static double meilleureApproximation(double[] values) {
        double theBestvalue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (Math.abs(theBestvalue * theBestvalue - 2) > Math.abs(values[1] * theBestvalue - 2)) {
                theBestvalue = values[1];
            }
        }
        return theBestvalue;
    }
}
