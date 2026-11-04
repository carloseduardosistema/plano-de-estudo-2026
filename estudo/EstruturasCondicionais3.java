package estudo;

public class EstruturasCondicionais3 {
    
    public static void main(String[] args) {
    
        double salario = 6000 ;
        String mensagemDoar = "Eu vou doar 500 pro devDojo" ;
        String mensagemNaoDoar = "Ainda nao tenho condicoes, mas vou ter!" ;

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

    }
}
