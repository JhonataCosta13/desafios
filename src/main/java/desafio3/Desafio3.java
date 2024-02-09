package desafio3;
import java.util.Scanner;

import static desafio3.Metodos3.*;
public class Desafio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Integer n;
        Integer k;
        Integer numeroPares = 0;

        System.out.println("Digite o tamanho do array:");
        n = scan.nextInt();
        Integer arr[] = new Integer[n];

        System.out.println("Digite o valor alvo:");
        k = scan.nextInt();

        preencherArray(arr, scan);
        numeroPares = paresDiferenca(arr, k);
        mostrarEntradas(n, k, arr);
        mostrarSaida(numeroPares);
    }
}
