package cr.ac.ucenfotec.Asociacion.iu;

import java.io.PrintStream;
import java.util.Scanner;

public class IU {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void mostrarMenu() {
        output.println("Bienvenido: escoja una opcion:");
        output.println("1. Agregar informacion empleado");
        output.println("2. Agregar informacion computadora");
        output.println("3. Listar Computadoras y responsable");
        output.println("4. Salir");
    }

    public int leerOpcion() {
        output.println("Su opcion es: ");
        return input.nextInt();
    }

    public void imprimirMensaje(String mensaje) {
        output.println(mensaje);
    }

    public String leerTexto() {
        return input.next();
    }
}
