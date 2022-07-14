package Ejercicio3;

import Ejercicio2.Chat_palabras;

import java.util.Scanner;
import java.util.function.BiFunction;

public class funciones {

    Scanner leer = new Scanner(System.in);

    public void Derivada() {

        BiFunction<Integer, Integer, Integer> coeficienteXExponente = (x, y) -> x * y;

        System.out.println("Digite A");
        Integer A = Integer.parseInt(leer.nextLine());
        System.out.println("Digite B ");
        Integer B = Integer.parseInt(leer.nextLine());
        System.out.println("Digite C ");
        Integer C = Integer.parseInt(leer.nextLine());
        System.out.println("Digite el exponente ");
        Integer exponente = Integer.parseInt(leer.nextLine());



        System.out.println(A + "X" + "^" + exponente + " + " + B + "X" + "^" + (exponente - 1) + " + " + C + "X");
        System.out.println("");
        System.out.println("Resultado");
        System.out.println(coeficienteXExponente.apply(A, exponente) + "X" + "^" + (exponente - 1) + " + " +
                coeficienteXExponente.apply(B, (exponente - 1)) + "X" + "^" + (exponente - 2) + " + " + C);
    }

    public void Integral() {

        BiFunction<Integer, Integer, Integer> coeficienteSobreExponente = (x, y) -> x / (y + 1);

        System.out.println("Digite A ");
        Integer A = Integer.parseInt(leer.nextLine());
        System.out.println("Valor del exponente ");
        Integer exponente = Integer.parseInt(leer.nextLine());

        System.out.println("La funcion es ");
        System.out.println("∫" + A + "X^" + exponente + " dx");


        System.out.println("Resultado: ");
        System.out.println(coeficienteSobreExponente.apply(A, exponente) + "X^" + (exponente + 1) + " + C");
    }


    public static void main(String[] args) {

        funciones ejer3 = new funciones();
        ejer3.Derivada();
        ejer3.Integral();


    }
}


