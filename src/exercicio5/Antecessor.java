package exercicio5;

import java.util.Scanner;

public class Antecessor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        Integer i = sc.nextInt();

        Integer a = i - 1;

        System.out.println("O número antecessor de " + i + " é: " + a);
    }
}
