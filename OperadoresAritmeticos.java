import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j = 4, suma = i + j;
        
        System.out.println("i = " + suma);

        System.out.println("i + j = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i - j) = " + (i - j));

        int multi = i * j;
        System.out.println("multiplicacion = " + multi);

        int divi = i / j;
        float divi2 = (float)i / j;
        System.out.println("divi = " + divi);
        System.out.println("divi2 = " + divi2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog(" ingrese un numero "));
        if (numero % 2 == 0){
            System.out.println("numero par = " + numero);
        } else{
            System.out.println("numero impar = " + numero);
        }
    }
}
