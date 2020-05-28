import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
       Scanner ent = new Scanner(System.in);
        
        double num, soma = 0;
        int cont = 0;
        
        do{
            System.out.println("Digite um número");
            num = ent.nextDouble(); // usuario digita um número
            
            if(num >= 0){ // se o número digitado for MAIOR que zero, executa a conta
                soma = num + soma; // soma o valor digitado AGORA com o digitado ANTES
                cont++; // conta quantas vezes o usuário digitou um número
            }
        } while(num >= 0); // se o número digitado for MAIOR que zero, faz o LOOP novamente
        
        System.out.println("A soma é " + soma); // soma
        System.out.println("A quantidade de números digitados foi " + cont); // quantidade
        System.out.println("A média é " + soma / cont); // média
    }
}




/*

Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, 
deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.
Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. 
Pelo menos um destes números será positivo.
Saída
O primeiro valor de saída é a quantidade de valores positivos. 
A próxima linha deve mostrar a média dos valores positivos digitados.
*/