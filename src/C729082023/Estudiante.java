package C729082023;

public class Estudiante extends Persona{
    String curso;
    String nombreColegio;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, String rut, String nacionalidad, String curso, String nombreColegio) {
        super(nombre, edad, rut, nacionalidad);
        this.curso = curso;
        this.nombreColegio = nombreColegio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Estudiante{");
        sb.append("curso='").append(curso).append('\'');
        sb.append(", nombreColegio='").append(nombreColegio).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void comer(){
        System.out.println("Soy un estudiante comiendo.");
    }

    @Override
    public void dormir(){
        System.out.println("Soy un estudiante durmiendo.");
    }

    @Override
    public void saltar() {
        System.out.println("Soy un estudiante saltando.");
    }

    public void estudiar(){
        System.out.println("Estudiando...");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombreColegio() {
        return nombreColegio;
    }

    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }


}
