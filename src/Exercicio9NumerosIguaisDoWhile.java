import java.util.Scanner;

public class Exercicio9NumerosIguaisDoWhile {
    public static void main(String[] args) {
        boolean gameExecute = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Olá Jogador 1, digite um número: ");
            int number1 = sc.nextInt();
            System.out.println("Olá Jogador 2, digite um número: ");
            int number2 = sc.nextInt();

            if (number1 == number2) {
                System.out.println("Os números são iguais!");
            } else {
                System.out.println("Os números são diferentes!");
            }

            System.out.println("Deseja continuar? Digite 1 para sim e 2 para não");
            int continueGame = sc.nextInt();
            if (continueGame == 2) {
                gameExecute = false;
            }
        } while (gameExecute);
        System.out.println("Programa finalizado!");
    }
}
