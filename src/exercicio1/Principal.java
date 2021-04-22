package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        System.out.println("OLÁ!");

        System.out.print("Digite o valor de a: ");
        Integer a = sc.nextInt();

        System.out.print("Digite o valor de b: ");
        Integer b = sc.nextInt();

        System.out.print("Digite o valor de c: ");
        Integer c = sc.nextInt();

        System.out.print("Digite o valor de d: ");
        Integer d = sc.nextInt();

        System.out.print("\nDigite o valor de a2: ");
        Float a2 = sc.nextFloat();

        System.out.print("Digite o valor de b2: ");
        Float b2 = sc.nextFloat();

        Calculadora cal1 = new Calculadora(a,b,c,d);
        Calculadora cal2 = new Calculadora(a2,b2);

        list.add(cal1.somar(b,d));
        list.add(cal1.subtarir(b,d));
        list.add(cal1.dividir(b,d));
        list.add(cal1.multiplicar(b,d));

        cal1.historico(list);

    }
}
