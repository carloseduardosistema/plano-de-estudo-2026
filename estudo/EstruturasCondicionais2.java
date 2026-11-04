package estudo;

public class EstruturasCondicionais2 {
    public static void main(String[] args) {
        
        int idade = 12 ;
        String categoria = "Nada" ;

        if (idade < 15) {
            categoria = "Categoria Infantil" ;  

        }else if (idade >= 15 && idade < 18) {

            categoria = "Categoria Juvenil" ;
        }

        System.out.println(categoria);
    }
}
