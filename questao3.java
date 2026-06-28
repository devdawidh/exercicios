import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] setores = {"Praça de Alimentação", "Loja Âncoras", "Cinemas", "Sanitários", "Administração"};
        float[] consumos = new float[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o consumo da [" + setores[i] + "]: ");
            consumos[i] = sc.nextFloat();
        }

        int opcao = 0;

        while (opcao != 3) {
            System.out.printf(" ");
            System.out.println("DIGITE O NUMERO PARA ESCOLHER A OPÇÃO!");
            System.out.println("             -MENU-");
            System.out.println(" |1|Consultar consumo de água");
            System.out.println(" |2|Exibir relatório geral");
            System.out.println(" |3|Sair.");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do setor: ");

                    sc.nextLine();
                    String nomeProcurado = sc.nextLine();

                    float consumoEncontrado = verConsumo(nomeProcurado, consumos, setores);
                    System.out.println("O setor " + nomeProcurado + " consumiu " + consumoEncontrado + " litros!");
                    break;

                case 2:
                    System.out.println("Relatorio Geral: ");

                    float consumoLitros = calcularConsumoTotal(consumos); //edit: precisa ser na ordem que foi criado, calcularConsumo e depois maiorSetor
                    String relatorioSetor = maiorSetor(consumos, setores);

                    System.out.println(relatorioSetor);
                    System.out.println(consumoLitros);
                    break;

                case 3:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
        sc.close();
    }

    public static float verConsumo(String nomeProcurado, float[] consumos, String[] setores) { // O verConsumo que criei no case 1 verifica aqui

        for (int i = 0; i < 5; i++) {
            if (nomeProcurado.equals(setores[i])) {
                return (consumos[i]);
            }
        }
        return 0.0f;

    }

    public static float calcularConsumoTotal(float[] consumos) { //calcula o consumo total do case 2
        float soma = 0.0f;

        for (int i = 0; i < 5; i++) {
            soma = soma + consumos[i];
        }
        return soma;
    }

    public static String maiorSetor(float [] consumos, String [] setores) { //mostra o setor que mais consumiu

        String maiorSetor = setores[0];
        float maiorConsumo = consumos[0];

        for (int i = 0; i < 5; i++) {
            if (consumos[i] > maiorConsumo) {
                maiorConsumo = consumos[i];
                maiorSetor = setores[i];
            }
        }
            return maiorSetor;
        }
    }
