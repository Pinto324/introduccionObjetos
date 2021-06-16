package Ejercicio1;
public class Fraccion {
    int as;
    int bs;
    public Fraccion(int a, int b){
         as = a;
         bs = b;
    }
    public int getas(){
        return as;
    }
    public int getbs(){
        return bs;
    }
    public void setas(int al){
        as = al;
    }
    public void setbs(int ba){
        bs = ba;
    }

    public void Suma(){
            System.out.println("Suma");
            int Suma = as+bs;
            System.out.println("El Area del Rectangulo es: "+Suma);
    }
    public void Resta(){
              System.out.println("Resta");
              int Resta = as-bs;
              System.out.println("El Perimetro del Rectangulo es: "+Resta);
    }
    public void Multiplicacion(){
             System.out.println("Multiplicacion");
             int Multiplicacion = as*bs;
            System.out.println("El Perimetro del Rectangulo es: "+Multiplicacion);
    }
    public void Division(){
        System.out.println("Division");
        int Division = as/bs;
        System.out.println("El Perimetro del Rectangulo es: "+Division);
    }
}
