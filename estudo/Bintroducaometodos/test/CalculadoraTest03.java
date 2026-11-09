package estudo.Bintroducaometodos.test;

import  estudo.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
     
    double resultado = (int) calculadora.divideDoisNumeros(20, 0);
    System.out.println(resultado);
    System.out.println(calculadora.divideDoisNumeros02(20, 0));
    System.out.println("-----------------");
    calculadora.imprimaDivisaoDeDoisNumeros(86, 0);
 }
}
