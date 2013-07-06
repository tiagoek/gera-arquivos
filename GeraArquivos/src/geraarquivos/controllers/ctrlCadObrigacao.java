/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geraarquivos.controllers;

import geraarquivos.model.CadLayout;
import geraarquivos.model.CadObrigacao;
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
public class ctrlCadObrigacao {
    
    private Statement stmt = null;
    
    Conexao con = Conexao.getInstance();
    
    java.util.ResourceBundle bundleMSG = java.util.ResourceBundle.getBundle("utilitarios.resources/BundleMSG"); // NOI18N
    
    public int insertCadObrigacao(CadObrigacao obr)
    {
        try {
            Connection con2 = con.getConecta();

            String sql=" insert into cadObrigacao (nomeObrigacao,periodicidade,orgaoRegulador,diaEntrega,diaProgramaGeracao,saidaUnica) values"
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
            
            pstm.setString(1,obr.getNomeObrigacao());
            pstm.setString(2,obr.getPeriodicidade());
            pstm.setString(3,obr.getOrgaoRegulador());
            pstm.setString(4,obr.getDiaEntrega());
            pstm.setString(5,obr.getDiaProgramaGeracao());
            pstm.setBoolean(6,obr.getSaidaUnica());
            

            pstm.execute(); 
            
            String msg = bundleMSG.getString("MensagemSucesso");
            JOptionPane.showMessageDialog(null, msg+' '+"Cadastro de Obrigação");
            
            return buscaIdCadObrigacao();
            
        } catch (SQLException ex) {
            Logger.getLogger(ctrlCadObrigacao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }  
        /**
     *
     * @return
     */
    public ResultSet listaCadObrigacao()
    {
        try {
            Connection con2 = con.getConecta();

            String sql="SELECT * from cadObrigacao ";
            
            //System.out.println(sql);
            PreparedStatement pstm = con2.prepareStatement(sql);
            
            //JOptionPane.showMessageDialog(null, "Entrou nas notas de entrada");
             

            ResultSet rs = pstm.executeQuery(); 

            con.resultSet=rs;
            
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(ctrlCadObrigacao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    
    
    }
    
    public int buscaIdCadObrigacao()
    {
        try {
            Connection con2 = con.getConecta();

            String sql="SELECT max(idCadObrigacoes) as id from cadObrigacao ";
            
            //System.out.println(sql);
            PreparedStatement pstm = con2.prepareStatement(sql);
            
            //JOptionPane.showMessageDialog(null, "Entrou nas notas de entrada");
             

            ResultSet rs = pstm.executeQuery(); 

            return rs.getInt("id");
        } catch (SQLException ex) {
            Logger.getLogger(ctrlCadObrigacao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    
    
    }
    
}
