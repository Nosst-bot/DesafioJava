package C729082023;

public class Persona {
    String nombre;
    int edad;
    String rut;
    String nacionalidad;

    public Persona() {
    }

    public Persona(String nombre, int edad, String rut, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", rut='").append(rut).append('\'');
        sb.append(", nacionalidad='").append(nacionalidad).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void comer(){
        System.out.println("Soy una persona comiendo.");
    }

    public void dormir(){
        System.out.println("Soy una persona durmiendo.");
    }

    public void saltar(){
        System.out.println("Soy una persona saltando");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
