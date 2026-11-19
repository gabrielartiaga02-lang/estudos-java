import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o primeiro valor:");
        var valor1 = input.nextInt();
        System.out.println("Informe o segundo valor:");
        var valor2 = input.nextInt();
        var resultado = valor1 + valor2;
        System.out.printf("O resultado é: %d", resultado);

    }
}