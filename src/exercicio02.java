import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        var nome = input.nextLine();
        System.out.printf("Olá! %s", nome);

    }
}