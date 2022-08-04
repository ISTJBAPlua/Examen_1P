
package app;
import java.util.Scanner;
public class Examen_1P {

    public static void main(String[] args) {
       int Cedula = 0;
       String Nombre = "";
       int Opcion = 0;
       int Numero = 0;
       
        Scanner Teclado = new Scanner(System.in);
        System.out.println("---------------------------------------------------------");
        System.out.println("------------------- Registro de computo ------------------------");
        Opcion = Integer.parseInt("------------------- Menú de opciones ---------------------------"
                + "\n 1.- Laptop\n" + "\n "
                + "2.- Celulares\n");
        Numero = Integer.parseInt("Ingrese la Opción: ");
        
        
        
        
        System.out.println("Ingresa su número de Cedula: ");
        Cedula = Teclado.nextInt();
        System.out.print("Ingresa su nombre :");
        Nombre = Teclado.nextLine();
        
        
        
        System.out.println();
    }
}
