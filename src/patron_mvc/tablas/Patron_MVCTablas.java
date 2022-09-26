/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patron_mvc.tablas;

import javax.swing.SwingUtilities;
import vista.vista;

/**
 *
 * @author jvargas
 */
public class Patron_MVCTablas {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    createAndShowGUI();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    public static void createAndShowGUI() throws Exception {
        new vista();
    }
    
}
