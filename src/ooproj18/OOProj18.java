/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooproj18;

import javax.swing.JOptionPane;

/**
 *
 * @author chankh
 */
public class OOProj18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SampleUser sU = new SampleUser("ID12345678", "PWD123", 
                new UInfo("U Name", 22, "U Addr"));
        JOptionPane.showMessageDialog(null, sU.getSUInfo());
    }
    
}
