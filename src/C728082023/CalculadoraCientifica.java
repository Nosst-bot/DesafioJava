package C728082023;

public class CalculadoraCientifica extends Calculadora{

    boolean permiteCaracteresASCII;
    String tipoDePantalla;

    //Constructores
    public CalculadoraCientifica(){

    }

    public CalculadoraCientifica(String color, double alto, double ancho, String marca, boolean esCientifica, Integer memoria, Integer cantidadMaxDeDigitos, boolean permiteCaracteresASCII, String tipoDePantalla) {
        super(color, alto, ancho, marca, esCientifica, memoria, cantidadMaxDeDigitos);
        this.permiteCaracteresASCII = permiteCaracteresASCII;
        this.tipoDePantalla = tipoDePantalla;
    }

    public int resta(int num1, int num2){
        System.out.println("Estas restando");
        return num1 - num2;
    }
}
