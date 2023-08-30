package C728082023;

public class Calculadora {

    //Atributos
    String color;
    double alto;
    double ancho;
    String marca;
    boolean esCientifica;
    Integer memoria;
    Integer cantidadMaxDeDigitos;

    public Calculadora(){

    }

    public Calculadora(String color){
        this.color = color;
    }

    public Calculadora(String color, double alto, double ancho, String marca, boolean esCientifica, Integer memoria, Integer cantidadMaxDeDigitos) {
        this.color = color;
        this.alto = alto;
        this.ancho = ancho;
        this.marca = marca;
        this.esCientifica = esCientifica;
        this.memoria = memoria;
        this.cantidadMaxDeDigitos = cantidadMaxDeDigitos;
    }

    public double suma(double num1, double num2) {
        return num1 + num2;
    }
    public double suma(int... numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma;
    }

    public double resta(double num1, double num2) {
        return num1 - num2;
    }

    public double dividir(double num1, double num2){
        return num1 / num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double elevar(double num1, double num2) {
        double total = num1;
        for (int i = 1; i < num2; i++) {
            total *= num1;
        }
        return total;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Calculadora{");
        sb.append("color='").append(color).append('\'');
        sb.append(", alto=").append(alto);
        sb.append(", ancho=").append(ancho);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", esCientifica=").append(esCientifica);
        sb.append(", memoria=").append(memoria);
        sb.append(", cantidadMaxDeDigitos=").append(cantidadMaxDeDigitos);
        sb.append('}');
        return sb.toString();
    }
}
