package cr.ac.ucenfotec.Asociacion.bl.entidades;

public class Computadora {

    private String numSerie;
    private String marca;
    private Empleado responsable;

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombreResponsable(){
        return responsable.getNombre();
    }

    public void setResponsable(Empleado empleado){
        responsable = empleado;
    }

    public Computadora(String numSerie, String marca, Empleado empleado){
        setNumSerie(numSerie);
        setMarca(marca);
        setResponsable(empleado);
    }

    public Computadora() {
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "numSerie='" + numSerie + '\'' +
                ", marca='" + marca + '\'' +
                ", responsable=" + responsable +
                '}';
    }

}
