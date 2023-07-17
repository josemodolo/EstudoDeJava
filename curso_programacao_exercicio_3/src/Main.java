import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        int funcNum = sc.nextInt();
        int timeWork = sc.nextInt();
        Double payment = sc.nextDouble();
        
        Double calculation = ( timeWork * payment );
        
        System.out.println("NUMBER = " + funcNum);
        System.out.println("SALARY = " + calculation);
        
        sc.close();  

    }

}
