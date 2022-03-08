import java.util.Scanner;
public class SpprissionValeurTableau {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("entrer taille du tableau : ");
        int n=sc.nextInt();
        int tab[]=new int[n];
        // sasire elements
        for (int i = 0; i < tab.length; i++) {
            System.out.print("entrer element "+i+" ");
            tab[i]=sc.nextInt();
        }

        //affichage le tableau
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        // operation a faire
        System.out.print("quel valeur vous voulez supprimer ? ");
        int valSupp=sc.nextInt();
        for(int i=0;i<tab.length;i++) {
            if((tab[i]==valSupp)) {
                for(int j=i;j<tab.length-1;j++) {
                    tab[i]=tab[i+1];
                    i++;
                }
            }
           
        }
        //affichage final du tableau
        for (int i = 0; i < tab.length-1; i++) {
            System.out.println(tab[i]);
        }
        
    }
    
}
