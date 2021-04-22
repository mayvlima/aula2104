package exercicio10;

import java.util.Scanner;

public class ValorCarro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        Float custo = sc.nextFloat();

        Float total = custo + (custo/100 * 28 * 45);

        System.out.printf("O valor final do carro é R$ %.2f", total);
    }
}
