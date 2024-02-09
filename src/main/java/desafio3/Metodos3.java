package desafio3;

import java.util.Arrays;
import java.util.Scanner;

public class Metodos3 {

    public static void preencherArray(Integer arr[], Scanner scan) {
        System.out.println("Digite o vetor:");
        for (int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
    }

    public static Integer paresDiferenca(Integer arr[], Integer k){
        Integer numeroPares = 0;
        Integer diferenca;
        for (int i = 0; i < arr.length - 1; i++){
            diferenca = arr[i+1] - arr[i];
            if (diferenca == k){
                numeroPares++;
            }
        }
        return numeroPares;
    }

    public static void mostrarEntradas(Integer n, Integer k, Integer arr[]){
        System.out.println("Tamanho do array: " + n);
        System.out.println("Valor alvo: " + k);
        System.out.println("Array: " + Arrays.asList(arr));
    }

    public static void mostrarSaida(Integer numeroPares){
        System.out.println("Número de pares com a diferença igual ao valor alvo: " + numeroPares);
    }

}
