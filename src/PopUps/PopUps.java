package PopUps;

import java.awt.Component;
import javax.swing.JOptionPane;

public class PopUps {
    
    public static void displaySuccessJOP(String text, Component cmpnt){
        JOptionPane.showMessageDialog(cmpnt, text, "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void displayErrorMessageJOP(String text, Component cmpnt){
        JOptionPane.showMessageDialog(cmpnt, text, "Erro!", JOptionPane.WARNING_MESSAGE);
    }
}
