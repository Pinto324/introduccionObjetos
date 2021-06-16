package Ejercicio1;

import java.util.*;
public class Menu {
    Scanner sn = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Menu s = new Menu();
    }
    public Menu(){
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        //Se presenta un menu grafico con opciones para el usuario
         while (!salir) {
             System.out.println("\n Menu \n");
             System.out.println("1) Contador");
             System.out.println("2) Cuadrado");
             System.out.println("3) Circulo");
             System.out.println("4) Rectangulos");
             System.out.println("5) Contador De Nuevos");
             System.out.println("6) Libros");
             System.out.println("7) Fraccion");
             System.out.println("8) Principal");
             System.out.println("9) Salir");
             try {
                 System.out.println("Escribe una de las opciones");
                 opcion = sn.nextInt();
                 switch (opcion) {
                     case 1:
                        Conta1();
                         break;
                     case 2:
                         Cuadro();
                         break;
                     case 3:
                         Cir();
                         break;
                     case 4:
                         Rec();
                         break;
                     case 5:
                         Conta1();
                         break;
                     case 6:
                         Libr(); 
                         break;
                     case 7:
                          Mul();
                         break;
                     case 8:
                          
                         break;
                     case 9:
                         salir = true;
                         break;
                     default:
                         System.out.println("Esa opcion no existe");
                 }
             } catch (InputMismatchException e) {
                 System.out.println("Debes insertar un número");
                 sn.next();
                 sn.close();
             }
         }
    }
    public void Libr(){
        System.out.println("Bienvenido a libro, Ingrese Nombre del libro");
        String No = sc.nextLine();
        System.out.println("Ingrese Nombre del Autor");
        String A = sc.nextLine();
        System.out.println("Ingrese Numero de paginas");
        int pags = sc.nextInt();
        Libro L = new Libro(No,false,A,pags);
        L.MostrarInfo();
        int opcion;
        do{
        System.out.println("\nQue desea hacer? 1) prestar libro, 2) Devolver libro, 3) Mostrar info del libro 4)Salir");
        opcion = sn.nextInt();
        switch(opcion){
            case 1:
                L.Prestamo();
                break;
            case 2:
                L.Devolucion();
                break;
            case 3:
               System.out.println(L.MostrarInfo());
                break;
            default:
                break;
        }
        }while(opcion!=4);
    }
    public void Conta1(){
        Contador s = new Contador();
        s.IngresarOpcion();
    }
    public void Cuadro(){
        System.out.println("\nBienvenido al Calculo de Cuadrado, Ingrese un Numero");
        int Cu = sc.nextInt();
        Cuadrado c = new Cuadrado(Cu);
        c.Area();
        c.Perimetro();
    }
    public void Cir(){
        System.out.println("\nBienvenido al Calculo de Circulo, Ingrese un Numero");
        double u = sc.nextDouble();
        Circulo o = new Circulo(u);
        o.Area();
        o.Perimetro();
    }
    public void Rec(){
        System.out.println("\nBienvenido al Calculo del Rectangulo");
        System.out.println("Ingrese la Altura que quiere que tenga el Rectangulo");
        int a = sn.nextInt();
        System.out.println("Ingrese la Base que quiere que tenga el Rectangulo");
        int b = sc.nextInt();
        Rectangulo r = new Rectangulo(b, a);
        r.Area();
        r.Perimetro();
    }
    public void Mul(){
        System.out.println("\nBienvenido al Factorial");
        System.out.println("Ingrese un Numero");
        int as = sn.nextInt();
        System.out.println("Ingrese otro Numero");
        int bs = sc.nextInt();
        Fraccion f = new Fraccion(as, bs);
        f.Suma();
        f.Resta();
        f.Multiplicacion();
        f.Division();
    }
}
