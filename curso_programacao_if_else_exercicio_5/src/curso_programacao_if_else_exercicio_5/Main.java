package curso_programacao_if_else_exercicio_5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        int numero = sc.nextInt();
        int quantidade = sc.nextInt();
        
        double valor;        
        if ( numero == 1) {
            valor = quantidade * 4.0;
        } else if ( numero == 2) {
            valor = quantidade * 4.5;
        } else if ( numero == 3) {
            valor = quantidade * 5.0;
        } else if ( numero == 4) {
            valor = quantidade * 2.0;
        } else {
            valor = quantidade * 1.5;
        }
        
        System.out.printf("TOTAL: R$ %.2f%n", valor);
        
        sc.close();  

    }

}
