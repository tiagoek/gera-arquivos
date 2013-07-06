/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geraarquivos.view;

import utilitarios.controller.Conexao;

/**
 *
 * @author tiagokochenborger
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexao conUsu;
        conUsu = new Conexao();
        conUsu.getInstance();
        
        FrmListaObrigacoes frm = new FrmListaObrigacoes();
        
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }
}
