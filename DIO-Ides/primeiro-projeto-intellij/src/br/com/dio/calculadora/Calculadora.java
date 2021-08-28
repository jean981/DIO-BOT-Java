package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Informe o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a,b);
        int subtrair = subtrair(a, b);
        double dividir = dividir(a, b);
        int multiplicar = multiplicar(a, b);

        System.out.println("Somar :"+somar);
        System.out.println("Subtrair :"+subtrair);
        System.out.println("Dividir :"+dividir);
        System.out.println("Multiplicar :"+multiplicar);

    }
    public static int somar(int a, int b) {
        return (a + b);
    }
    public static int subtrair(int a, int b){
        return (a - b);
    }
    public static int multiplicar(int a, int b){
        return (a * b);
    }
    public static double dividir(double a, int b){return a / b;}
}
