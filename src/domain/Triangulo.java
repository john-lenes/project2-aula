package domain;

public class Triangulo {

    private double l1;

    private double l2;

    private double l3;

    public Triangulo(double l1, double l2, double l3)  {

        if (l1 < 0 || l1 > 99 || l2 < 0 || l2 > 99 || l3 < 0 || l3 > 99) {}

        if (l1 + l2 <= l3 || l2 + l3 <= l1 || l1 + l3 <= l2) {}

        double d;

        if (l2 == l3 && l2 > l1) {
            d = 0;
            d = l1;
            l1 = l2;
            l2 = d;
        }

        if (l2 > l1 && l2 > l3) {
            d = 0;
            d = l1;
            l1 = l2;
            l2 = d;
        }

        if (l3 > l1 && l3 > l2) {
            d = 0;
            d = l1;
            l1 = l3;
            l3 = d;
        }
        int quantidadeDeLadosIguais = 0;
        if (l1 == l2 && l1 != l3) {
            quantidadeDeLadosIguais = 2;
        }

        if (l1 == l3 && l1 != l2) {
            quantidadeDeLadosIguais = 2;
        }

        if (l2 == l3 && l2 != l1) {
            quantidadeDeLadosIguais = 2;
        }

        if (l1 == l2 && l2 == l3) {}

        if (quantidadeDeLadosIguais == 2) {}

        if (l1 != l2 && l2 != l3) {}

        this.l1=l1;
        this.l2=l2;
        this.l3=l3;
    }

    public double getl1(){
        return l1;
    }
    public double getl2(){
        return l2;
    }
    public double getl3(){
        return l3;
    }

    public void setl1(double l1) {
        this.l1=l1;
    }
    public void setl2(double l2) {
        this.l2=l2;
    }
    public void setl3(double l3) {
        this.l3 = l3;
    }

}
