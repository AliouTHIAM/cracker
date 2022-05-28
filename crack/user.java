import java.io.FileNotFoundException;
import java.util.Scanner;

public class user {
    private static String aTrouver="suiei";
    public static void main(String[] args) throws FileNotFoundException{

        Scanner sc=new Scanner(System.in);
        //System.out.println("Saisissez le mot de passe");
        //String aTrouver=sc.nextLine();
        System.out.println("Choisissez 1 pour force brute ou 2 pour dictionnaire");
        int choix=sc.nextInt();
    
    
          String result=fabriquePassword.getInstance(aTrouver,choix);
          if(result.equals("")){
              System.out.println("Le code n'est pas trouvé");
          }
          else{
              System.out.println("Le code est "+result);
          }
    
      }
    
}
