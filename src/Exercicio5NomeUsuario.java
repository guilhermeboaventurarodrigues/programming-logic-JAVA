import java.util.Scanner;

public class Exercicio5NomeUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu usuário de login: ");
        String login = sc.nextLine();

        if(login.equals("") || login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrador")){
            System.out.println("Usuário invalido");
        } else {
            System.out.println(login + " cadastrado com sucesso!");
        }
    }
}
