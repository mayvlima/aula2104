package exercicio7;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de anos: ");
        Integer anos = sc.nextInt();

        System.out.print("Digite o número de meses: ");
        Integer meses = sc.nextInt();

        System.out.print("Digite o número de dias: ");
        Integer dias = sc.nextInt();

        Integer totalDiaAnos = anos * 365;
        Integer totalDiaMeses = meses * 30;

        Integer idade = totalDiaAnos + totalDiaMeses + dias;

        System.out.println("A idade total é " + idade + " dias");
    }
}
