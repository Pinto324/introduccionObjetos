package Ejercicio1;

public class Rectangulo {
    int base;
    int altura;
    public Rectangulo(int b, int a){
         base = b;
         altura = a;
    }
    public int getbase(){
        return base;
    }
    public int getaltura(){
        return altura;
    }
    public void setaltura(int al){
        altura = al;
    }
    public void setbase(int ba){
        base = ba;
    }

    public void Area(){
        if(base == altura){
          System.out.println("No puede Ingresar Base y Alturas iguales");
        }else{
            System.out.println("Calculando el Area del Rectangulo");
            System.out.println("La Base del Rectangulo es: "+base);
            System.out.println("La Altura del Rectangulo es: "+altura);
            int Area = base*altura;
            System.out.println("El Area del Rectangulo es: "+Area);
        }
    }
    public void Perimetro(){
        if(base == altura){
            System.out.println("No puede Ingresar Base y Alturas iguales");
          }else{
              System.out.println("Calculando el Perimetro del Rectangulo");
              System.out.println("La Base del Rectangulo es: "+base);
              System.out.println("La Altura del Rectangulo es: "+altura);
              int Perimetro = 2*(base+altura);
              System.out.println("El Perimetro del Rectangulo es: "+Perimetro);
          }
    }
}
