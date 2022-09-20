package domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {

    @Test
    public void test_01(){

        Triangulo teste1 = new Triangulo(5, 4, 6);
        Triangulo a = teste1;
        System.out.println("Forma um triângulo.");

    }

    @Test
    public void test_2(){

        Triangulo teste2 = new Triangulo(10, 10, 10);
        Triangulo b = teste2;
        System.out.println("Forma um triângulo equilátero.");
        }

    @Test
    public void test_3(){
        Triangulo teste3 = new Triangulo(2, 3, 15);
        Triangulo c = teste3;
        System.out.println("Não Forma um triângulo");
    }
}

