import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double x = 4.f;

        while(x!=0.f){
            System.out.print("Donnez un nombre positif : ");
            x = sc.nextDouble();
            if(x>0) System.out.println("sa racine carree est : "+Math.sqrt(x));
            else System.out.println("svp positif");
            System.out.println();
        }

        System.out.println("Merci, A bientôt");

        sc.close();
    }
}
