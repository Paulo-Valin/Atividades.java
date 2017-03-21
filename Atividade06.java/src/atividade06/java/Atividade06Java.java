
package atividade06.java;
import javax.swing.JOptionPane;
public class Atividade06Java {


    public static void main(String[] args) {
     
       String user = JOptionPane.showInputDialog("Digite o usuário: ");
        
        if (user.equals("admin")) {
         JOptionPane.showMessageDialog(null,"login com sucesso!");
       }
       else{
              JOptionPane.showMessageDialog(null, "Usuário inválido!!!");
    }
}
}

   
        
   
    

