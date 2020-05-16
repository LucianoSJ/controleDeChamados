package view;

import java.sql.*;
import controller.Controller_Chamados;
import static controller.Controller_Chamados.setar_campos;
import controller.Controller_User;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.Chamados;
import model.Usuarios;
import net.proteanit.sql.DbUtils;
//@author Luciano

public class Tela_Chamado extends javax.swing.JInternalFrame {

    public Tela_Chamado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btn_Novo_Cham = new javax.swing.JButton();
        btn_Cons_Chamado = new javax.swing.JButton();
        btn_Edtar_Cham = new javax.swing.JButton();
        btn_Excluir_Cham = new javax.swing.JButton();
        btn_Cancelar_Cham = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_Data_Entrada = new javax.swing.JTextField();
        rbt_Novo_Chamado = new javax.swing.JRadioButton();
        txt_Numero = new javax.swing.JTextField();
        cbx_Responsavel = new javax.swing.JComboBox<>();
        cbx_Estado = new javax.swing.JComboBox<>();
        rbt_Consultar_Chamado = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Data_Conc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_Nome_Sol = new javax.swing.JTextField();
        btn_Pes_Sol = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_Descricao = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_Obs = new javax.swing.JTextField();
        cbx_Assunto = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Chamados = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Responsavel = new javax.swing.JTextField();
        txt_Id_User = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Tela de Chamados");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        btn_Novo_Cham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lsj/icones/ic_Mais.png"))); // NOI18N
        btn_Novo_Cham.setToolTipText("Adcionar Chamado");
        btn_Novo_Cham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Novo_Cham.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_Novo_Cham.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_Novo_Cham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Novo_ChamActionPerformed(evt);
            }
        });

        btn_Cons_Chamado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lsj/icones/ic_pes_fol.png"))); // NOI18N
        btn_Cons_Chamado.setToolTipText("Consultar Chamado");
        btn_Cons_Chamado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cons_Chamado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_Cons_Chamado.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_Cons_Chamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cons_ChamadoActionPerformed(evt);
            }
        });

        btn_Edtar_Cham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lsj/icones/ic_edite.png"))); // NOI18N
        btn_Edtar_Cham.setToolTipText("Editar Chamado");
        btn_Edtar_Cham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Edtar_Cham.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_Edtar_Cham.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_Edtar_Cham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Edtar_ChamActionPerformed(evt);
            }
        });

        btn_Excluir_Cham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lsj/icones/ic_excluir.png"))); // NOI18N
        btn_Excluir_Cham.setToolTipText("Excluir Chamado");
        btn_Excluir_Cham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Excluir_Cham.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_Excluir_Cham.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_Excluir_Cham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Excluir_ChamActionPerformed(evt);
            }
        });

        btn_Cancelar_Cham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lsj/icones/ic_cancelar.png"))); // NOI18N
        btn_Cancelar_Cham.setToolTipText("Cancelar Chamado");
        btn_Cancelar_Cham.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cancelar_Cham.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_Cancelar_Cham.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_Cancelar_Cham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cancelar_ChamActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Rsponsável:");

        jLabel10.setText("Estado:");

        txt_Data_Entrada.setEnabled(false);

        buttonGroup1.add(rbt_Novo_Chamado);
        rbt_Novo_Chamado.setText("Novo Chamado");
        rbt_Novo_Chamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_Novo_ChamadoActionPerformed(evt);
            }
        });

        txt_Numero.setEnabled(false);

        cbx_Responsavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enrico", "Luciano", "Matteo", "Plínio" }));

        cbx_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aberto", "Análise", "Cancelado", "Concluido", "Execução" }));

        buttonGroup1.add(rbt_Consultar_Chamado);
        rbt_Consultar_Chamado.setText("Consultar Chamado");
        rbt_Consultar_Chamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_Consultar_ChamadoActionPerformed(evt);
            }
        });

        jLabel5.setText("Data de Entrada:");

        jLabel6.setText("Data da Conclusão:");

        jLabel9.setText("Nome do Solicitante:");

        jLabel2.setText("Assusto:");

        jLabel1.setText("Numero do Chamado:");

        txt_Nome_Sol.setEnabled(false);

        btn_Pes_Sol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/lsj/icones/ic_Lupa_22px.png"))); // NOI18N
        btn_Pes_Sol.setToolTipText("Filtrar pelo nome do usuário");
        btn_Pes_Sol.setBorderPainted(false);
        btn_Pes_Sol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Pes_SolActionPerformed(evt);
            }
        });

        jLabel4.setText("Descrição:");

        jLabel11.setText("Observações:");

        txt_Obs.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        cbx_Assunto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diversos", "Hardwares", "Impressoras", "Nobreaks", "Outros", "Projeto Simples", "Redes", "Reunião", "Softwares" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(4, 4, 4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_Data_Conc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                        .addComponent(txt_Data_Entrada, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbx_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbx_Assunto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbx_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txt_Descricao)
                            .addComponent(txt_Obs))
                        .addGap(81, 81, 81))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_Nome_Sol, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Pes_Sol)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(rbt_Novo_Chamado)
                .addGap(18, 18, 18)
                .addComponent(rbt_Consultar_Chamado)
                .addContainerGap(470, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbt_Novo_Chamado)
                            .addComponent(rbt_Consultar_Chamado))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Data_Entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Data_Conc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(cbx_Assunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbx_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(32, 32, 32)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Pes_Sol)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Nome_Sol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_Obs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tbl_Chamados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Numero", "Assunto", "Data Abertura", "Responsavel", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Chamados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ChamadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Chamados);

        jLabel8.setText("Responsável:");

        jLabel7.setText("ID Usuário:");

        txt_Responsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ResponsavelActionPerformed(evt);
            }
        });
        txt_Responsavel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_ResponsavelKeyReleased(evt);
            }
        });

        txt_Id_User.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_Id_UserKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_Id_UserKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Id_User, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_Id_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btn_Novo_Cham, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Cons_Chamado, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Edtar_Cham, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Excluir_Cham, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Cancelar_Cham, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(4, 4, 4))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Excluir_Cham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Cons_Chamado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Edtar_Cham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Cancelar_Cham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Novo_Cham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
        );

        setBounds(0, 0, 771, 684);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        //Execulta ao clicar no formulário
    }//GEN-LAST:event_formInternalFrameActivated

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        txt_Nome_Sol.setText(TelaPrincipal.lbl_Usuario.getText());
        btn_Pes_Sol.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btn_Pes_Sol.setContentAreaFilled(false);

        btn_Novo_Cham.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btn_Novo_Cham.setContentAreaFilled(false);

        btn_Cons_Chamado.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btn_Cons_Chamado.setContentAreaFilled(false);

        btn_Edtar_Cham.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btn_Edtar_Cham.setContentAreaFilled(false);

        btn_Excluir_Cham.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btn_Excluir_Cham.setContentAreaFilled(false);

        btn_Cancelar_Cham.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        btn_Cancelar_Cham.setContentAreaFilled(false);

        Controller_Chamados.limparTela();;

        btn_Novo_Cham.setEnabled(false);
        btn_Cons_Chamado.setEnabled(false);
        btn_Edtar_Cham.setEnabled(false);
        btn_Excluir_Cham.setEnabled(false);
        btn_Cancelar_Cham.setEnabled(false);

        txt_Id_User.setEnabled(false);
        txt_Responsavel.setEnabled(false);

        txt_Data_Entrada.setText(TelaPrincipal.lbl_Data.getText());
    }//GEN-LAST:event_formInternalFrameOpened
