/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connect_DAO.Connect_DAO;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Usuarios;
import view.TelaPrincipal;
import view.Tela_Login;

/**
 *
 * @author Luciano
 */
public class Controller_Login {

    private Connection con = null;

    public Controller_Login() {
        this.con = new Connect_DAO().getConnection();
    }

    public Usuarios login(String login, String senha) {
        try {
            String sql = "select * from tb_usuarios where Login=? and Senha =?";
            PreparedStatement stt = con.prepareStatement(sql);
            stt.setString(1, login);
            stt.setString(2, senha);
            ResultSet rs = stt.executeQuery();
            Usuarios obj_user = new Usuarios();
            if (rs.next()) {
                if (rs.getString("Perfil").equals("admin")) {
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    TelaPrincipal.menu_Usuario.setEnabled(true);//Desbloque Menu Usuário
                    TelaPrincipal.txt_ID.setText(String.valueOf(rs.getInt("ID")));
                    TelaPrincipal.lbl_Usuario.setText(rs.getString("Nome"));
                    TelaPrincipal.lbl_Perfil.setText(rs.getString("Perfil"));
                    TelaPrincipal.lbl_Usuario.setForeground(Color.red);
                    Tela_Login frame = new Tela_Login();
                    frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
                } else {
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    TelaPrincipal.txt_ID.setText(String.valueOf(rs.getInt("ID")));
                    TelaPrincipal.lbl_Usuario.setText(rs.getString("Nome"));
                    TelaPrincipal.lbl_Perfil.setText(rs.getString("Perfil"));
                    Tela_Login frame = new Tela_Login();
                    frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario  não encontrado");
            }
            return obj_user;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um Erro");
            return null;
        }
    }
}
