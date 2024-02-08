package desafio2;

import java.util.Scanner;
import static desafio2.Moeda.definirDecimal;

public class Nota {

    private static Scanner scan = new Scanner(System.in);
    private static Double valorMonetario = 0.00d;
    private static Integer numeroNotas100 = 0;
    private static Integer numeroNotas50 = 0;
    private static Integer numeroNotas20 = 0;
    private static Integer numeroNotas10 = 0;
    private static Integer numeroNotas5 = 0;
    private static Integer numeroNotas2 = 0;

    public static void definirValorMonetario(){
        System.out.println("Digite o valor monetário:");
        valorMonetario = scan.nextDouble();
    }

    public static void menorNumeroNotas(){
        notas100();
        notas50();
        notas20();
        notas10();
        notas5();
        notas2();

        definirDecimal(valorMonetario);
    }

    public static void notas100(){
        while(valorMonetario >= 100.00d){
            valorMonetario = valorMonetario - 100.00d;
            numeroNotas100++;
        }
    }

    public static void notas50(){
        while(valorMonetario >= 50.00d){
            valorMonetario = valorMonetario - 50.00d;
            numeroNotas50++;
        }
    }

    public static void notas20(){
        while(valorMonetario >= 20.00d){
            valorMonetario = valorMonetario - 20.00d;
            numeroNotas20++;
        }
    }

    public static void notas10(){
        while(valorMonetario >= 10.00d){
            valorMonetario = valorMonetario - 10.00d;
            numeroNotas10++;
        }
    }

    public static void notas5(){
        while(valorMonetario >= 5.00d){
            valorMonetario = valorMonetario - 5.00d;
            numeroNotas5++;
        }
    }

    public static void notas2(){
        while(valorMonetario >= 2.00d){
            valorMonetario = valorMonetario - 2.00d;
            numeroNotas2++;
        }
    }

    public static void relacaoNotas(){
        System.out.println("Notas de 100 reais: " + numeroNotas100);
        System.out.println("Notas de 50 reais: " + numeroNotas50);
        System.out.println("Notas de 20 reais: " + numeroNotas20);
        System.out.println("Notas de 10 reais: " + numeroNotas10);
        System.out.println("Notas de 5 reais: " + numeroNotas5);
        System.out.println("Notas de 2 reais: " + numeroNotas2);
    }

}
