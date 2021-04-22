package exercicio9;

import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inicial do salário: ");
        Float salario = sc.nextFloat();

        System.out.print("Digite percentual de reajuste: ");
        Float percentual = sc.nextFloat();

        Float total =  salario + (salario/100 * percentual);

        System.out.printf("\nO valor do novo salário é: R$ %.2f", total);
    }
}
