import java.util.Scanner;
public class Cuenta {
    String titular;
    double cantidad=1000;
    Scanner leer = new Scanner(System.in);
    public Cuenta(){
        titular="Miguel Carapaz";
        cantidad=1000;
    }
    public void Titular1() {
        Scanner leer = new Scanner(System.in);
        Cuenta Titular1 = new Cuenta();
        System.out.println("Ingrese el nombre del titular:");
        titular = leer.nextLine();
    }

    public void ingresar(){
        System.out.print("Ingrese el monto a depositar: ");
        double ingresar = leer.nextInt();
        cantidad = cantidad + ingresar;

    }
    public void retirar(){
        System.out.print("Ingrese el monto a retirar: ");
        double reducir = leer.nextInt();
        cantidad = cantidad - reducir;
        if(cantidad<=0){
            System.out.print("No se puede retirar el monto por que no tiene los fondos necesarios: ");
            cantidad=0;
        }
    }
    public void cantidad_string(){
        String cadena = String.valueOf(cantidad);
        String totalString = String.valueOf(cantidad);
    }
    public void mostrar_datos() {
        System.out.println("Titular: " +getTitular());
        System.out.println("Cantidad: " +getCantidad());
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
