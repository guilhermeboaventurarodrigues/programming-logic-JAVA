import java.util.Scanner;

public class Exercicio12SomaArraysFor {
    public static void main(String[] args) {
        int[] v1 = new int[9];
        int[] v2 = new int[9];
        int[] v3 = new int[9];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < v1.length; i++) {
            System.out.println("Digite o número "+ (i+1) + " do primeiro array: ");
            v1[i] = sc.nextInt();
            System.out.println("Digite o número "+ (i+1) + " do segundo array: ");
            v2[i] = sc.nextInt();
        }

        for (int i = 0; i < v3.length; i++) {
            v3[i] = v1[i] * v2[i];
            System.out.println(v3[i]);
        }
    }
}
