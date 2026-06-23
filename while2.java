
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int codigo = sc.nextInt();

        while (codigo > 0 && codigo != 4) {

            if (codigo == 1) {
                alcool++;
            } else if (codigo == 2) {
                gasolina++;
            } else if (codigo == 3) {
                diesel++;
            }
            codigo = sc.nextInt();

        }
        System.out.println("MUITO OBRIGADO!!");
        System.out.println("Alcool:" + alcool);
        System.out.println("Gasolina:" + gasolina);
        System.out.println("Diesel:" + diesel);
        sc.close();
    }
}
