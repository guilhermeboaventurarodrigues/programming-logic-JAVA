import java.util.Scanner;

public class Exercicio4ImparOuPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é impar ou par: ");
        int number = sc.nextInt();

        int result = number % 2;

        if (result == 0) {
            System.out.println("O número " + number + " é par");
        } else {
            System.out.println("O número " + number + " é impar");
        }
    }
}
