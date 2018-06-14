public class factorielle {
    public static void main(String[] args) {
        int factoriel = 1;
        int valeur;
        valeur = Integer.parseInt(args[0]);
        while (valeur > 1) {
               factoriel = factoriel * valeur;
               valeur = valeur - 1;
        }
        System.out.println("La factorielle est : " + factoriel);
    }
}

