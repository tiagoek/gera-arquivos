/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geraarquivos.model;

/**
 *
 * @author tiagokochenborger
 */
public class CadObrigacao {
    
    private int idCadObrigacao;
    private String nomeObrigacao;
    private String periodicidade;
    private String orgaoRegulador;
    private String diaEntrega;
    private String diaProgramaGeracao;
    private boolean saidaUnica;

    /**
     * @return the idCadObrigacao
     */
    public int getIdCadObrigacao() {
        return idCadObrigacao;
    }

    /**
     * @param idCadObrigacao the idCadObrigacao to set
     */
    public void setIdCadObrigacao(int idCadObrigacao) {
        this.idCadObrigacao = idCadObrigacao;
    }

    /**
     * @return the nomeObrigacao
     */
    public String getNomeObrigacao() {
        return nomeObrigacao;
    }

    /**
     * @param nomeObrigacao the nomeObrigacao to set
     */
    public void setNomeObrigacao(String nomeObrigacao) {
        this.nomeObrigacao = nomeObrigacao;
    }

    /**
     * @return the periodicidade
     */
    public String getPeriodicidade() {
        return periodicidade;
    }

    /**
     * @param periodicidade the periodicidade to set
     */
    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    /**
     * @return the orgaoRegulador
     */
    public String getOrgaoRegulador() {
        return orgaoRegulador;
    }

    /**
     * @param orgaoRegulador the orgaoRegulador to set
     */
    public void setOrgaoRegulador(String orgaoRegulador) {
        this.orgaoRegulador = orgaoRegulador;
    }

    /**
     * @return the diaEntrega
     */
    public String getDiaEntrega() {
        return diaEntrega;
    }

    /**
     * @param diaEntrega the diaEntrega to set
     */
    public void setDiaEntrega(String diaEntrega) {
        this.diaEntrega = diaEntrega;
    }

    /**
     * @return the diaProgramaGeracao
     */
    public String getDiaProgramaGeracao() {
        return diaProgramaGeracao;
    }

    /**
     * @param diaProgramaGeracao the diaProgramaGeracao to set
     */
    public void setDiaProgramaGeracao(String diaProgramaGeracao) {
        this.diaProgramaGeracao = diaProgramaGeracao;
    }

    /**
     * @return the saidaUnica
     */
    public boolean getSaidaUnica() {
        return saidaUnica;
    }

    /**
     * @param saidaUnica the saidaUnica to set
     */
    public void setSaidaUnica(boolean saidaUnica) {
        this.saidaUnica = saidaUnica;
    }
    
}
