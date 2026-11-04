

public class Exer02 {
    public static void main(String[] args) {
        byte dia = 1 ;

       switch (dia) {

            case 1 :
            case 7 :
                System.out.println("FDS");
             break;
            
             case 6 :
             case 5 :
             case 4 :
             case 3 :
             case 2 :
                System.out.println("dia util");
             break;
             
            default :
            System.out.println("Opcao invalida");
             break;
       }
    }
}
