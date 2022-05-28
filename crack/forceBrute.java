public class forceBrute extends passwordCracker {
   
    
     public  static String attack(String motdepasse){  
        char caractere[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0'};    
        String passbrute="";
        //while(!(passbrute.toString().equals(motdepasse))){  
        for(int i=0;i<caractere.length;i++){
            //passbrute=;
            for(int j=0;j<caractere.length;j++){
                //passbrute+=caractere[j];
                for(int k=0;k<caractere.length;k++){
                   // passbrute+=caractere[k];

                    for(int l=0;l<caractere.length;l++){
                        //passbrute+=caractere[l];

                        for(int m=0;m<caractere.length;m++){
                             passbrute="";
                            passbrute+=caractere[i];
                            passbrute+=caractere[j];
                            passbrute+=caractere[k];
                            passbrute+=caractere[l];
                            passbrute+=caractere[m];
                            if(passbrute.equals(motdepasse)) return passbrute;
   
                            //System.out.println(passbrute);
                            
                        }
                    }
                }
            }
        }
        
    
    //}
    return passbrute;
}
    

public forceBrute(){

}
}
