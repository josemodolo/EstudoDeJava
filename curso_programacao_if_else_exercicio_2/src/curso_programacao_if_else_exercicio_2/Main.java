package curso_programacao_if_else_exercicio_2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
//PROGRAMA QUE IDENTIFICA SE O NUMERO DIGITADO É IMPAR OU PAR
    
    public static void main(String[] args) {        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
                    
            int number = sc.nextInt();
            
            if (number % 2 == 0) {
                System.out.println("PAR");
            }
            else {
                System.out.println("IMPAR");
            }
            
        sc.close(); 
    }

}
