import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        System.out.println(numeroAleatorio);
        int numeroDigitado;
        int tentativas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tente adivinhar o número aleatório, você tem só 5 tentativas.");

        for (tentativas = 0; tentativas < 5 ; tentativas++) {
            numeroDigitado = sc.nextInt();

            if (numeroDigitado == numeroAleatorio) {
                System.out.printf("Parabéns, você acertou o número %d", numeroAleatorio);
                break;
            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("Que pena, o número aleatório é maior =/");
            } else {
                System.out.println("Que pena, o número aleatório é menor =/");
            }

        }

        if (tentativas == 5) {
            System.out.println("Você perdeu, tente novamente");
        }



    }
}