package curso_programação_switch_case;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);        
        
        int x = sc.nextInt();
        String dia;
        
        switch(x) {
        case 1:
            dia = "domingo";
            break;
        case 2:
            dia = "segunda";
            break;
        case 3:
            dia = "terca";
            break;
        case 4:
            dia = "quarta";
            break;
        case 5:
            dia = "quinta";
            break;
        case 6:
            dia = "sexta";
            break;
        case 7:
            dia = "sabado";
            break;
        default:
            dia = "Nao e nenhum dia da semana";
            break;            
        }
        
        System.out.printf("Hoje é dia: " + dia);
        sc.close();  

    }

}
