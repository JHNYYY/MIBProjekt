import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import mibprojekt.Inloggningsfonster;
import mibprojekt.Start;
import oru.inf.InfDB;
import oru.inf.InfException;
        
   private static InfDB idb;

    /**
     * Creates new form Inloggning
     */
    public Agent() {
        initComponents();
        try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        } catch (InfException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