//Cadastra novo Chamado  
    private void btn_Novo_ChamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Novo_ChamActionPerformed

        txt_Numero.setText("");
        if (!"".equals(txt_Id_User.getText())
                && !"".equals(txt_Data_Entrada.getText())
                && !"".equals(cbx_Assunto.getSelectedItem())
                && !"".equals(txt_Descricao.getText())
                && !"".equals(cbx_Responsavel.getSelectedItem())
                && !"".equals(txt_Obs.getText())
                && !"".equals(cbx_Estado.getSelectedItem())) {
            Chamados obj_chamados = new Chamados();

            obj_chamados.setID(Integer.parseInt(txt_Id_User.getText()));
            obj_chamados.setData_Abertura(txt_Data_Entrada.getText());
            obj_chamados.setAssunto((String) cbx_Assunto.getSelectedItem());
            obj_chamados.setDescricao(txt_Descricao.getText());
            obj_chamados.setResponsavel((String) cbx_Responsavel.getSelectedItem());
            obj_chamados.setObservacoes(txt_Obs.getText());
            obj_chamados.setEstado((String) cbx_Estado.getSelectedItem());
            obj_chamados.setData_Conclusao(txt_Data_Conc.getText());

            Tela_Chamado.tbl_Chamados.setVisible(false);

            if (txt_Numero.getText().equals("")) {
                Controller_Chamados dao = new Controller_Chamados();
                // Chama o Método CadastraUsuario
                dao.cadastrarChamado(obj_chamados);
                Controller_Chamados.limparTela();
            }
        }
    }//GEN-LAST:event_btn_Novo_ChamActionPerformed

    private void txt_Id_UserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Id_UserKeyReleased
        // Executa enquanto digita
    }//GEN-LAST:event_txt_Id_UserKeyReleased

    private void tbl_ChamadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ChamadosMouseClicked
        setar_campos();
        Controller_Chamados controller = new Controller_Chamados();
        Chamados obj_chamado = new Chamados();
        obj_chamado = controller.conpararIDeUser(txt_Numero.getText());

        txt_Numero.setText(String.valueOf(obj_chamado.getNumero()));
        txt_Id_User.setText(String.valueOf(obj_chamado.getID()));
        txt_Data_Entrada.setText(obj_chamado.getData_Abertura());
        cbx_Assunto.setSelectedItem(obj_chamado.getAssunto());
        txt_Descricao.setText(String.valueOf(obj_chamado.getDescricao()));
        cbx_Responsavel.setSelectedItem(obj_chamado.getResponsavel());
        txt_Obs.setText(obj_chamado.getObservacoes());
        cbx_Estado.setSelectedItem(obj_chamado.getEstado());
        txt_Data_Conc.setText(obj_chamado.getData_Conclusao());

        Controller_Chamados.consultarPermissoes();
    }//GEN-LAST:event_tbl_ChamadosMouseClicked

    private void txt_Id_UserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Id_UserKeyPressed

    }//GEN-LAST:event_txt_Id_UserKeyPressed
