import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
/*      Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
        Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 1 para calcular a área de um retângulo ou 2 para calcular a área de um círculo");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Digite o valor de um lado do retângulo");
                double ladoA = sc.nextDouble();
                System.out.println("Digite o valor do outro lado do retângulo");
                double ladoB = sc.nextDouble();
                System.out.printf("A área do retângulo é %.2f", ladoA * ladoB);
                break;
            case 2:
                System.out.println("Digite o valor do raio do círculo");
                double raio = sc.nextDouble();
                int area = (int) (3.142 * (raio * raio));
                System.out.printf("A área do círculo é %d", area);
                break;
        }

    }
}
