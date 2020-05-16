package model;

import javax.swing.table.TableModel;

/**
 *
 * @author Luciano
 */
public class Chamados {

    int Numero;
    int ID;
    String Data_Abertura;
    String Assunto;
    String Descricao;
    String Responsavel;
    String Observacoes;
    String Estado;
    String Data_Conclusao;

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getData_Abertura() {
        return Data_Abertura;
    }

    public void setData_Abertura(String Data_Abertura) {
        this.Data_Abertura = Data_Abertura;
    }

    public String getAssunto() {
        return Assunto;
    }

    public void setAssunto(String Assunto) {
        this.Assunto = Assunto;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getResponsavel() {
        return Responsavel;
    }

    public void setResponsavel(String Responsavel) {
        this.Responsavel = Responsavel;
    }

    public String getObservacoes() {
        return Observacoes;
    }

    public void setObservacoes(String Observacoes) {
        this.Observacoes = Observacoes;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getData_Conclusao() {
        return Data_Conclusao;
    }

    public void setData_Conclusao(String Data_Conclusao) {
        this.Data_Conclusao = Data_Conclusao;
    }

    public void setModel(TableModel resultSetToTableModel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
