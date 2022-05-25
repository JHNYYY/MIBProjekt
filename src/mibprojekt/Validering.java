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
import java.lang.Integer; 

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
    
    public static boolean LosenordTextField(JTextField rutaAttKolla) {
        boolean resultat = true;
        
        if(rutaAttKolla.getText().isEmpty()) 
        
        {
        JOptionPane.showMessageDialog(null, "Vänligen ange ett lösenord");
        
        resultat = false;
        }
        
        return resultat;
               
        
    }
    
    
    
    

    
    
     public static boolean kollaDatumTextField(JTextField rutaAttKolla) {
        boolean resultat = true;
        
        if(rutaAttKolla.getText().isEmpty()) 
        
        {
        JOptionPane.showMessageDialog(null, "Vänligen ange ett datum. EX.2020-10-10");
        
        resultat = false;
        }
        
        return resultat;
               
        
    }
    
    

    public static boolean kollaTelefonnummerTextField(JTextField rutaAttKolla) {
        boolean resultat = true;
        
        if(rutaAttKolla.getText().isEmpty()) 
        
        {
        JOptionPane.showMessageDialog(null, "Vänligen ange ett telefonnummer. Ex. 555-5555");
        
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
     
     //public static boolean kollaStrangar(String Strang1, String Strang2){
        // boolean strangKoll = false;
         
     //if (Strang1.equals(Strang2)) {
     //JOptionPane.showMessageDialog(null, "Lösenordet matchar, vänligen välj olika lösenord");
         //strangKoll=true;
     
     //}
     
     
     //return strangKoll;
     
     //}
     
   


