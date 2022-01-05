import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 0;
        String numeroStr = JOptionPane.showInputDialog( null, "ingrese un numero entero");
        try {
            numeroDecimal = Integer.parseInt(numeroStr);

        } catch ( NumberFormatException e){
            JOptionPane .showMessageDialog( null, "error, debe ingresar solo numeros");
            main (args);
            System. exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numeroBinario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numeroOctal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numeroHexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showMessageDialog( null, mensaje);

    }
}
