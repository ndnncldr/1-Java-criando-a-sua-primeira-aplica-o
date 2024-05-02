import java.util.Scanner;

public class VerificarParImpar {

    public static void main(String[] args) {
/*      Crie um programa que solicite ao usuário a entrada de um número inteiro.
        Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("Número %d é par", numero);
        } else {
            System.out.printf("Número %d é ímpar", numero);
        }

    }
}
