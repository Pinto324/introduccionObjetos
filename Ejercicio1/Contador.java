
package Ejercicio1;

import java.util.Scanner;

public class Contador {
    int Contador;
    Scanner sc = new Scanner(System.in);
    Scanner sl = new Scanner(System.in);
    public static void main(String[] args){
    Contador Inicio = new Contador(0);
    }    
    //Constructor con parametro
    public Contador(int Contador){
        this.Contador = Contador;
        IngresarOpcion();
    }
    //Constructor vacio
    public Contador(){}

    public int getContador() {
        return Contador;
    }

    public void setContador(int Contador) {
        this.Contador = Contador;
    }
    
    public int Decremento(){
        setContador(getContador() - 1);
        return Contador;
    }
    
    public int Incremento(){
        setContador(getContador() + 1);
        return Contador;
    }
    
    public  void IngresarOpcion(){
        System.out.println("Ingrese el numero con el que iniciará el contador");
        int O = sc.nextInt();
        setContador(O);
        String A;
        System.out.println("El numero inicial del contador es: "+getContador());
        do{
        System.out.println("Ingrese la opción que desea: I para incrementar el contador, D para decrementar el contador, S para salir");
        A = sl.nextLine();
            switch(A){
                case "I":
                    Incremento(); 
                    System.out.println("El numero ahora es: "+getContador());
                    break;
                case "D":
                    Decremento();  
                    System.out.println("El numero ahora es: "+getContador());
                    break;
                case "S":
                    System.out.println("El numero final del contador es: "+getContador());  
                    break;
                default : 
                    System.out.println("Opción seleccionada invalida vuelva a intentarlo:");
                    break;                    
            }
        }while(!(A.equals("S")));
    }
}


