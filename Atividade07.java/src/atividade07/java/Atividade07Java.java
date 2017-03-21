
package atividade07.java;
import javax.swing.JOptionPane;
public class Atividade07Java {

   
    public static void main(String[] args) {
   String user = JOptionPane.showInputDialog("Digite o usuário: ");
   String pass = JOptionPane.showInputDialog("Digite sua senha: ");
   
   if(user.equals("admin")) if(pass.equals("1234")){
   
       JOptionPane.showMessageDialog(null,"Login com Sucesso");
   }else{
   
       JOptionPane.showMessageDialog(null,"Senha ou usuario invalido");
   }
   
    }
    
}
