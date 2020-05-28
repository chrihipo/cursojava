import java.util.Scanner;
public class Uri1009{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        String nome;
        double salFixo;
        double valorComissao;
        double salTotal;
        
        nome = teclado.nextLine();
        salFixo = teclado.nextDouble();
        valorComissao = teclado.nextDouble();
        
        salTotal = salFixo + valorComissao * 0.15;
        
        System.out.printf("TOTAL = R$ %.2f\n" ,salTotal);
        
    }
}