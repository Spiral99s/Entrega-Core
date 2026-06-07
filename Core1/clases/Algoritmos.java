package clases;

public class Algoritmos {
    //Método estático para saber si es par
    public static Boolean esPar(int numero){
        if(numero % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    //Método estático para saber si es primo
    public static Boolean esPrimo(int numero){
        if(numero <= 1){
            return false;
        }
        for(int i = 2; i <= numero / 2; i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }
    //Método estático string en reversa
    public static String stringEnReversa(String palabra){
        String resultado = "";
        for(int i=palabra.length()-1; i>=0; i--){
            resultado = resultado + palabra.charAt(i); //uso de chartAt para extraer una letra (caracter) de un texto usando su indice
        }
        return resultado;
    }
    //Método estático para saber si es palíndromo
    public static Boolean esPalindromo(String palabra){
        String resultado = "";
        for(int i=palabra.length()-1; i>=0; i--){
            resultado = resultado + palabra.charAt(i); 
        }
        if(palabra.equalsIgnoreCase(resultado)){
            return true;
        }else{
            return false;
        }
    }

    //Método estático para obtener secuencia FizzBuzz
    public static void secuenciaFizzBuzz(int numero){
        for(int i = 1; i <= numero; i++){
        
        if(i % 3 == 0 && i % 5 == 0){
            System.out.println("FizzBuzz");
        }else if(i % 3 == 0){
            System.out.println("Fizz");
        }else if(i % 5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(i);
        }
        }
    }
}