package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import connect_DAO.Connect_DAO;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Usuarios;
import view.Tela_Usuarios;

/**
 *
 * @author Luciano
 */
public class Controller_User {

    private Connection con = null;
    private String Nome;

    public Controller_User() {
        this.con = new Connect_DAO().getConnection();
    }

    public List<Usuarios> listarUsuario() {

        try {

            List<Usuarios> lista = new ArrayList<>();

            String sql = "select * from tb_usuarios ";
            PreparedStatement stt = con.prepareStatement(sql);
            ResultSet rs = stt.executeQuery();

            while (rs.next()) {
                Usuarios obj_user = new Usuarios();

                obj_user.setID(rs.getInt("ID"));
                obj_user.setNome(rs.getString("Nome"));
                obj_user.setCargo(rs.getString("Cargo"));
                obj_user.setSetor(rs.getString("Setor"));
                obj_user.setRamal(rs.getInt("Ramal"));
                obj_user.setPerfil(rs.getString("Perfil"));
                obj_user.setLogin(rs.getString("Login"));
                obj_user.setSenha(rs.getString("Senha"));

                lista.add(obj_user);
            }

            return lista;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro :" + erro);
            return null;
        }

    }

    public void cadastrarUsuario(Usuarios obj_user) {

        try {

            String sql = "insert into tb_usuarios(Nome,Cargo,Setor,Ramal,Perfil,Login,Senha) values(?,?,?,?,?,?,?)";
            PreparedStatement stt = con.prepareStatement(sql);

            stt.setString(1, obj_user.getNome());
            stt.setString(2, obj_user.getCargo());
            stt.setString(3, obj_user.getSetor());
            stt.setInt(4, obj_user.getRamal());
            stt.setString(5, obj_user.getPerfil());
            stt.setString(6, obj_user.getLogin());
            stt.setString(7, obj_user.getSenha());

            stt.execute();
            stt.close();

            JOptionPane.showMessageDialog(null, "Cadastro efetuado");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao cadastrar Cliente" + e);

        }

    }

    public void alterarUsuario(Usuarios obj_user) {

        try {    String sql = "update tb_usuarios set Nome=?,Cargo=?,Setor=?,Ramal=?,Perfil=?,Login=?,Senha=? where ID=? ";

            PreparedStatement stt = con.prepareStatement(sql);
           
            stt.setString(1, obj_user.getNome());
            stt.setString(2, obj_user.getCargo());
            stt.setString(3, obj_user.getSetor());
            stt.setInt(4, obj_user.getRamal());
            stt.setString(5, obj_user.getPerfil());
            stt.setString(6, obj_user.getLogin());
            stt.setString(7, obj_user.getSenha());
            stt.setInt(8, obj_user.getID());
            stt.executeUpdate();
            stt.close();

            JOptionPane.showMessageDialog(null, "Alteração efetuada");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao alterar dados do  Usuario" + e);

        }

    }

    public void excluirUsuario(Usuarios obj_user) {

        try {

            String sql = "DELETE FROM tb_usuarios  where ID = ?";
            PreparedStatement stt = con.prepareStatement(sql);

            stt.setInt(1, obj_user.getID());

            stt.execute();
            stt.close();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao excluir" + e);

        }

    }
 
    public Usuarios consultarporID(String ID) {

        try {
            String sql = "select * from tb_usuarios  where ID = ?";
            PreparedStatement stt = con.prepareStatement(sql);
            stt.setString(1, ID);
            ResultSet rs = stt.executeQuery();
            Usuarios obj_user = new Usuarios();
            if (rs.next()) {

                obj_user.setID(rs.getInt("ID"));
                obj_user.setNome(rs.getString("Nome"));
                obj_user.setCargo(rs.getString("Cargo"));
                obj_user.setSetor(rs.getString("Setor"));
                obj_user.setRamal(rs.getInt("Ramal"));
                obj_user.setPerfil(rs.getString("Perfil"));
                obj_user.setLogin(rs.getString("Login"));
                obj_user.setSenha(rs.getString("Senha"));

            }

            return obj_user;

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Usuario  não encontrado.");

            return null;
        }

    }

 public void Controller_Boton(){
    
        Tela_Usuarios.btn_Novo.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        Tela_Usuarios.btn_Novo.setContentAreaFilled(false);
        
        Tela_Usuarios.btn_Pesquisar.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        Tela_Usuarios.btn_Pesquisar.setContentAreaFilled(false);

        Tela_Usuarios.btn_Alterar.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        Tela_Usuarios.btn_Alterar.setContentAreaFilled(false);

        Tela_Usuarios.btn_Excluir.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        Tela_Usuarios.btn_Excluir.setContentAreaFilled(false);

}     
    
}
