package exercicio8;

import java.util.Scanner;

public class Percentual {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores: ");
        Double total = sc.nextDouble();

        System.out.print("Digite o número total de votos VÁLIDOS: ");
        Double validos = sc.nextDouble();

        System.out.print("Digite o número total de votos BRANCOS: ");
        Double brancos = sc.nextDouble();

        System.out.print("Digite o número total de votos NULOS: ");
        Double nulos = sc.nextDouble();

        Double percentualValidos = validos * 100 /total;
        Double percentualBrancos = brancos * 100/total;
        Double percentualNulos = nulos * 100/total ;


        System.out.println("\nVotos Válidos: " + percentualValidos + "%");
        System.out.println("Votos Brancos: " + percentualBrancos + "%");
        System.out.println("Votos Nulos: " + percentualNulos + "%");
    }
}
