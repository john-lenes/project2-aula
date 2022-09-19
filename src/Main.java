import domain.Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Triangulo triangulo1 = new Triangulo(23,19,20);
        System.out.println("✿✿✿✿✿✿✿✿✿✿  Flores  ✿✿✿✿✿✿✿✿✿✿");
        System.out.println(triangulo1.getLado1());
        System.out.println(triangulo1.getLado2());
        System.out.println(triangulo1.getLado3());
    }

}


//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

