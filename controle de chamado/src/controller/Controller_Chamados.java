/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connect_DAO.Connect_DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Chamados;
import model.Usuarios;
import net.proteanit.sql.DbUtils;
import view.TelaPrincipal;
import view.Tela_Chamado;
import static view.Tela_Chamado.btn_Cancelar_Cham;
import static view.Tela_Chamado.btn_Cons_Chamado;
import static view.Tela_Chamado.btn_Edtar_Cham;
import static view.Tela_Chamado.btn_Excluir_Cham;
import static view.Tela_Chamado.btn_Novo_Cham;
import static view.Tela_Chamado.tbl_Chamados;
import static view.Tela_Chamado.txt_Data_Entrada;
import static view.Tela_Chamado.txt_Id_User;
import static view.Tela_Chamado.txt_Responsavel;

/**
 *
 * @author Luciano
 */
public class Controller_Chamados {

    private Connection con = null;
    private Object obj_chamado;

    public Controller_Chamados() {
        this.con = new Connect_DAO().getConnection();
    }

    //ArryList Chamados
    public List<Chamados> listarChamados() {
        try {
            List<Chamados> lista = new ArrayList<>();

            String sql = "select * from tb_usuarios ";
            PreparedStatement stt = con.prepareStatement(sql);
            ResultSet rs = stt.executeQuery();

            while (rs.next()) {
                Chamados obj_chamados = new Chamados();

                obj_chamados.setID(rs.getInt("ID"));
                obj_chamados.setData_Abertura(rs.getString("Data_Abertura"));
                obj_chamados.setAssunto(rs.getString("Assunto"));
                obj_chamados.setDescricao(rs.getString("Descricao"));
                obj_chamados.setResponsavel(rs.getString("Responsavel"));
                obj_chamados.setObservacoes(rs.getString("Observacoes"));
                obj_chamados.setEstado(rs.getString("Estado"));
                obj_chamados.setData_Conclusao(rs.getString("Data_Conclusao"));

                lista.add(obj_chamados);
            }

            return lista;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro :" + erro);
            return null;
        }

    }

    // Método Cadastra Chamado 
    public void cadastrarChamado(Chamados obj_chamado) {
        try {
            String sql = "insert into tb_contr_chamados(ID,Data_Abertura,Assunto,Descricao,Responsavel,Observacoes,Estado,Data_Conclusao) values(?,?,?,?,?,?,?,?)";
            PreparedStatement stt = con.prepareStatement(sql);

            stt.setInt(1, obj_chamado.getID());
            stt.setString(2, obj_chamado.getData_Abertura());
            stt.setString(3, obj_chamado.getAssunto());
            stt.setString(4, obj_chamado.getDescricao());
            stt.setString(5, obj_chamado.getResponsavel());
            stt.setString(6, obj_chamado.getObservacoes());
            stt.setString(7, "Aberto");
            stt.setString(8, obj_chamado.getData_Conclusao());

            stt.execute();
            stt.close();

            JOptionPane.showMessageDialog(null, "Chamado Cadastrado com Sucesso");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Cliente" + e);

        }

    }
    // Método Alterar Chamado 

    public void alterarChamados(Chamados obj_chamado) {

        try {
            String sql = "update tb_contr_chamados set ID=?,Data_Abertura=?,Assunto =?,Descricao=?,Responsavel=?,Observacoes=?,Estado=?,Data_Conclusao=? where Numero=? ";

            PreparedStatement stt = con.prepareStatement(sql);

            stt.setInt(1, obj_chamado.getID());
            stt.setString(2, obj_chamado.getData_Abertura());
            stt.setString(3, obj_chamado.getAssunto());
            stt.setString(4, obj_chamado.getDescricao());
            stt.setString(5, obj_chamado.getResponsavel());
            stt.setString(6, obj_chamado.getObservacoes());
            stt.setString(7, obj_chamado.getEstado());
            stt.setString(8, obj_chamado.getData_Conclusao());
            stt.setInt(9, obj_chamado.getNumero());

            stt.executeUpdate();
            stt.close();

            JOptionPane.showMessageDialog(null, "Alteração efetuada");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao alterar dados do  Usuario" + e);

        }

    }
// Método Excluir Chamado     

    public void excluirChamado(Chamados obj_chamado) {

        try {

            String sql = "DELETE FROM tb_contr_chamados  where Numero = ?";
            PreparedStatement stt = con.prepareStatement(sql);

            stt.setInt(1, obj_chamado.getID());

            stt.execute();
            stt.close();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao excluir" + e);

        }

    }

    // Método Consultar se o chamado pertence ao usuário ou é admim
    public Chamados conpararIDeUser(String Numero) {
        try {
            String sql = "select * from tb_contr_chamados  where Numero = ?";
            PreparedStatement stt = con.prepareStatement(sql);
            stt.setString(1, Numero);
            ResultSet rs = stt.executeQuery();
            Chamados obj_chamados = new Chamados();
            if (rs.next()) {

                int id = Integer.parseInt(TelaPrincipal.txt_ID.getText());

                if (id == (rs.getInt("ID")) || TelaPrincipal.lbl_Perfil.getText().equals("admin")) {
                    obj_chamados.setNumero(rs.getInt("Numero"));
                    obj_chamados.setID(rs.getInt("ID"));
                    obj_chamados.setData_Abertura(rs.getString("Data_Abertura"));
                    obj_chamados.setAssunto(rs.getString("Assunto"));
                    obj_chamados.setDescricao(rs.getString("Descricao"));
                    obj_chamados.setResponsavel(rs.getString("Responsavel"));
                    obj_chamados.setObservacoes(rs.getString("Observacoes"));
                    obj_chamados.setEstado(rs.getString("Estado"));
                    obj_chamados.setData_Conclusao(rs.getString("Data_Conclusao"));
                } else {
                    JOptionPane.showMessageDialog(null, "Você não tem permissão para consultar este chamado!");
                }
            }
            return obj_chamados;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro");
            return null;
        }
    }

