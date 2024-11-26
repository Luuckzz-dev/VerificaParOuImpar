import java.util.Scanner;

public class VerificaParOuImpar {
    public static void main(String[] args) {
        // Criação do scanner para leitura de dados do usuário
        Scanner sc = new Scanner(System.in);

        // Solicita a entrada do número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}
