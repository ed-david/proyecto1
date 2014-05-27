package cadenadecaracteresconunicode;
import javax.swing.JOptionPane;
public class CadenaDeCaracteresConUnicode 
{
   public static void main(String[] args) 
      {
         String s1;
         int codigo;
         s1 = JOptionPane.showInputDialog("digite la cadena de caracteres:");
         for(int i=0;i<s1.length();i++)
            {
               codigo = s1.codePointAt(i);
               JOptionPane.showMessageDialog(null,codigo,"caracter " + s1.charAt(i) + " el unicode es: ",JOptionPane.INFORMATION_MESSAGE);
            }
      }
}