    // Método Filtrar pelo responsável ( SQL Like ? )/////////////////////////////////////////////////     
    public void filtrarporresponsavel(String resp) {
        try {
            String sql = "select ID as Usuário, Numero as N_Chamado, Assunto as Assunto, Data_Abertura as Data_Abertura,Responsavel as Responsável, Estado as Estado from tb_contr_chamados where Responsavel Like ?";
            PreparedStatement stt = con.prepareStatement(sql);
            stt.setString(1, resp + "%");
            ResultSet rs = stt.executeQuery();
            Tela_Chamado.tbl_Chamados.setVisible(true);
            Tela_Chamado.tbl_Chamados.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Método Filtrar pelo ID do Usuário( SQL Like ? )/////////////////////////////////////////////////     
    public void filtrarPeloID_Usuer(String ID) {
        try {
            String sql = "select ID as Usuário, Numero as N_Chamado, Assunto as Assunto, Data_Abertura as Data_Abertura, Responsavel as Responsável, Estado as Estado from tb_contr_chamados where ID=?";
            PreparedStatement stt = con.prepareStatement(sql);
            stt.setString(1, ID);
            ResultSet rs = stt.executeQuery();
            Tela_Chamado.tbl_Chamados.setVisible(true);
            Tela_Chamado.tbl_Chamados.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Método Consultar Permissões ( Perfil ) /////////////////////////////////////////////////    
    public static void consultarPermissoes() {

        if (TelaPrincipal.lbl_Perfil.getText().equals("admin")) {
            Tela_Chamado.btn_Cons_Chamado.setEnabled(true);
            Tela_Chamado.btn_Edtar_Cham.setEnabled(true);
            Tela_Chamado.btn_Excluir_Cham.setEnabled(true);
            Tela_Chamado.btn_Cancelar_Cham.setEnabled(true);
            Tela_Chamado.txt_Id_User.setEnabled(true);
            Tela_Chamado.txt_Responsavel.setEnabled(true);
            Tela_Chamado.txt_Nome_Sol.setEnabled(true);
        } else {
            Tela_Chamado.btn_Cons_Chamado.setEnabled(true);
            Tela_Chamado.btn_Cancelar_Cham.setEnabled(true);
            Tela_Chamado.txt_Nome_Sol.setEnabled(false);
        }
        Tela_Chamado.btn_Novo_Cham.setEnabled(false);

    }
// Libera novo chamado

    public static void novo_Chamado() {
        Tela_Chamado.btn_Novo_Cham.setEnabled(true);
        Tela_Chamado.btn_Cons_Chamado.setEnabled(false);
        Tela_Chamado.btn_Edtar_Cham.setEnabled(false);
        Tela_Chamado.btn_Excluir_Cham.setEnabled(false);
        Tela_Chamado.btn_Cancelar_Cham.setEnabled(false);
        Tela_Chamado.txt_Data_Entrada.setText(TelaPrincipal.lbl_Data.getText());
    }

    // Método consultar ID do Usuário 
    public Usuarios consultarID(String Nome) {
        try {
            String sql = "select * from tb_usuarios  where Nome = ?";
            PreparedStatement stt = con.prepareStatement(sql);
            stt.setString(1, Nome);
            ResultSet rs = stt.executeQuery();
            Usuarios obj_user = new Usuarios();
            if (rs.next()) {
                obj_user.setID(rs.getInt("ID"));
            }
            return obj_user;
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Usuario  não encontrado.");
            return null;
        }
    }
    // Método Setar os campos da tabela   

    public static void setar_campos() {
        int setar = Tela_Chamado.tbl_Chamados.getSelectedRow();
        Tela_Chamado.txt_Numero.setText(Tela_Chamado.tbl_Chamados.getModel().getValueAt(setar, 1).toString());
    }

    public static void limparTela() {
        Tela_Chamado.cbx_Estado.setSelectedItem(null);
        Tela_Chamado.txt_Data_Entrada.setText(TelaPrincipal.lbl_Data.getText());
        Tela_Chamado.cbx_Assunto.setSelectedItem(null);
        Tela_Chamado.txt_Descricao.setText(null);
        Tela_Chamado.txt_Obs.setText(null);
        Tela_Chamado.txt_Data_Conc.setText(null);
        Tela_Chamado.cbx_Responsavel.setSelectedItem(null);
        Tela_Chamado.tbl_Chamados.setVisible(false);
    }

    // Método para cancelar o chamado
    public void cancelarChamados(Chamados obj_chamado) {
        try {
            String sql = "update tb_contr_chamados set Estado=?,Data_Conclusao=?,Observacoes=? where Numero=? ";
            PreparedStatement stt = con.prepareStatement(sql);
            stt.setString(1, "Cancelado");
            stt.setString(2, (TelaPrincipal.lbl_Data.getText()));
            stt.setString(3, obj_chamado.getObservacoes()+" / Cancelado por - ID: " + obj_chamado.getID());
            stt.setInt(4, obj_chamado.getNumero());
            stt.executeUpdate();
            stt.close();
            JOptionPane.showMessageDialog(null, "Chamado Cancelado");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados do  Usuario" + e);
        }
    }

    private Chamados cancelarChamados(String Numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void verificaPermCancelar(Chamados obj_chamado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
