package domain;

public class Triangulo {

    private double lado1;

    private double lado2;

    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) throws Exception {
        if (lado1 < 0 || lado1 > 99 || lado2 < 0 || lado2 > 99 || lado3 < 0 || lado3 > 99) {
            throw new Exception("0 - Entrada Inválida");
        }
        if (lado1 + lado2 <= lado3 || lado2 + lado3 <= lado1 || lado1 + lado3 <= lado2) {
            throw  new Exception("4 - Os valores informados não formam um triângulo.");
        }
        double d;


        if (lado2 == lado3 && lado2 > lado1) {
            d = 0;
            d = lado1;
            lado1 = lado2;
            lado2 = d;
        }

        if (lado2 > lado1 && lado2 > lado3) {
            d = 0;
            d = lado1;
            lado1 = lado2;
            lado2 = d;
        }

        if (lado3 > lado1 && lado3 > lado2) {
            d = 0;
            d = lado1;
            lado1 = lado3;
            lado3 = d;
        }
        int quantidadeDeLadosIguais = 0;
        if (lado1 == lado2 && lado1 != lado3) {
            quantidadeDeLadosIguais = 2;
        }

        if (lado1 == lado3 && lado1 != lado2) {
            quantidadeDeLadosIguais = 2;
        }

        if (lado2 == lado3 && lado2 != lado1) {
            quantidadeDeLadosIguais = 2;
        }

        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }

    public double getLado1(){
        return lado1;
    }
    public double getLado2(){
        return lado2;
    }
    public double getLado3(){
        return lado3;
    }

    public void setLado1(double lado1) {
        this.lado1=lado1;
    }
    public void setLado2(double lado2) {
        this.lado2=lado2;
    }
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }


    /*
    * 1 - Equilátero
    * 2 - Isóceles
    * 3 - Escaleno
    * */
}
