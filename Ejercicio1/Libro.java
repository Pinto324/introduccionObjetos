
package Ejercicio1;

public class Libro {
    String Nombre;
    boolean Prestado;
    String Autor;
    int NoPags;
    //Constructor por defecto
    public Libro(){}
    //Constructor por parametros
    public Libro(String Nombre, boolean Prestado, String Autor, int NoPags) {
        this.Nombre = Nombre;
        this.Prestado = Prestado;
        this.Autor = Autor;
        this.NoPags = NoPags;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public boolean isPrestado() {
        return Prestado;
    }

    public void setPrestado(boolean Prestado) {
        this.Prestado = Prestado;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNoPags() {
        return NoPags;
    }

    public void setNoPags(int NoPags) {
        this.NoPags = NoPags;
    }
    public void Prestamo(){
        setPrestado(true);
        System.out.println("\nSe a prestado el libro correctamente");
    }
    public void Devolucion(){
        setPrestado(false);
        System.out.println("\nSe a devuelto el libro correctamente");
    }    
    public String MostrarInfo(){
        if(Prestado){
        return "\nEl nombre del libro es: "+Nombre+" El autor del libro es: "+Autor+" tiene un total de paginas de: "+NoPags+" y no esta disponible";
        }else{
        return "\nEl nombre del libro es: "+Nombre+" El autor del libro es: "+Autor+" tiene un total de paginas de: "+NoPags+" y esta disponible";
        }
    }
}
