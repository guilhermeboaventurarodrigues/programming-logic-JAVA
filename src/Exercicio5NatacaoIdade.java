import java.util.Scanner;

public class Exercicio5NatacaoIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String name = sc.nextLine();

        System.out.println("Qual sua idade?");
        double age = sc.nextDouble();

        if (age <= 10){
            System.out.println(name+" participará da categoria Infantil");
        } else if (age >= 11 && age <= 15){
            System.out.println(name+" participará da categoria Juvenil");
        } else if (age >= 16 && age <= 19){
            System.out.println(name+" participará da categoria Pré-Adulto");
        } else {
            System.out.println(name+" participará da categoria Adulto");
        }
    }
}
