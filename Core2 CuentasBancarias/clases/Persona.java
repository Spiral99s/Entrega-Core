package clases;

public class Persona {
    //ATRIBUTOS
    private String nombre;
    private int edad;

    //METODO CONSTRUCTORES
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //GETTERs Y SETTERs
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //METODO DE INSTANCIA
    public String despliegaInformacion(){
        return "Nombre: " + nombre + ", edad: " + edad;
    }

    @Override
    public String toString() {
    return "Nombre: " + nombre + ", edad: " + edad;
    }

}
