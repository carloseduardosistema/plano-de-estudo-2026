 package estudo;

public class Operadores {

public static void main(String[] args) {
    // + - / *

    int numero01 = 10;
    int numero02 = 20;
    double resultado = numero01 / (double) numero02;

    System.out.println(resultado);

    // % 

    int resto = 21 % 7;
    System.out.println(resto);

    // < > <= >=  == !=

        boolean isDezMaiorQueVinte = 10 >= 20 ;
        boolean isDezMenorQueVinte = 10 <= 20 ;
        boolean isDezIqualQueVinte = 10 == 20 ;
        boolean isDezIqualQueDez = 10 == 10.0 ;
        boolean isDezDiferenteQueDez = 10 != 10.0 ;


        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIqualQueVinte " + isDezIqualQueVinte);
        System.out.println("isDezIqualQueDez " + isDezIqualQueDez);
        System.out.println("isDezDiferenteQueDez " + isDezDiferenteQueDez);
        

        // && (AND) || (or) !

        int idade = 29 ;
        float salario = 3500F;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612 ;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381 ;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta );   
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta );  
        
        
        double valorTotalDaContaCorrente = 200 ;
        double valorTotalDaContaPoupanca = 10000 ;

        float valorPlaystation = 5000F ;

        boolean isPlasytationCincoCompravel = valorTotalDaContaCorrente > valorPlaystation || valorTotalDaContaPoupanca > valorPlaystation ;

        System.out.println("isPlasytationCincoComprave " +isPlasytationCincoCompravel );
        
        
        // = += -= *= /= %=

        double bonus = 1800 ;
        bonus -= 1000 ;
        bonus += 1000 ;
        bonus *= 2 ;
        bonus /= 2 ;
        bonus %= 2 ;

        System.out.println(bonus);


        // ++ --
        int contador  = 0 ;
        contador += 1 ; // contador = contador + 1 ;
        contador++;
        contador--;
        ++contador;
        --contador;

        int contador2 = 0 ;

        System.out.println(++contador2);
        System.out.println(contador);
    }
}