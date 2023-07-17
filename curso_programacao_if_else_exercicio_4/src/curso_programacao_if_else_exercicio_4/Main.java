package curso_programacao_if_else_exercicio_4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        int horaIni = sc.nextInt();
        int horaFin = sc.nextInt();
        int duracao;
        
        if (horaIni < horaFin) {
            duracao = horaFin - horaIni;
        }
        else {
            duracao = 24 - horaIni + horaFin;
        }
        
        System.out.println("O JOGO DUROU " + duracao + " HORAS");
        sc.close();

    }

}
