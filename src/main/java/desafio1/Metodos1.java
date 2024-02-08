package desafio1;

import java.util.*;

public class Metodos1 {
    private static Scanner scan = new Scanner(System.in);
    private static Integer numeroMaxLinhas;
    private static Integer numeroDeLinhas = 1;
    private static List<Integer> numeros = new ArrayList<>();
    private static List<Integer> pares = new ArrayList<>();
    private static List<Integer> impares = new ArrayList<>();
    private static List<Integer> listaFinal = new ArrayList<>();


    public static void definirNumeroMaxLinhas(){
        System.out.println("Digite o número de linhas:");
        numeroMaxLinhas = scan.nextInt();
        System.out.println("Digite os números:");
    }

    public static void preencherListaNumeros(){
        while (numeroMaxLinhas >= numeroDeLinhas){
            Integer numeroScan = scan.nextInt();
            if(numeroScan >= 0){
                numeros.add(numeroScan);
                numeroDeLinhas++;
                if(numeroScan % 2 == 0)preencherListaPares(numeroScan);
                else preencherListaImpares(numeroScan);
            }
            else {
                System.out.println("Digite apenas valores positivos!");
            }
        }
    }

    public static void preencherListaPares(Integer numeroScan){
        pares.add(numeroScan);
    }

    private static void preencherListaImpares(Integer numeroScan) {
        impares.add(numeroScan);
    }

    public static void ordenar(){
        Collections.sort(pares);
        Collections.sort(impares);
    }

    public static void montarListaFinal(){
        for (int i = 0; i < pares.size(); i++){
            listaFinal.add(pares.get(i));
        }
        for (int i = impares.size() - 1; i >= 0; i--){
            listaFinal.add(impares.get(i));
        }
    }

    public static void mostrarEntrada(){
        System.out.println("\nOs valores digitados foram:");
        System.out.println("Número máximo de linhas: " + numeroMaxLinhas);
        System.out.println("Números digitados: " + numeros);
        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);
    }

    public static void mostrarSaida(){
        System.out.println("Lista final: " + listaFinal);
    }
}
