import clases.Algoritmos;

public class Aplicacion {
    public static void main(String[] args){
        System.out.println("\n Prueba método: esPar");
        System.out.println(Algoritmos.esPar(12));
        System.out.println(Algoritmos.esPar(13));

        System.out.println("\n Prueba método: esPrimo");
        System.out.println(Algoritmos.esPrimo(5));
        System.out.println(Algoritmos.esPrimo(14));

        System.out.println("\n Prueba método: stringEnReversa");
        System.out.println(Algoritmos.stringEnReversa("Skillnest"));

        System.out.println("\n Prueba método: esPalindromo");
        System.out.println(Algoritmos.esPalindromo("reconocer"));
        System.out.println(Algoritmos.esPalindromo("casa"));

        System.out.println("\n Prueba método: secuenciaFizzBuzz");
        Algoritmos.secuenciaFizzBuzz(15);
    }
    
}
