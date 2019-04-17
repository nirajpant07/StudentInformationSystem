/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentInformationSystem;

import javax.swing.*;

/**
 *
 * @author Dell
 */
public class EmailVerifier extends InputVerifier {
     public boolean verify(JComponent input)
    {
    JTextField jtf= (JTextField)input;
    if(jtf.getText().matches("^[_A-Za-z0-9-]+(\\.[_A-za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[_A-za-z0-9-]+)"))
        return true;
    else
    {
        JOptionPane.showMessageDialog(input,"Kindly input email properly.","Invalid Input",JOptionPane.ERROR_MESSAGE);
        return false;
    }
    }
}
