package cr.ac.ucenfotec.Asociacion.bl.logica;

import cr.ac.ucenfotec.Asociacion.bl.entidades.Computadora;
import cr.ac.ucenfotec.Asociacion.bl.entidades.Empleado;

import java.util.ArrayList;

public class Gestor {

    private ArrayList<Empleado> empleados;
    private ArrayList<Computadora> computadoras;

    public Gestor() {
        this.empleados = new ArrayList<>();
        this.computadoras = new ArrayList<>();
    }

    public void agregarEmpleado(String nombre, String cedula) {
        Empleado unEmpleado = new Empleado(nombre, cedula);
        empleados.add(unEmpleado);
    }

    public String agregarComputadora(String numSerie, String marca, String cedulaResponsable){
        Empleado responsable = new Empleado();
        boolean existe = existeEmpleado(cedulaResponsable);
        String mensaje="";
        if(existe == true){
            responsable = getEmpleadoResponsable(cedulaResponsable);
            Computadora unaMaquina = new Computadora(numSerie, marca, responsable);
            computadoras.add(unaMaquina);
            mensaje = "Computadora registrada";
        }else {
            mensaje = "El empleado no existe, no se registró la computadora";
        }

        return mensaje;
    }

    public boolean existeEmpleado(String cedula){
        boolean existe = false;
        if(empleados != null){
            for (Empleado e : empleados){
                if(e.getCedula().equals(cedula)){
                    existe = true;
                    break;
                }
            }
        }
        return existe;
    }

    public Empleado getEmpleadoResponsable(String cedula){
        Empleado empleado = new Empleado();
        if(empleados != null){
            for (Empleado e : empleados){
                if(e.getCedula().equals(cedula)){
                    empleado = e;
                    break;
                }
            }
        }
        return empleado;
    }

    public ArrayList<Computadora> listar() {
        return this.computadoras;
    }





}