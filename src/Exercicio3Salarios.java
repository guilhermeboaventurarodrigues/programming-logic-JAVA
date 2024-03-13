import java.util.Scanner;

public class Exercicio3Salarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um salário:");
        double salary = sc.nextDouble();
        double result = 0;

        if (salary >= 4500) {
            result = salary * 0.3;
            System.out.println("30% do seu salário é: " + result);
        } else {
            result = salary * 0.15;
            System.out.println("15% do seu salário  é: " + result);
        }
    }
}
