package clases;

import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria{
    //ATRIBUTOS
    private Persona titular;
    private double saldo;
    private int numeroCuenta;
    private static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();
    public static ArrayList<Integer> agregar = new ArrayList<>();

    //METODO CONSTRUCTORES
    public CuentaBancaria(Persona titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
        this.numeroCuenta = generarNumeroCuenta();
        CuentaBancaria.listaDeCuentasBancarias.add(this);

        CuentaBancaria.agregar.add(this.numeroCuenta);
    }

    //GETTERs Y SETTERs
    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public static ArrayList<CuentaBancaria> getListaDeCuentasBancarias() {
        return listaDeCuentasBancarias;
    }

    public static void setListaDeCuentasBancarias(ArrayList<CuentaBancaria> listaDeCuentasBancarias) {
        CuentaBancaria.listaDeCuentasBancarias = listaDeCuentasBancarias;
    }

    public static ArrayList<Integer> getAgregar() {
        return agregar;
    }

    public static void setAgregar(ArrayList<Integer> agregar) {
        CuentaBancaria.agregar = agregar;
    }


    //METODOS 
    private int generarNumeroCuenta(){
        Random random = new Random();
        int numeroGenerado = 100000 + random.nextInt(900000);
        if(CuentaBancaria.agregar.contains(numeroGenerado)){
            this.generarNumeroCuenta();
        }
        return numeroGenerado;
    }

    public void depositar (double monto){
        if(monto > 0){
            saldo += monto;
            System.out.println("Operación realizada con éxito. Su saldo actual es: " + saldo);
        }else{
            System.out.println("El monto a depositar debe ser mayor a 0.");
        }
    } 

    public void retirar (double monto){
        if(monto > 0 && saldo >= monto){
            saldo -= monto;
            System.out.println("Operación realizada con éxito. Su saldo actual es: " + saldo);
        }else{
            System.out.println("No cuenta con el saldo suficiente para esta operación o el monto es inválido.");
        }
    }

    public String despliegaInformacion(){
        return "Cuenta Titular: " + titular + ", Número de cuenta: " + numeroCuenta + ", Saldo: " + saldo;
    }

    public static void imprimeInformacionDeTodasLasCuentas(){
        for (int i = 0; i < listaDeCuentasBancarias.size(); i++){
            System.out.println(listaDeCuentasBancarias.get(i));
        } 
    } 

    @Override
    public String toString() {
    return "Cuenta Titular: " + titular + ", Número de cuenta: " + numeroCuenta + ", Saldo: " + saldo;
}

}

