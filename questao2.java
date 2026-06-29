import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ordem;

        do {
            System.out.println("Digite a ordem (entre 1 e 10): ");
            ordem = sc.nextInt();
            if (ordem < 1 || ordem > 10) System.out.println("Valor invalido! ");
        } while (ordem < 1 || ordem > 10);

        int[][] matriz = new int[ordem][ordem];

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                matriz[i][j] = (j < i) ? 0 : i + 0; // 
                System.out.print("|" + matriz[i][j]);
            }
            System.out.println("|");
        }

        System.out.println("\nDigite o número da linha que deseja somar: ");
        int linha = sc.nextInt();

        if (linha < 0 || linha >= ordem) {
            System.out.println("Linha inválida!");
        } else {
            int soma = 0;
            for (int j = 0; j < ordem; j++) soma += matriz[linha][j];
            System.out.println("A soma da linha " + linha + " é: " + soma);
        }
        sc.close();
    }
}
