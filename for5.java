//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//exemplo.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) { //verifação de positivo é feito no i= 1
            // o system vai por ordem numero, quadrado, cubo (porém a quebra vai pelo print)
            System.out.print(i + " "); // n° da linha // usa o print (sem o ln) para por na mesma linha, e as aspas indica o espaço
            System.out.print((i * i) + " "); //quadrado
            System.out.println(i * i * i); //cubo
            }

        sc.close();
        }
    }
