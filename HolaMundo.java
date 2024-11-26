import java.util.Scanner;


public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola Gordo");
        System.out.println("Hola Mundo");
        // este no cambia de linea 
        System.out.print("Mira como va ");
        System.out.print("Mira como va");

        var entrada = new Scanner (System.in);

        System.out.println("Ingrese su nombre");

        var entero = entrada.nextInt();
        
        System.out.println(entero);

        entrada.close();
    }
}