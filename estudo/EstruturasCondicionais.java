package estudo;

public class EstruturasCondicionais {
    

    public static void main(String[ ]args){

        int idade = 15 ;

        boolean isAutorizadoComprarBebida = idade >= 18 ;
        // !
        if(isAutorizadoComprarBebida == false) {  

            System.out.println("Autorizado para compra bebida aloocolica");
        }else{
             System.out.println("Nao Autorizado para compra bebida aloocolica");
        }
        
      
        boolean c = false ;

        if (c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("fora do if");
    }
}
