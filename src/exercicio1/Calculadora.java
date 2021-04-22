package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    public Calculadora(){

    }

    public Calculadora(Integer a, Integer b, Integer c, Integer d){
        System.out.println("\nSomando pelo construtor com INTEGER");
        System.out.println("a = " + a);
        System.out.println("c = " + c);
        System.out.println("a + c = " +somar(a,c));
    }

    public Calculadora(Float a2, Float b2){
        System.out.println("\nSomando pelo construtor FLOAT");
        System.out.println("a2 = " + a2);
        System.out.println("b2 = " + b2);
        System.out.printf("a2 + b2 = %.2f", somar(a2,b2));
    }

    public Integer somar(Integer a, Integer b){
        return a + b;
    }

    public Float somar(Float a, Float b){
        return  a + b;
    }

    public Integer subtarir(Integer a, Integer b){
        return a - b;
    }

    public Integer dividir(Integer a, Integer b){
       if(b != 0){
           return a/b;
       }else{
           System.out.println("\n\nO divisor não pode ser zero!");
       }
       return null;
    }

    public Integer multiplicar(Integer a, Integer b){
        return a * b;
    }

    public void historico(List<Integer> list){
        System.out.println("\n\nOs resultados da soma, subtração, divisão e multiplicação de b com d " +
                "são respectivamente: ");

        for (int i=0; list.size() > i; i++){
            System.out.println(list.get(i));
        }
    }




}
