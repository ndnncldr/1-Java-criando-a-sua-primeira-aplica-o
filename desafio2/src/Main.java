public class Main {
    public static void main(String[] args) {

//    1 Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        System.out.println("A média das suas notas é " + (9.7 + 6.5)/2 + ".");

/*    2 Declare uma variável do tipo double e uma variável do tipo int. Faça o casting
      da variável double para int e imprima o resultado.*/
        double variavelDouble = 948.53;
        int variavelInt = (int) variavelDouble;
        System.out.println(variavelInt);

/*    3 Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
      Atribua valores a essas variáveis e concatene-as em uma mensagem.*/
        char letra = 'O';
        String palavra= "lá";
        System.out.println(letra + palavra);

/*    4 Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
      Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o
      resultado em uma mensagem.*/
        double precoProduto = 39.9;
        int qtd = 3;
        System.out.printf("Você está prestes a comprar %d camisetas por R$ %.2f. O total é de R$%.2f."
                                        , qtd, precoProduto, qtd * precoProduto);

/*     5 Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa
      variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão
      do valor em dólares para reais e imprima o resultado formatado.*/
        double valorEmDolares = 10;
        System.out.println();
        System.out.printf("O valor do Github Copilot Individual é de R$%.2f.", valorEmDolares * 4.94);

/*     6. Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
      representando o preço original de um produto. Em seguida, declare uma variável do tipo double
      percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
      Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.*/
        double precoOriginal = 39.90;
        double percentualDesconto = 10.0;
        double valorDesconto = (precoOriginal * (percentualDesconto/100));
        System.out.println();
        System.out.printf("Com um desconto de %.0f%%, R$%f, a camiseta está saindo de %.2f por %.2f!"
                          , percentualDesconto, valorDesconto, precoOriginal, precoOriginal - valorDesconto);

    }
}