/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mibprojekt;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author johannilsson
 */
public class Validering {
    public static boolean textFaltHarVarde(JTextField rutaAttKolla) {
        boolean resultat = true;
        
        if(rutaAttKolla.getText().isEmpty()) 
        
        {
        JOptionPane.showMessageDialog(null, "Vänligen ange ett namn");
        
        resultat = false;
        }
        
        return resultat;
               
        
    }

    public static boolean textLösenordHarVärde(JPasswordField fältAttKolla) {
        boolean resultatet = true;
        
        if(fältAttKolla.getText().isEmpty()) 
        
        {
        JOptionPane.showMessageDialog(null, "Vänligen ange ett Lösenord");
        
        resultatet = false;
        }
        
        return resultatet; 
               
        
    }

    public static boolean checkBox(JCheckBox checkBoxattkolla) {
        boolean resultatet = true;
        
        if(!checkBoxattkolla.isSelected()) 
        
        {
        JOptionPane.showMessageDialog(null, "Vänligen välj Agent eller Alien");
        
        resultatet = false;
        }
        
        return resultatet; 
               
        
    }

    public static boolean checkBoxen(JCheckBox checkBoxattkolla) {
        boolean resultatet = true;
        
        if(!checkBoxattkolla.isSelected()) 
        
        {
        JOptionPane.showMessageDialog(null, "Vänligen välj Agent eller Alien");
        
        resultatet = false;
        }
        
        return resultatet; 
               
        
    }
}

