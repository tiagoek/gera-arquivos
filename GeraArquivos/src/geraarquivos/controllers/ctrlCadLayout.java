/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geraarquivos.controllers;

import geraarquivos.model.CadLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utilitarios.controller.Conexao;

/**
 *
 * @author tiagokochenborger
 */
public class ctrlCadLayout {
    
    private Statement stmt = null;
    
    Conexao con = Conexao.getInstance();
    
    java.util.ResourceBundle bundleMSG = java.util.ResourceBundle.getBundle("utilitarios.resources/BundleMSG"); // NOI18N
    
    public void insertCadLayout(CadLayout lay)
    {
        try {
            Connection con2 = con.getConecta();

            String sql=" insert into cadLayout (nomeLayout,modeloArquitetura,separador,extensaoArquivo,saidaArquivo,quebraLinha) values"
                    + "("
                    + " ?,"
                    + " ?,"
                    + " ?,"
                    + " ?,"
                    + " ?,"
                    + " ?"
                    + ")";
            //System.out.println(sql);
            PreparedStatement pstm = con2.prepareStatement(sql);
            
            pstm.setString(1,lay.getNomeLayout());
            pstm.setString(2,lay.getModeloArquitetura());
            pstm.setString(3,lay.getSeparador());
            pstm.setString(4,lay.getExtensaoArquivo());
            pstm.setString(5,lay.getSaidaArquivo());
            pstm.setString(6,lay.getQuebraLinha());
            

            pstm.execute(); 
            
            String msg = bundleMSG.getString("MensagemSucesso");
            JOptionPane.showMessageDialog(null, msg+' '+" Cadastro de Layout");
            
        } catch (SQLException ex) {
            Logger.getLogger(ctrlCadLayout.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }  
        /**
     *
     * @return
     */
    public ResultSet listaCadLayout()
    {
        try {
            Connection con2 = con.getConecta();

            String sql="SELECT * from cadLayout ";
            
            //System.out.println(sql);
            PreparedStatement pstm = con2.prepareStatement(sql);
            
            //JOptionPane.showMessageDialog(null, "Entrou nas notas de entrada");
             

            ResultSet rs = pstm.executeQuery(); 

            con.resultSet=rs;
            
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ctrlCadLayout.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    
    
    }
    
    
}
