/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentInformationSystem;

/**
 *
 * @author Dell
 */
import javax.swing.*;

/**
 *
 * @author Dell
 */
public class GenderVerifier extends InputVerifier {
    
     public boolean verify(JComponent input)
    {
    JRadioButton jrb= (JRadioButton)input;
    if(jrb.isSelected())
    {
        return true;
    }    
    else
    {
        JOptionPane.showMessageDialog(input,"Please select any one.","Can't be empty",JOptionPane.ERROR_MESSAGE);
    
        return false;
    }
        
    }
}
