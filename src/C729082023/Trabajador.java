package C729082023;

public class Trabajador extends Persona{
    String oficio;
    String lugarDeTrabajo;

    public Trabajador() {
    }

    public Trabajador(String nombre, int edad, String rut, String nacionalidad, String oficio, String lugarDeTrabajo) {
        super(nombre, edad, rut, nacionalidad);
        this.oficio = oficio;
        this.lugarDeTrabajo = lugarDeTrabajo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Trabajador{");
        sb.append("oficio='").append(oficio).append('\'');
        sb.append(", lugarDeTrabajo='").append(lugarDeTrabajo).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void comer(){
        System.out.println("Soy un trabajador comiendo.");
    }

    @Override
    public void dormir(){
        System.out.println("Soy un trabajador durmiendo.");
    }

    @Override
    public void saltar(){
        System.out.println("Soy un trabajador saltando");
    }

    public void trabajar(){
        System.out.println("Trabajando...");
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public String getLugarDeTrabajo() {
        return lugarDeTrabajo;
    }

    public void setLugarDeTrabajo(String lugarDeTrabajo) {
        this.lugarDeTrabajo = lugarDeTrabajo;
    }
}
