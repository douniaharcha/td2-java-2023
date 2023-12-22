package TD2EX4;

public class Main {
    public static void main(String[] args){
        Temps t=new Temps(2,5,6);
        System.out.println(t.toString());
        t.ajouterMinutes(120);
        System.out.println(t);
        t.ajouterSecondes(300);
        System.out.println(t);

    }
}
