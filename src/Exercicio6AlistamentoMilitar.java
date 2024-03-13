import java.util.Scanner;

public class Exercicio6AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu sexo (Apenas M ou F): ");
        char sexo = sc.next().charAt(0);

        System.out.println("Digite sua idade: ");
        double age = sc.nextDouble();

        if (sexo != 'M' && sexo != 'F'){
            System.out.println("Digite apenas M ou F");
        } else if (sexo == 'M' && age >= 18){
            System.out.println("Alistamento Obrigatório");
        } else if (sexo == 'M' && age < 18) {
            System.out.println("Alistamento não permitido");
        } else if (sexo == 'F' && age >= 18){
            System.out.println("Deseja se alistar? ");
        } else {
            System.out.println("Alistamento não permitido");
        }
    }
}