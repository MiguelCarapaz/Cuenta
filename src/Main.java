import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    Scanner leer = new Scanner(System.in);
    Cuenta Titular1 = new Cuenta();
    int opcion=0;
    boolean exit=false;

        while(!exit){
        System.out.println("1.- Ingresar monto");
        System.out.println("2.- Retirar monto");
        System.out.println("3.- Salir");
        System.out.print("Ingrese la opcion: ");
        opcion = leer.nextInt();
        switch (opcion){
            case 1:
                Titular1.Titular1();
                Titular1.ingresar();
                Titular1.cantidad_string();
                Titular1.mostrar_datos();
                break;
            case 2:
                Titular1.Titular1();
                Titular1.retirar();
                Titular1.cantidad_string();
                Titular1.mostrar_datos();

                break;
            case 3:
                exit = true;
                break;
            default:
                System.out.println("Ingrese un numero que este en el rango de 1 - 3");
        }
     }
  }
}