public class EjemploExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna imagen.png";
        int  i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("La extension del archivo es = " + archivo.substring(i+1));
    }
}
