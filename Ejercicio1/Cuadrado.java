package Ejercicio1;

public class Cuadrado {
    int lado;
    public Cuadrado(int l){
         lado = l;
    }
    public int getlado(){
        return lado;
    }
    public void setLado(int ladeishon){
        lado = ladeishon;
    }

    public void Area(){
        System.out.println("Calculando el Area del Cuadrado");
        System.out.println("El lado del Cuadrado es: "+lado);
        int Area = lado*lado;
        System.out.println("El Area del Cuadrado es: "+Area);
    }
    public void Perimetro(){
        System.out.println("Calculando el Area del Cuadrado");
        System.out.println("El lado del Cuadrado es: "+lado);
        int Perimetro = 4*lado;
        System.out.println("El Area del Cuadrado es: "+Perimetro);
    }
}
