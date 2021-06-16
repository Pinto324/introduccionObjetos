package Ejercicio1;

public class Circulo {
    double radio;
    public Circulo(double r){
         radio = r;
    }
    public double getradio(){
        return radio;
    }
    public void setradio(double ra){
        radio = ra;
    }

    public void Area(){
        System.out.println("Calculando el Area del Circulo");
        System.out.println("El radio del Ciruclo es: "+radio);
        double Area = 3.1415*radio*radio;
        System.out.println("El Area del Circulo es: "+Area);
    }
    public void Perimetro(){
        System.out.println("Calculando el Perimetro del Circulo");
        System.out.println("El radio del Ciruclo es: "+radio);
        double Perimetro = 2*3.1416*radio;
        System.out.println("El Perimetro del Circulo es: "+Perimetro);
    }
}
