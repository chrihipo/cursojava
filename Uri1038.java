import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int codigo, qtd;
        double valor;
                      
        codigo = teclado.nextInt();
        qtd = teclado.nextInt();
        
        if (codigo == 1){
            valor = (qtd * 4.00);
            System.out.printf("Total: R$ %.2f" ,valor);
        }

        else {
            if (codigo == 2){
                valor = (qtd * 4.50);
                System.out.printf("Total: R$ %.2f" ,valor);
            }
        
            else {
                if (codigo == 3){
                    valor = (qtd * 5.00);
                    System.out.printf("Total: R$ %.2f" ,valor);
                }
                
                else {
                    if (codigo == 4){
                        valor = (qtd * 2.00);
                        System.out.printf("Total: R$ %.2f" ,valor);
                    }
                    
                    else {
                        if (codigo == 5){
                            valor = (qtd * 1.50);
                            System.out.printf("Total: R$ %.2f" ,valor);
                        }
                    }
                }
            }
        }   
        
    }            
}                  
    


/*
 1 = 4.00;
        2 = 4.50;
        3 = 5.00;
        4 = 2.00;
        5 = 1.50;
        */