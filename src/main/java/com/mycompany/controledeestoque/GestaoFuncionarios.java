/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.controledeestoque;

import com.mycompany.controledeestoque.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author dailt
 */
public class GestaoFuncionarios extends javax.swing.JPanel {

    /**
     * Creates new form CadastroFuncionarios
     */
    public GestaoFuncionarios() {
        initComponents();
        carregarFuncionariosNaTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cadastroNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cadastroLogin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cargosBox = new javax.swing.JComboBox<>();
        editarID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cadastroSenha = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnDeletar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Nome completo");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Cargo");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Login");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Senha");

        cargosBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atendente", "Estoquista", "Gerente" }));
        cargosBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargosBoxActionPerformed(evt);
            }
        });

        editarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarIDActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("ID*");

        jLabel7.setText("*Preencher apenas para editar ou deletar funcionário já existente.");

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel8.setText("Gestão de Funcionários");

        btnCadastrar.setBackground(new java.awt.Color(204, 255, 204));
        btnCadastrar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnCadastrar.setText("Cadastrar/Editar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Cargo", "Login"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
        }

        btnDeletar.setBackground(new java.awt.Color(255, 204, 204));
        btnDeletar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(editarID, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cadastroNome)
                                .addGap(30, 30, 30))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cargosBox, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cadastroLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(143, 143, 143))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                        .addComponent(btnDeletar)
                                        .addGap(26, 26, 26)))
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cargosBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar)
                    .addComponent(btnCadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cargosBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargosBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargosBoxActionPerformed

    private void editarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarIDActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String nome = cadastroNome.getText();
        String login = cadastroLogin.getText();
        String senha = new String(cadastroSenha.getPassword());
        String cargo = cargosBox.getSelectedItem().toString();
        String senhaHash = BCrypt.hashpw(senha, BCrypt.gensalt());
        
        if(editarID.getText().isEmpty()){
            if(nome.isEmpty() || login.isEmpty() || senha.isEmpty() || cargo.isEmpty()){
                JOptionPane.showMessageDialog(null, "Preencha todos os campos.", "FALHA NO CADASTRO", JOptionPane.WARNING_MESSAGE);
            } else{
                try {
            Connection conn = ConexaoBD.conectar();
            String sql = "INSERT INTO Funcionarios (Nome_Funcionarios, Cargo, Login, Senha) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, cargo);
            stmt.setString(3, login);
            stmt.setString(4, senhaHash);
            

            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
              
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar funcionário.");
            }

            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        }
            }
            
        } else{
            try {
            int id = Integer.parseInt(editarID.getText());
            Connection conn = ConexaoBD.conectar();
            
            String verificar = "SELECT Id_Funcionarios FROM funcionarios WHERE Id_Funcionarios = ?";
            PreparedStatement stmtVerifica = conn.prepareStatement(verificar);
            stmtVerifica.setInt(1, id);
            ResultSet rs = stmtVerifica.executeQuery();
            
            if(rs.next()){
                if(!nome.isEmpty()){
                String sql = "UPDATE Funcionarios SET Nome_Funcionarios = ? WHERE Id_Funcionarios = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                
                stmt.setString(1, nome);
                stmt.setInt(2, id);
                stmt.executeUpdate();
            }
            
             if(!cargo.isEmpty()){
                 String sql = "UPDATE Funcionarios SET Cargo = ? WHERE Id_Funcionarios = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, cargo);
                stmt.setInt(2, id);
                stmt.executeUpdate();
            }
             if(!login.isEmpty()){
                String sql = "UPDATE Funcionarios SET Login = ? WHERE Id_Funcionarios = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, login);
                stmt.setInt(2, id);
                stmt.executeUpdate();
            }
             if(!senha.isEmpty()){
                String sql = "UPDATE Funcionarios SET Senha = ? WHERE Id_Funcionarios = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, senhaHash);
               
                stmt.setInt(2, id);
                stmt.executeUpdate();
            }
              JOptionPane.showMessageDialog(null, "Funcionário atualizado com sucesso!");
            } else{
                JOptionPane.showMessageDialog(null, "Nenhum funcionário encontrado com esse ID.", "FALHA NA EDIÇÃO", JOptionPane.WARNING_MESSAGE);
            }
            
            
             
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        }
        }
        
        
        carregarFuncionariosNaTabela();
   
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
       int id = Integer.parseInt(editarID.getText());

            try {
            Connection conn = ConexaoBD.conectar(); 
            String sql = "DELETE FROM funcionarios WHERE Id_Funcionarios = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            

            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!");
                
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum funcionário encontrado com esse ID.");
            }

            conn.close();
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "ID inválido. Deve ser um número inteiro.");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao excluir funcionário: " + ex.getMessage());
        }
            carregarFuncionariosNaTabela();
    }//GEN-LAST:event_btnDeletarActionPerformed
    
    public void carregarFuncionariosNaTabela() {
    String sql = "SELECT Id_Funcionarios, Nome_Funcionarios, Cargo, Login FROM Funcionarios";

    try (Connection conn = ConexaoBD.conectar();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); 

        while (rs.next()) {
            int id = rs.getInt("Id_Funcionarios");
            String nome = rs.getString("Nome_Funcionarios");
            String cargo = rs.getString("Cargo");
            String login = rs.getString("Login");

            modelo.addRow(new Object[]{id, nome, cargo, login});
        }

    } catch (SQLException e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, "Erro ao carregar funcionários: " + e.getMessage());
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JTextField cadastroLogin;
    private javax.swing.JTextField cadastroNome;
    private javax.swing.JPasswordField cadastroSenha;
    private javax.swing.JComboBox<String> cargosBox;
    private javax.swing.JTextField editarID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
