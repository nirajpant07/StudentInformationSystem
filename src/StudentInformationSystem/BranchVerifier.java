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


public class BranchVerifier extends InputVerifier {
     public boolean verify(JComponent input)
    {
    JComboBox jcf= (JComboBox)input;
    if(jcf.getSelectedIndex()==0)
    {
        JOptionPane.showMessageDialog(input,"Please select any one.","Can't be empty",JOptionPane.ERROR_MESSAGE);
    
        return false;
    }    
    else
        return true;
    }
}