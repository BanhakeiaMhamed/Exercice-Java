package Ninja;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Bank  {
    public void performTransactions() {
        System.out.println("l'affichage des méthodes utilisées En utilisant Reflexion en Java  : ");
        displayMethodNamesOfbankAccount(BancKAccount.class);
        BancKAccount compte_1 = new BancKAccount("xxxxxx-A",1000);
        BancKAccount compte_2 = new BancKAccount("xxxxxx-B",5000);
        BancKAccount compte_3 = new BancKAccount("xxxxxx-C",2000);
        BancKAccount compte_4 = new BancKAccount("xxxxxx-D",10000);

        Transaction t1= new Transaction(compte_1,true,false,100);
        Transaction t2= new Transaction(compte_2,false,true,1000);
        Transaction t3= new Transaction(compte_3,true,false,700);
        Transaction t4= new Transaction(compte_4,false,true,10);

        Thread bougueTelecom = new Thread(t1,"bougueTelecom");
        Thread edf = new Thread(t2, "edf");
        Thread axa = new Thread(t3, "axa");
        Thread fitnesspark = new Thread(t4, "fitnesspark");
        Thread assuranceAuto = new Thread(t1, "assuranceAuto");
        Thread assuranceAuto_conjoint = new Thread(t2, "assuranceAuto_conjoint");
        Thread resto = new Thread(t3, "assuranceAuto_conjoint");

        try {
            bougueTelecom.start();
            bougueTelecom.join();
            assuranceAuto.start();
            assuranceAuto.join();

            edf.start();
            edf.join();
            assuranceAuto_conjoint.start();
            assuranceAuto_conjoint.join();

            axa.start();
            axa.join();
            resto.start();
            resto.join();

            fitnesspark.start();
            fitnesspark.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Apres les transactions: ");
        displayMethodNamesOfbankAccount(BancKAccount.class);
        System.out.println("######"+compte_1);
        System.out.println("######"+compte_2);
        System.out.println("######"+compte_3);
        System.out.println("#####"+compte_4);

    }

    public void displayMethodNamesOfbankAccount(Class<?> clazz){

        System.out.println("Methodes of Class"+clazz.getName()+":");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method: methods) {
            System.out.println(method.getName());
        }
        System.out.println();
    }


}
