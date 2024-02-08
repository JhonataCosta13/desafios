package desafio2;

public class Moeda {

    private static Double decimal = 0.00d;
    private static Integer numeroMoedas1 = 0;
    private static Integer numeroMoedas050 = 0;
    private static Integer numeroMoedas025 = 0;
    private static Integer numeroMoedas010 = 0;
    private static Integer numeroMoedas005 = 0;
    private static Integer numeroMoedas001 = 0;

    public static void definirDecimal(Double resto){
        decimal = resto*100.00d;
    }

    public static void menorNumeroMoedas(){
        moedas1();
        moedas050();
        moedas025();
        moedas010();
        moedas005();
        moedas001();
    }

    private static void moedas1() {
        while(decimal >= 100.00d){
            decimal = decimal - 100.00d;
            numeroMoedas1++;
        }
    }

    private static void moedas050() {
        while(decimal >= 50.00d){
            decimal = decimal - 50.00d;
            numeroMoedas050++;
        }
    }
    private static void moedas025() {
        while(decimal >= 25.00d){
            decimal = decimal - 25.00d;
            numeroMoedas025++;
        }
    }

    private static void moedas010() {
        while(decimal >= 10.00d){
            decimal = decimal - 10.00d;
            numeroMoedas010++;
        }
    }

    private static void moedas005() {
        while(decimal >= 5.00d){
            decimal = decimal - 5.00d;
            numeroMoedas005++;
        }
    }

    private static void moedas001() {
        while(decimal >= 1.00d){
            decimal = decimal - 1.00d;
            numeroMoedas001++;
        }
    }

    public static void relacaoMoedas(){
        System.out.println("--------------------------------------");
        System.out.println("Moedas de 1 real: " + numeroMoedas1);
        System.out.println("Moedas de 0.5 centavos: " + numeroMoedas050);
        System.out.println("Moedas de 0.25 centavos: " + numeroMoedas025);
        System.out.println("Moedas de 0.10 centavos: " + numeroMoedas010);
        System.out.println("Moedas de 0.05 centavos: " + numeroMoedas005);
        System.out.println("Moedas de 0.01 centavo: " + numeroMoedas001);
    }

}
