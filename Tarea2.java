public class Tarea2 {
    public static void main(String[] args) {
        int arreglo[] = { 20, 12, 7, 120, 36 };
        int mayor, menor;
        int sumas = 0;
        mayor = menor = arreglo[0];
        int posMayor = 0;
        int posMenor = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
                posMayor = i;
            }
            if (arreglo[i] < menor) {
                menor = arreglo[i];
                posMenor = i;
            }

        }

        for (int i = 0; i < arreglo.length; i++) {
            sumas = sumas + arreglo[i];
        }
        double prom = sumas / arreglo.length;

        System.out.println("El mayor es = " + mayor);
        System.out.println("El menor es = " + menor);
        System.out.println(prom);
        System.out.println(posMayor);
        System.out.println(posMenor);
    }

}
