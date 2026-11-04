package estudo;

public class TiposPrimitivos {
    
    public static void main(String[ ]args) {

      // int , double , float , char , byte , short , long , boolean
      int idade = (int) 100000000L ;
      long numeroGrande = (long) 100.25;
      double salarioDouble = 2000.0;
      float salarioFloat = (float) 2500.0D;
      byte idadeByte = -128;
      short idadeShort = 10;
      boolean verdadeiro = true;
      boolean falso = false;
       char caractere = '\u0041';
       String nome = "Goku";
       var nome2 = "Vegeta";

      System.out.println("Minha idade e " + idade + " anos");
      System.out.println(falso);
      System.out.println(salarioFloat);
      System.out.println("Meu nome e " + nome);
    }
}
