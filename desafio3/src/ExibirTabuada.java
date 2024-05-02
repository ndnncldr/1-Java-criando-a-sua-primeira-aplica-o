import java.util.Scanner;

public class ExibirTabuada {
    public static void main(String[] args) {
/*      Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 número");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%d x %d = %d \n", numero, i, numero * i);
        }

    }
}
