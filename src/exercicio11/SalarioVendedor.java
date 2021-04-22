package exercicio11;

import java.util.Scanner;

public class SalarioVendedor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de carro vendidos: ");
        Float qtd = sc.nextFloat();

        System.out.print("Digite o valor total de vendas: ");
        Float vendas = sc.nextFloat();

        System.out.print("Digite o valor do sálario fixo do funcionário: ");
        Float fixo = sc.nextFloat();

        System.out.print("Digite o valor da comissão fixa por carro vendido: ");
        Float comissao = sc.nextFloat();

        Float total = fixo + (comissao * qtd) + (vendas/100 * 5);

        System.out.printf("\nO valor final do sálario é R$ %.2f", total);



    }
}
