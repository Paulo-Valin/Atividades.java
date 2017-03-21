
package atividade05.java;
import java.util.Scanner;

public class Atividade05Java {

    public static void main(String[] args) {
     float nota;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite sua nota [0.0 - 10.0]: " );
        nota = entrada.nextFloat();
        
        if( (nota <= 10.0) && (nota >= 0.0) ){
            System.out.println("Nota válida");
        } else {
            System.out.println("Nota inválida!");
        }
         if(nota >=7.0){
            System.out.println("Parabéns voce passou!");
          } 
         else{
             System.out.println("Voce não Passou!");
         }
     if(nota >= 4.0){
     System.out.println("Voce esta de EXAME");
     
    }
     else{
         System.out.println("Voce REPROVOU");
     }
    }   
    
}
