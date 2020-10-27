package cr.ac.ucenfotec.Asociacion.controlador;

import cr.ac.ucenfotec.Asociacion.bl.entidades.Computadora;
import cr.ac.ucenfotec.Asociacion.bl.logica.Gestor;
import cr.ac.ucenfotec.Asociacion.iu.IU;

import java.util.ArrayList;

public class Controlador{

    private IU iu = new IU();
    private Gestor gestor = new Gestor();

    public void ejecutarPrograma() {
        int opcion = 0;
        do {
            iu.mostrarMenu();
            opcion = iu.leerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 4);
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                agregarEmpleado();
                break;
            case 2:
                agregarComputadora();
                break;
            case 3:
                listar();
                break;
            case 4:
                break;
            default:
                iu.imprimirMensaje("Opcion desconocida");
        }
    }

    public void agregarEmpleado(){
        iu.imprimirMensaje("Nombre del empleado ");
        String nombre = iu.leerTexto();
        iu.imprimirMensaje("Cédula del empleado: ");
        String cedula = iu.leerTexto();
        gestor.agregarEmpleado(nombre,cedula);

    }

    public void agregarComputadora(){
        iu.imprimirMensaje("Ingrese el número de serie ");
        String numSerie = iu.leerTexto();
        iu.imprimirMensaje("Ingrese la marca ");
        String marca = iu.leerTexto();
        iu.imprimirMensaje("Ingrese la cédula del empleado responsable");
        String cedula = iu.leerTexto();
        boolean existe = gestor.existeEmpleado(cedula);
        if(existe == true){
            gestor.agregarComputadora(numSerie, marca,cedula);
        } else {
            iu.imprimirMensaje("Cedula de usuario no existe");
        }
    }

    private void listar(){
        ArrayList<Computadora> computadoras = gestor.listar();
        iu.imprimirMensaje("Lista información Computadoras");
        for (int i = 0; i < computadoras.size(); i++) {
            iu.imprimirMensaje(computadoras.get(i).toString());
            }
        }
    }
