import clases.Persona;
import clases.CuentaBancaria;

public class Aplicacion {
    public static void main (String[] args){
        //Crear tres instancias de clase Persona
        Persona persona1 = new Persona("Catalina Pérez", 35);
        Persona persona2 = new Persona("Nicolás Saavedra", 40);
        Persona persona3 = new Persona("Juan Lopez", 25);

        //Crear tres intancias de la clase CuentaBancaria
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria(persona1, 125.25);
        CuentaBancaria cuentaBancaria2 = new CuentaBancaria(persona2, 430.90);
        CuentaBancaria cuentaBancaria3 = new CuentaBancaria(persona3, 890.75);

        //Operaciones de déposito y retiro
        cuentaBancaria1.depositar(455.50);
        cuentaBancaria2.retirar(425.0);
        cuentaBancaria3.retirar(925.5);

        //imprime saldo actual de cada cuenta bancaria
        cuentaBancaria1.despliegaInformacion();
        cuentaBancaria2.despliegaInformacion();
        cuentaBancaria3.despliegaInformacion();

        //ejecutar metodo imprimeInformacionDeTodasLasCuentas()
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}
