/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Dialog;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author K Sistemas
 */
public class JasperController {
    
    private final String title;
    private final String report;
    private JRBeanCollectionDataSource ds;
    private Map params;
    
    public JasperController(String title, String reportName){
        this.report = "relatorios/" + reportName + ".jasper";
        this.title = title;
        this.params = new HashMap();
    }
    
    public void setData(java.util.List listData){
        this.ds = new JRBeanCollectionDataSource(listData); 
    }
    
    public void setParams(Map params){
        this.params = params;
    }
        
    public void print(){
        JasperPrint jsPrint;
        try {
            java.util.Locale locale = new Locale( "pt", "BR");
            this.params.put(JRParameter.REPORT_LOCALE, locale);
            jsPrint = JasperFillManager.fillReport(this.report, this.params, ds);
            JasperViewer jasperViewer = new JasperViewer(jsPrint, false);

            jasperViewer.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
            jasperViewer.setTitle(this.title);
            jasperViewer.setZoomRatio((float) 1);
            jasperViewer.setExtendedState(JasperViewer.MAXIMIZED_BOTH);
            jasperViewer.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
            jasperViewer.requestFocus();
            jasperViewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(JasperController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao tentar imprimir!\n"
                    + ex.getMessage());
        }

    }
    
}
