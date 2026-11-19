import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        var nome = input.nextLine();
        System.out.println("Informe sua idade:");
        var idade = input.nextInt();
        System.out.printf("Olá %s, sua idade é %d\n", nome, idade);

    }
}