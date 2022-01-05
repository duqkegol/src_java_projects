import java.util.Scanner;
import javax.swing.*;
import java.io.IOException;

public class Tarea1 {

    public static void main(String[] args) throws IOException, InterruptedException {
        String productoV[] = new String[1000];
        int valorV[] = new int[1000];
        int i = 0;
        Scanner sc = new Scanner(System.in);
        boolean pregunta = true;
        var acum = 0;
        var cont = 1;
        int mayor, menor;
        String productMayor;
        String productMenor;

        while (pregunta) {
            clrscr();
            productoV[i] = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto" + cont);
            valorV[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor del producto" + cont));
            acum = acum + valorV[i];
            System.out.print("(1). Si desea agregar otro producto. (2) Salir. ");
            char car = sc.next().charAt(0);
            if (car == '2') {
                pregunta = false;
            }
            cont++;
            System.out.println();
            
            i++; //Indica la posicion del vector
        }

        mayor = menor = valorV[0]; //inicializo con el producto 1 valor
        productMayor = productoV[0];//inicializo producto en la pos 0 pero su nombre
        productMenor = productoV[0];//inicializo producto en la pos 0 pero su nombre

        for (int j = 0; j < i; j++) {
            if (valorV[j] > mayor) {
                mayor = valorV[j];
                productMayor = productoV[j];
            }
            if (valorV[j] < menor) {
                menor = valorV[j];
                productMenor = productoV[j];
            }
        }
        clrscr();
        System.out.print("Nombre Producto    Valor Producto \n");
        for (int x = 0; x < i; x++) {
            System.out.print(productoV[x] + "                 " + valorV[x] + "\n");
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Total:             " + acum);
        System.out.println("El producto mayor es = " + productMayor + " con: " + mayor);
        System.out.println("El producto menor es = " + productMenor + " con: " + menor);
    }

    public static void clrscr() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
//crear una variable del tipo entero, que cada vez que itere compare y c quede con el mayor
