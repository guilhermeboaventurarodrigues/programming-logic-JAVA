import java.util.Scanner;

public class Exercicio2Idades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma idade: ");
        int age = sc.nextInt();

        // =, !=, >, <, >=, <=
        if(age >= 18){
            System.out.println("Adulto");
        } else {
            System.out.println("Não adulto");
        }
    }
}
