//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//X, se for o caso.



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

         for (x = 1; x <=100; x = x + 2){
         System.out.println(x);
        }
        System.out.println("fim");

        sc.close();
    }

}
