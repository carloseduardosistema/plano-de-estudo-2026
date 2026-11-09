package estudo.Bintroducaometodos.dominio;

public class Calculadora {
 
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    
    public void subtrairDoisNumeros(){
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num , float num2){
        System.out.println(num * num2);
    }

    // Acrecenta returno
    public double divideDoisNumeros(double num1 , double num2 ){
        if( num2 == 0){
            return 0;
        }
        return  num1 / num2;
    }

    // Formas diferentes para implementar
    public double divideDoisNumeros02(double num1 , double num2 ){
        if(num2 != 0){
             return  num1 / num2;
        }else{
            System.out.println("Nao exite divisao por zero.");
            return 0;
        }    
    }

    public void imprimaDivisaoDeDoisNumeros(double num1 , double num2){
            if(num2 == 0){
                System.out.println("Nao exite divisao por zero.");
                 
            }else{
                System.out.println(num1 / num2); 
            } 
            
    }
}