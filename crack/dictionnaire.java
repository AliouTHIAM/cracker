import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class dictionnaire extends passwordCracker {

    public static String attack(String motdepasse) throws FileNotFoundException{
        File dico=new File("/home/perepogba/design_pattern/crack/dico2.txt");
        Scanner dicoScan= new Scanner(dico);
        String passDico="";
        while(dicoScan.hasNext() && !(passDico.equals(motdepasse))){
            passDico=dicoScan.nextLine();
            
        }
        if(!(passDico.equals(motdepasse))){
            passDico="";
        }

        return passDico;
    }
    public dictionnaire(){

    }
    
}
