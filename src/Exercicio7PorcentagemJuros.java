import java.util.Scanner;

public class Exercicio7PorcentagemJuros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do tipo de conta que você deseja ver a porcentagem de juros.");
        System.out.println("Conta Poupança - 1 ");
        System.out.println("Conta Corrente - 2 ");
        System.out.println("Conta Investimento - 3 ");
        int numberAccount = sc.nextInt();

        switch (numberAccount) {
            case 1:
                System.out.println("A conta poupança tem 0.05% de juros");
                break;
            case 2:
                System.out.println("A conta corrente tem 0.02% de juros");
                break;
            case 3:
                System.out.println("A conta investimento tem 0.1% de juros");
                break;
            default:
                System.out.println("Número inválido, digite uma das opções acima :)");
        }
        System.out.println("Fim do programa :)");
    }
}
