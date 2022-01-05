import java.util.Scanner;
import javax.swing.*;
import java.io.IOException;

public class Ciclos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean pregunta = true;
        var acum = 0;
        var cont = 1;
        //Inicio del bucle de cada producto
        while (pregunta) {
            var productos = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto"+cont);
            var precios = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor del producto"+cont));
            acum = acum + precios;
            System.out.print("(1). Si desea agregar otro producto. (2) Salir. ");
            char car = sc.next().charAt(0);
            if (car == '2') {
                pregunta = false;
            }
            //cont = cont + 1;
            cont++;

        }

        System.out.println("El total de su factura es: " + acum);
    }

}
//acumulado todas los productosd acum = acum+ valor;
//contar todos los productos c++ -> c= c+1
//Pregunto si deseo continuar, pregunta
//pregunta -> false;

/*char car = sc.next().charAt(0);*/
