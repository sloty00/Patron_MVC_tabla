/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jvargas
 */
public class modelo extends DefaultTableModel {
 
    public modelo() {
        super(constants.DATA, constants.TABLE_HEADER);
    }
 
}
