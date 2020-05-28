import java.util.Scanner;
public class Exerc20{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int Sexo;
        float Altura, PesoIdeal;
        
        Sexo = teclado.nextInt();
        Altura = teclado.nextFloat();
      
        if (Sexo == 0){
                    PesoIdeal = (72.7f * Altura) - 58f;
                            System.out.println("Peso ideal homen " + PesoIdeal);
        }
        else {
                    PesoIdeal = (62.1f * Altura) - 44.7f;
                                System.out.println("Peso ideal mulher = " + PesoIdeal);

        }
    }
}






 /*       Segundo uma tabela médica, o peso ideal está relacionado com ma altura e o sexo
de uma pessoa. Faça um programa que recebe a altura e o sexo de uma pessoa,
calcule e imprima seu peso ideal, segundo as fórmulas:
 homens : (72.7 * H) – 58
 mulheres : (62.1 * H) – 44,7 
 */