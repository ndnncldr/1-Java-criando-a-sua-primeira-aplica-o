import java.util.Scanner;

public class VerificarPositivoNegativo {
    public static void main(String[] args) {
/*      Crie um programa que solicite ao usuário digitar um número.Se o número for positivo, exiba
        "Número positivo", caso contrário, exiba "Número negativo".*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = sc.nextInt();

        if (numero >= 0) {
            System.out.printf("Número %d é positivo", numero);
        } else {
            System.out.printf("Número %d é negativo", numero);
        }

    }
}