package exercicio6;

import java.util.Scanner;

public class AreaRetangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da base do retângulo: ");
        Float base = sc.nextFloat();

        System.out.print("Digite o valor da altura do retêngulo: ");
        Float altura = sc.nextFloat();

        Float area = base * altura;

        System.out.printf("A área do retângulo é %.2f",area);
    }
}
