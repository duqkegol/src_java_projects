public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Daniel";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase(Locale.ROOT) = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre = " + nombre.equals("Daniel"));
        System.out.println("nombre.equalsIgnoreCase(\"Daniel\") = " + nombre.equalsIgnoreCase("Daniel"));
        System.out.println("nombre.compareTo(\"Daniel\") = " + nombre.compareTo("Daniel"));
        System.out.println("nombre.compareToIgnoreCase(\"DAniel\") = " + nombre.compareToIgnoreCase("Daniel"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre = " + nombre.charAt(0));
        System.out.println("nombre.charAt(nombre.length()) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre = " + nombre.substring(1));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));
        System.out.println("  trabalenguas  " + trabalenguas);
        System.out.println("  trabalenguas  ".trim());
    }
}
