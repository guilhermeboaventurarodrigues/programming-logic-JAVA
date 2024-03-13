import java.util.Scanner;

public class Exercicio8ImparesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número que eu irei imprimir todos os números ímpares até ele");
        int number = sc.nextInt();
        int counter = 0;

        while(counter <= number){
            counter += 1;
            if (counter % 2 == 1){
                System.out.println("Contando: "+counter);
            }
        }
    }
}