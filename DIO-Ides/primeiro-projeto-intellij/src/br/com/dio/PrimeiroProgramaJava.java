package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgramaJava {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setNome("Tom");

        gato.setIdade(33);
        gato.setCor("lilás");

        System.out.println("O nome desse gato é " + gato.getNome());

       /* int a = 5;
          int b = 3;
          System.out.println("Hello World! " + (a+b));*/
    }
}
