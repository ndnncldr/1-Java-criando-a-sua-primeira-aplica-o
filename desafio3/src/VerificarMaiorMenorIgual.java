import java.util.Scanner;

public class VerificarMaiorMenorIgual {
    public static void main(String[] args) {
/*      Peça ao usuário para inserir dois números inteiros.Compare os números e imprima uma mensagem indicando
       se são iguais, diferentes, o primeiro é maior ou o segundo é maior.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero1 = sc.nextInt();
        System.out.println("Digite outro número");
        int numero2 = sc.nextInt();

        if (numero1 == numero2) {
            System.out.printf("Número %d e número %d são iguais", numero1, numero2);
        } else if (numero1 > numero2) {
            System.out.printf("Número %d é maior que número %d", numero1, numero2);
        } else {
            System.out.printf("Número %d é menor que número %d", numero1, numero2);
        }


    }
}
