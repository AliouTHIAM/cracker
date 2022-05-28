import java.io.FileNotFoundException;

public class fabriquePassword {
  
        
    
    public static String getInstance(String motdepass,int choix) throws FileNotFoundException{
        String password="";
        if(motdepass!="" && choix==1){
            password=new forceBrute().attack(motdepass);
        } 
        else if(motdepass!="" && choix==2){
            new dictionnaire();
            password= new dictionnaire().attack(motdepass);
        }
        return password;
    }


}
