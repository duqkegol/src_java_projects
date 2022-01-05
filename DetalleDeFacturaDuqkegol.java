import java.util.Scanner;

public class DetalleDeFacturaDuqkegol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre para la factura:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el precio del producto:");
        double precio1 = scanner.nextDouble();

        System.out.println("Ingrese el precio del 2do producto");
        double precio2 = scanner.nextDouble();

        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        String mensaje = "La factura con el nombre: " + nombre + " tiene un total bruto de " + totalBruto +
                 " con un impuesto de " + impuesto + " y tiene un total neto de " + totalNeto;
        System.out.println("mensaje = " + mensaje);
    }
}