//Altera Chamado  
    private void btn_Edtar_ChamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Edtar_ChamActionPerformed

        if (!"".equals(txt_Id_User.getText())
                && !"".equals(txt_Data_Entrada.getText())
                && !"".equals(cbx_Assunto.getSelectedItem())
                && !"".equals(txt_Descricao.getText())
                && !"".equals(cbx_Responsavel.getSelectedItem())
                && !"".equals(txt_Obs.getText())
                && !"".equals(cbx_Estado.getSelectedItem())) {
            Chamados obj_chamado = new Chamados();

            obj_chamado.setID(Integer.parseInt(txt_Id_User.getText()));
            obj_chamado.setData_Abertura(txt_Data_Entrada.getText());
            obj_chamado.setAssunto((String) cbx_Assunto.getSelectedItem());
            obj_chamado.setDescricao(txt_Descricao.getText());
            obj_chamado.setResponsavel((String) cbx_Responsavel.getSelectedItem());
            obj_chamado.setObservacoes(txt_Obs.getText());
            obj_chamado.setEstado((String) cbx_Estado.getSelectedItem());
            obj_chamado.setData_Conclusao(txt_Data_Conc.getText());
            obj_chamado.setNumero(Integer.parseInt(txt_Numero.getText()));

            Tela_Chamado.tbl_Chamados.setVisible(false);

            if (!txt_Numero.getText().equals("")) {
                Controller_Chamados dao = new Controller_Chamados();
                // Chama o Método CadastraChamado
                dao.alterarChamados(obj_chamado);
            }
        } else {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
        }
    }//GEN-LAST:event_btn_Edtar_ChamActionPerformed

    private void rbt_Consultar_ChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_Consultar_ChamadoActionPerformed
        Controller_Chamados.consultarPermissoes();
    }//GEN-LAST:event_rbt_Consultar_ChamadoActionPerformed
//Excluir Chamado  *************   OK    *******************************************
    private void btn_Excluir_ChamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Excluir_ChamActionPerformed
        if (txt_Numero.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Usuário não selecionado");

        } else {

            int resposta = JOptionPane.OK_CANCEL_OPTION;
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja Realmente Excluir o Chamado", "Atenção", JOptionPane.YES_NO_OPTION);
            if (confirma == JOptionPane.YES_OPTION) {

                Chamados obj_chamado = new Chamados();

                obj_chamado.setID(Integer.parseInt(txt_Numero.getText()));

                Controller_Chamados dao = new Controller_Chamados();
                dao.excluirChamado(obj_chamado);

                Controller_Chamados.limparTela();

            }
        }
    }//GEN-LAST:event_btn_Excluir_ChamActionPerformed

    private void rbt_Novo_ChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_Novo_ChamadoActionPerformed
        
        chama_controlle_consutar_user();
        Controller_Chamados.novo_Chamado();
        Controller_Chamados.limparTela();
    }//GEN-LAST:event_rbt_Novo_ChamadoActionPerformed

    private void btn_Cancelar_ChamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cancelar_ChamActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Deseja Realmente Cancelar o Chamado?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            String res = txt_Numero.getText();
            if (!txt_Numero.getText().equals("")) {
                Chamados obj_chamado = new Chamados();

                obj_chamado.setEstado((String) cbx_Estado.getSelectedItem());
                obj_chamado.setData_Conclusao(txt_Data_Conc.getText());
                obj_chamado.setObservacoes(txt_Obs.getText());
                obj_chamado.setID(Integer.parseInt(txt_Id_User.getText()));
                obj_chamado.setNumero(Integer.parseInt(txt_Numero.getText()));
                if ((obj_chamado.getEstado()).equals("Aberto") || TelaPrincipal.lbl_Perfil.getText().equals("admin")) {

                    Controller_Chamados dao = new Controller_Chamados();
                    dao.cancelarChamados(obj_chamado); // chama o método Cancela o Chamado
                    Tela_Chamado.tbl_Chamados.setVisible(false);
                    Controller_Chamados.limparTela();

                } else {
                    JOptionPane.showMessageDialog(null, "Você não tem permissão para cancelar este chamado!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro!");
            }
    }//GEN-LAST:event_btn_Cancelar_ChamActionPerformed
    }
    private void btn_Pes_SolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Pes_SolActionPerformed

        chama_controlle_consutar_user();
        Controller_Chamados dao = new Controller_Chamados();
        Chamados obj_resp = new Chamados();
        dao.filtrarPeloID_Usuer(txt_Id_User.getText());
    }//GEN-LAST:event_btn_Pes_SolActionPerformed
