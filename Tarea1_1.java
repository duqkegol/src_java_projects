import javax.swing.*;
import java.util.Scanner;

public class Tarea1_1 {
    public static void main(String[] args) {

        int valores[] = new int[1000];
        /*int valores2[] = new int[1000];
        int valores3[] = new int[1000];*/
        for (int x = 1; x <= 5; x++) {
            valores[x] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor " + x));
           /* valores2[x] = valores[x]*2;
            valores3[x] = valores2[x]*2;*/
        }
        System.out.println(valores[1] + "  " + valores[2] + "  " + valores[3] + "  " + valores[4] + "  " + valores[5]);
        /*System.out.println(valores2[1] + "  " + valores2[2] + "  " + valores2[3] + "  " + valores2[4] + "  " + valores2[5]);
        System.out.println(valores3[1] + "  " + valores3[2] + "  " + valores3[3] + "  " + valores3[4] + "  " + valores3[5]);*/
        System.out.println(valores[1] * 2 + "  " + valores[2] * 2 + "  " + valores[3] * 2 + "  " + valores[4] * 2 + "  " + valores[5] * 2);
        System.out.println(valores[1] * 4 + "  " + valores[2] * 4 + "  " + valores[3] * 4 + "  " + valores[4] * 4 + "  " + valores[5] * 4);
    }

}
