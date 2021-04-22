package exercicio3;

public class Instrucoes {

    public static void main(String[] args) {
        Integer a1 = (4/2) + (2/4);
        Integer a2 = 4/2 + 2/4;

        Integer b1 = 4/(2+2)/4;
        Integer b2 = 4/2 + 2/4;

        Integer c1 = (4+2)*2-4;
        Integer c2 = 4+2*2-4;


        System.out.println("(4/2) + (2/4) = " + a1);
        System.out.println("4/2 + 2/4 =  " + a2);

        System.out.println("\n4/(2+2)/4 = " + b1);
        System.out.println("4/2 + 2/4 = " + b2);
        System.out.println("O cálculo dentro do parênteses é feito primeiro, por isso o resultado não é igual! ");

        System.out.println("\n(4+2)*2-4 = " + c1);
        System.out.println("4+2*2-4 = " + c2);
        System.out.println("Na segunda opção o cálculo da multiplicação dever ser feito primeiro e depois as somas," +
                " o que faz os resultados serem diferentes!");
    }
}
