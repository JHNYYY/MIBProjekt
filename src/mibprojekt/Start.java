/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mibprojekt;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Johan Nilsson, Lukas Renström och Anton Rosengren.
 */

public class Start {

    private static InfDB idb;

    /**
     * Startar hela projektet utifrån inloggningsfönstret där man loggar in
     * antingen som agent, administratör eller alien. Databasuppkopplingen sker
     * även här.
     */
    public static void main(String[] args) throws InfException {

        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        } catch (InfException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }

        new Inloggningsfonster().setVisible(true);

    }

}
    