// Consulta pelo número do chamado
    private void btn_Cons_ChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cons_ChamadoActionPerformed

        Controller_Chamados controller = new Controller_Chamados();
        Chamados obj_chamado = new Chamados();
        String ID = JOptionPane.showInputDialog("Digite o número do chamado");
        obj_chamado = controller.conpararIDeUser(ID);

        if (txt_Numero.getText() != null) {

            txt_Numero.setText(String.valueOf(obj_chamado.getNumero()));
            txt_Id_User.setText(String.valueOf(obj_chamado.getID()));
            txt_Data_Entrada.setText(obj_chamado.getData_Abertura());
            cbx_Assunto.setSelectedItem(obj_chamado.getAssunto());
            txt_Descricao.setText(String.valueOf(obj_chamado.getDescricao()));
            cbx_Responsavel.setSelectedItem(obj_chamado.getResponsavel());
            txt_Obs.setText(obj_chamado.getObservacoes());
            cbx_Estado.setSelectedItem(obj_chamado.getEstado());
            txt_Data_Conc.setText(obj_chamado.getData_Conclusao());
            Tela_Chamado.tbl_Chamados.setVisible(false);
        } else {

            JOptionPane.showMessageDialog(null, "Chamado não encontrado");
        }
    }//GEN-LAST:event_btn_Cons_ChamadoActionPerformed

    private void chama_controlle_consutar_user() {
        String Nome = txt_Nome_Sol.getText();
        Usuarios obj_user = new Usuarios();
        Controller_Chamados dao = new Controller_Chamados();
        obj_user = dao.consultarID(Nome);

        if (txt_Nome_Sol.getText() != null) {
            txt_Id_User.setText(String.valueOf(obj_user.getID()));
            Controller_Chamados.novo_Chamado();
        } else {

            JOptionPane.showMessageDialog(null, "Usuario não encontrado");
        }
    }


    private void txt_ResponsavelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ResponsavelKeyReleased
        Controller_Chamados dao = new Controller_Chamados();
        Chamados obj_resp = new Chamados();
        dao.filtrarporresponsavel(txt_Responsavel.getText());
    }//GEN-LAST:event_txt_ResponsavelKeyReleased

    private void txt_ResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ResponsavelActionPerformed

    }//GEN-LAST:event_txt_ResponsavelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_Cancelar_Cham;
    public static javax.swing.JButton btn_Cons_Chamado;
    public static javax.swing.JButton btn_Edtar_Cham;
    public static javax.swing.JButton btn_Excluir_Cham;
    public static javax.swing.JButton btn_Novo_Cham;
    public static javax.swing.JButton btn_Pes_Sol;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JComboBox<String> cbx_Assunto;
    public static javax.swing.JComboBox<String> cbx_Estado;
    public static javax.swing.JComboBox<String> cbx_Responsavel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbt_Consultar_Chamado;
    private javax.swing.JRadioButton rbt_Novo_Chamado;
    public static javax.swing.JTable tbl_Chamados;
    public static javax.swing.JTextField txt_Data_Conc;
    public static javax.swing.JTextField txt_Data_Entrada;
    public static javax.swing.JTextField txt_Descricao;
    public static javax.swing.JTextField txt_Id_User;
    public static javax.swing.JTextField txt_Nome_Sol;
    public static javax.swing.JTextField txt_Numero;
    public static javax.swing.JTextField txt_Obs;
    public static javax.swing.JTextField txt_Responsavel;
    // End of variables declaration//GEN-END:variables
}
