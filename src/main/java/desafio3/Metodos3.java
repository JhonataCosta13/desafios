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
        Integer diferenca1;
        Integer diferenca2;
        for (int i = 0; i < arr.length ; i++){
            for(int j = i + 1; j < arr.length; j++){
                diferenca1 = arr[i] - arr[j];
                diferenca2 = arr[j] - arr[i];
                if(diferenca1 == k || diferenca2 == k)numeroPares++;
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
