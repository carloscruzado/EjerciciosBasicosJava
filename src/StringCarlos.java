public class StringCarlos {
    public static void main(String[] args) {
        String cad1="hola";
        String cad2="holaa";
        int valor= cad1.compareTo(cad2);

        System.out.println("elvalor es:"+ valor); //valor es -1

        valor= cad2.compareTo(cad1);
        System.out.println("elvalor es:"+ valor); //valor es 1

        cad2="hola";

        valor= cad2.compareTo(cad1);
        System.out.println("elvalor es:"+ valor); //valor es 0

        String valor3= " hola3 ";

        char[] valores= valor3.toCharArray();
        for (char listas:valores
        ) {
            System.out.println("los valores son:"+ listas);
        }

        String valor4 = "cadena";
StringBuilder sr =new StringBuilder();
double valor5= 23.4543;
sr.append(valor).append(valor3).append(valor4).append(valor5);

        System.out.println("erlvalor de StringBuilder:"+sr);

        System.out.println("el valor de substring con rangos es :"+ valor4.substring(0,2));
        System.out.println("el valor de substring desde es :"+ valor4.substring(2));
        System.out.println("el valor de substring de indexof :"+ valor4.indexOf("a"));
        System.out.println("el valor de substring de lastIndexOf :"+ valor4.lastIndexOf("a"));
        System.out.println("el valor de substring de lastIndexOf :"+ valor4.startsWith("c"));
        System.out.println("el valor de substring de lastIndexOf :"+ valor4.startsWith("a"));
        System.out.println("el valor de substring de lastIndexOf :"+ valor4.endsWith("a"));
        String[] cadenas= valor4.split("d");
        for (String cadenas2:cadenas
             ) {
            System.out.println("El valor dividido es:"+cadenas2);
        }

    }
}
