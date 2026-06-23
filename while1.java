import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        int y;

        System.out.println("Digite o Valor de X: ");
        x = sc.nextInt();
        System.out.println("Digite o Valor de Y: ");
        y = sc.nextInt();

        while (x != 0 && y != 0){

            if (x > 0 && y > 0) {
                System.out.println("PRIMEIRO");
            }
            else if (x < 0 && y > 0) {
                System.out.println("SEGUNDO");
            }
            else if (x < 0 && y < 0) {
                System.out.println("TERCEIRO");
            }
            else if (x > 0 && y < 0) {
                System.out.println("QUARTO");
            }
            System.out.println("Digite o Valor de X: ");
            x = sc.nextInt();
            System.out.println("Digite o Valor de Y: ");
            y = sc.nextInt();
        }

        sc.close();
    }

}
