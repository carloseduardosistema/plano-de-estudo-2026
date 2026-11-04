package estudo;

public class EstruturaDeRepedicao {
    public static void main(String[] args) {
        // while , for e do while 

        int count = 0 ;

        while (count < 10) {
            System.out.println(++count);
            
        }

        count = 0 ;
        do {
            System.out.println(count);
        } while (count < 10) ;


        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("FOR " + i );
        }
    }
}
