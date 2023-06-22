import java.util.Scanner;

public class tarea3 {
    public static void main(String[] args) {
        String aux="";
        String[] nombres=new String[3] ;
        for (int i=0 ; i<3 ; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese nombre "+(i+1)+" :");
            aux = scanner.nextLine();
            nombres[i]=aux;
        }
        for (int i=0 ; i<3 ; i++) {
            String impr=String.valueOf(nombres[i].charAt(1)).toUpperCase() + "." + nombres[i].substring(nombres[i].length() - 2);
            if(i==2){
            System.out.print(impr);
            }else {
                System.out.print(impr+"_");
            }

        }

    }

}
