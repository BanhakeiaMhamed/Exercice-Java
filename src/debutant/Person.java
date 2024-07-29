package debutant;

public class Person {
    private String nom;
    private int age;

    public Person() {
    }

    public Person(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    /**
     * @author BANHAKEIA
     * DisplayInfo de type void
     *
     * affiche nom et age
     * */
    public void displayinfo(){
        System.out.println("le nom de la personne est : "+this.nom);
        System.out.println("l'age de la personne est : "+this.age);
    }

    public void celebrateBirthday() {
        System.out.println("joyeux anniversaire.");
        this.age++;
    }
}
