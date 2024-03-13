import java.util.Scanner;

public class Exercicio1Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de  um salário: ");
        double salary = sc.nextInt();

        System.out.println("Digite a porcentagem que você quer saber desse salário: ");
        double percentage = sc.nextInt();

        double result = (salary * (percentage / 100));

        System.out.println(percentage + "% do salário " + salary + " é igual a: " + result);
    }
}
