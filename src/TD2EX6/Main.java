package TD2EX6;

public class Main {
    public static void main(String[] args){
        Banque compte=new Banque(1,5000.75,"AB 1200");
        System.out.println(compte.avoirInformation());
        System.out.println("solde: "+compte.avoirSolde());
        compte.deposer(500);
        System.out.println(compte.avoirInformation());
        System.out.println("solde: "+compte.avoirSolde());
        compte.retirer(200);
        System.out.println(compte.avoirInformation());
        System.out.println("solde: "+compte.avoirSolde());
    }
}
