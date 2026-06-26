//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 0; i<=x; i++) {
            double y = sc.nextDouble();
            double z = sc.nextDouble();

            if (z == 0) { //verificação
                System.out.println("Divisão impossivel");
            } else { 
                double soma = y / z;
                System.out.println(soma);
            }
        }
        sc.close();
    }

}
