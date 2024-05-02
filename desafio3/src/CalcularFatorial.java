import java.util.Scanner;

public class CalcularFatorial {

    public static void main(String[] args) {
/*      Crie um programa que solicite ao usuário um número e calcule o fatorial desse número. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero ; i++) {
            fatorial *= i;
        }

        System.out.printf("O fatorial de %d é %d", numero, fatorial);
    }

}
