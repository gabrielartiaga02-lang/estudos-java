import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o primeiro valor:");
        var valor1 = input.nextDouble();
        System.out.println("Informe o segundo valor:");
        var valor2 = input.nextDouble();
        var resultadoSoma = valor1 + valor2;
        System.out.printf("O resultado da soma é: %.2f\n", resultadoSoma);
        var resultadoSubtracao = valor1 - valor2;
        System.out.printf("O resultado da subtração é: %.2f\n", resultadoSubtracao);
        var resultadoMultiplicacao = valor1 * valor2;
        System.out.printf("O resultado da multiplicação é: %.2f\n", resultadoMultiplicacao);
        if (valor2 != 0) {
            var resultadoDivisao = valor1 / valor2;
            System.out.printf("O resultado da divisão é: %.2f\n", resultadoDivisao);
        } else {
            System.out.println("Não foi possível dividir por zero!\n");
        }

        input.close();
    }
}