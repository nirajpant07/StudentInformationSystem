package StudentInformationSystem;


import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class CountryVerifier extends InputVerifier{
    
    public boolean verify(JComponent input)
    {
    JTextField jtf= (JTextField)input;
    if(jtf.getText().matches("[A-Z][a-zA-Z]*"))
        return true;
    else
    {
        JOptionPane.showMessageDialog(input,"Kindly input country properly. For eg; Nepal","Invalid Input",JOptionPane.ERROR_MESSAGE);
        return false;
    }
    }
    
}
