/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.unidf.UI;

import br.unidf.DAL.ClienteDAL;
import br.unidf.DTO.ClienteDTO;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suporte
 */
public class frmClientes extends javax.swing.JFrame {

    /**
     * Creates new form frmCursos
     */
    public frmClientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoIDCli = new javax.swing.JTextField();
        btnPesquisarCliID = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNomeCli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEnderecoCli = new javax.swing.JTextField();
        btnIncluirCli = new javax.swing.JButton();
        btnAlterarCli = new javax.swing.JButton();
        btnExcluirCli = new javax.swing.JButton();
        btnMostrarTodosCli = new javax.swing.JButton();
        btnSairCli = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dgvClientes = new javax.swing.JTable();
        btnLimparCli = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cursos");
        setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setText("Cadastro de Cursos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel2.setText("Código(ID)");

        btnPesquisarCliID.setMnemonic('p');
        btnPesquisarCliID.setText("Pesquisar");
        btnPesquisarCliID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCliIDActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome do Curso");

        jLabel4.setText("Endereço");

        btnIncluirCli.setMnemonic('A');
        btnIncluirCli.setText("Incluir");
        btnIncluirCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirCliActionPerformed(evt);
            }
        });

        btnAlterarCli.setMnemonic('E');
        btnAlterarCli.setText("Alterar");
        btnAlterarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarCliActionPerformed(evt);
            }
        });

        btnExcluirCli.setMnemonic('E');
        btnExcluirCli.setText("Excluir");
        btnExcluirCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCliActionPerformed(evt);
            }
        });

        btnMostrarTodosCli.setMnemonic('M');
        btnMostrarTodosCli.setText("Mostrar Todos");
        btnMostrarTodosCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosCliActionPerformed(evt);
            }
        });

        btnSairCli.setMnemonic('S');
        btnSairCli.setText("Sair");
        btnSairCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairCliActionPerformed(evt);
            }
        });

        dgvClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código(ID)", "Curso", "Endereço"
            }
        ));
        dgvClientes.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                dgvClientesAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        dgvClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgvClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(dgvClientes);

        btnLimparCli.setText("Limpar");
        btnLimparCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigoIDCli, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisarCliID))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIncluirCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterarCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrarTodosCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimparCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSairCli)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(txtNomeCli)
            .addComponent(txtEnderecoCli, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoIDCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarCliID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnderecoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluirCli)
                    .addComponent(btnAlterarCli)
                    .addComponent(btnExcluirCli)
                    .addComponent(btnMostrarTodosCli)
                    .addComponent(btnSairCli)
                    .addComponent(btnLimparCli))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirCliActionPerformed
       //Abrindo a conexão com o Banco de Dados
        ClienteDAL dal = new ClienteDAL();
        try
        {
            dal.abrirBD();
        }
        catch (Exception ex)
        {
           
        }
        // instanciando a classe ClienteDTO do pacote DTO e criando seu objeto cliente
        ClienteDTO cliente = new ClienteDTO();
        cliente.setCliNome(txtNomeCli.getText());
        cliente.setCliEndereco(txtEnderecoCli.getText());
        // fazendo a validação dos dados
        if ((txtNomeCli.getText().isEmpty()) || (txtEnderecoCli.getText().isEmpty()))
        {
            JOptionPane.showMessageDialog(null, "Os campos não podem estar vazios !!!!");
            txtNomeCli.requestFocus();
        }
        else
        {
            try {
                // Instancia a classe ClienteDAL e chama o método incluirCliente
                dal.incluirCliente(cliente);
                JOptionPane.showMessageDialog(null, "Usuário " + txtNomeCli.getText() + " incluído com sucesso! ");
                dal.fecharBD();
                txtNomeCli.requestFocus();
                btnMostrarTodosCli.setEnabled(true);
            } catch (Exception ex)
            {
               
            }
        }
        txtCodigoIDCli.setText("");
        txtEnderecoCli.setText("");
        txtNomeCli.setText("");


    }//GEN-LAST:event_btnIncluirCliActionPerformed

    private void btnSairCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairCliActionPerformed
                // Fecha o formulário de clientes e volta para o formulário principal
        dispose();

    }//GEN-LAST:event_btnSairCliActionPerformed

    private void btnAlterarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCliActionPerformed
     // fazendo a validação dos dados, o método isEmpty que devolve true se a String for vazia ou false se a mesma nã estiver vazia
        if ((txtNomeCli.getText().isEmpty()) || (txtEnderecoCli.getText().isEmpty()))
        {
            JOptionPane.showMessageDialog(null, "Verifique Se Tem Algum Campo Vazio !!!!");
            //O cursor do mouse vai se posicionado no campo Código do Cliente
            txtCodigoIDCli.requestFocus();
        }
        else 
        {
            // instanciando a classe ClientesDTO do pacote DTO e criando seu objeto cliente
            ClienteDTO cliente = new ClienteDTO();
            // Instancia a classe ClienteDAL 
            ClienteDAL dal = new ClienteDAL();
            cliente.setCliID(Long.parseLong(txtCodigoIDCli.getText()));
            cliente.setCliNome(txtNomeCli.getText());
            cliente.setCliEndereco(txtEnderecoCli.getText());
            try
            {
                // Chama o método alterarCliente da Classe ClienteDAL
                dal.alterarCliente(cliente);
            }
            catch (Exception ex)
            {
                
            }
            JOptionPane.showMessageDialog(null, "Cliente " + cliente.getCliNome() + " Alterado Com Sucesso !!!!");
        }

    }//GEN-LAST:event_btnAlterarCliActionPerformed

    private void btnExcluirCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCliActionPerformed
        //Verifica se os campos estão preenchidos    
        if (((txtEnderecoCli.getText().isEmpty()) || (txtNomeCli.getText().isEmpty()) || (txtCodigoIDCli.getText().isEmpty()))) {
            JOptionPane.showMessageDialog(null, "Verifique Se Tem Algum Campo Vazio !!!!");
            txtCodigoIDCli.requestFocus();
        }
        else
        {
            // instanciando a classe clientesDTO do pacote DTO e criando seu objeto cliente        
            ClienteDTO cliente = new ClienteDTO();
            cliente.setCliID(Long.parseLong(txtCodigoIDCli.getText()));
            Object[] opcoes = {"Sim", "Não"};
            int contador = JOptionPane.showOptionDialog(null, "Deseja Excluir Este Cliente: " + txtNomeCli.getText() + "?",
                    "Exclusão", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            if (contador == JOptionPane.YES_OPTION) {
                try
                {
                    ClienteDAL dal = new ClienteDAL();
                    dal.excluirCliente(Integer.valueOf(txtCodigoIDCli.getText()));
                    JOptionPane.showMessageDialog(null, "Cliente Excluído com Sucesso !!!!");
                    // apaga os dados preenchidos nos campos de texto abaixo
                    txtCodigoIDCli.setText(null);
                    txtNomeCli.setText("");
                    txtEnderecoCli.setText("");
                    txtCodigoIDCli.requestFocus();
                }
                catch (Exception ex)
                {
                   
                }
            }
        }


    }//GEN-LAST:event_btnExcluirCliActionPerformed

    private void btnMostrarTodosCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosCliActionPerformed
         //Limpa todas as caixas de texto
        txtCodigoIDCli.setText("");
        txtEnderecoCli.setText("");
        txtNomeCli.setText("");
        // instanciando a classe clientesDAL
        ClienteDAL cliente = new ClienteDAL();
        //Cria a lista de todos os clientes dentro da tabela Clientes
        List<ClienteDTO> selecionaTodosClientes = new ArrayList<>();
        try
        {
            //Chama o método selecionaTodosClientes da Classe ClientesDAL e preeche
            //o mesmo com a lista de todos os clientes.
            selecionaTodosClientes = cliente.selecionarListaClientes();
        }
        catch (Exception ex)
        {
            
        }
        //Prepara a tabela para receber os dados da busca(Lista)
        DefaultTableModel tabm = (DefaultTableModel)dgvClientes.getModel();
        for(int contador = tabm.getRowCount()-1; contador >=0; contador--)
        {
            tabm.removeRow(contador);
        }
        int contador = 0;
        for(ClienteDTO clientes : selecionaTodosClientes)
        {
            //Mostra as informações dentro da Tabela
            tabm.addRow(new String[1]);
            dgvClientes.setValueAt(clientes.getCliID(), contador, 0);
            dgvClientes.setValueAt(clientes.getCliNome(),contador, 1);
            //Formata a data do banco, para localdate
            dgvClientes.setValueAt(clientes.getCliEndereco(), contador, 2);        
            contador++;
        }
        //Limpa o campo Código do Cliente
        txtCodigoIDCli.setText(null);
        //Posiciona o cursor do mouse no campo Nome do cliente
        txtNomeCli.requestFocus(); 

    }//GEN-LAST:event_btnMostrarTodosCliActionPerformed

    private void btnPesquisarCliIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCliIDActionPerformed
       //Verifica se o código do cliente está vazio
        if ("".equals(txtCodigoIDCli.getText()))
        {
            JOptionPane.showMessageDialog(null, "Código do Cliente não pode ser vazio, favor digite um código válido !!!!");
            //Após a mensagem de erro, o foco do cursor vai ficar no campo Código do Cliente
            txtCodigoIDCli.requestFocus();
        }
        else
        {
            //Faz o tratamento de erro, para verificar se a tabela Clientes está vazia
            try
            {
                // instanciando a classe ClienteDTO do pacote DTO e criando seu objeto cliente
                ClienteDTO cliente = new ClienteDTO();
                // Instancia a classe ClientesDAL
                ClienteDAL dal = new ClienteDAL();
                //Formatando a data para ser exibida no formato Brasileiro
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                cliente = dal.selecionarClientePorID(Integer.valueOf(txtCodigoIDCli.getText()));
                //O botão Incluir vai ficar dsesabilitado
                btnIncluirCli.setEnabled(false);
                //O botão Alterar vai ficar habilitado
                btnAlterarCli.setEnabled(true);
                //O botão Excluir vai ficar habilitado
                btnExcluirCli.setEnabled(true);
                //O botão Mostrar Todos vai ficar habilitado
                btnMostrarTodosCli.setEnabled(true);
                //Mostra os dados do Cliente pelo seu código
                txtNomeCli.setText(cliente.getCliNome());
                //Formatando a data do banco, para localdate
                txtEnderecoCli.setText(cliente.getCliEndereco());

            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Cliente Não Encontrado. Favor Tente Novamente !!!!");
                txtCodigoIDCli.setText(null);
                txtCodigoIDCli.requestFocus();
            }
        }

    }//GEN-LAST:event_btnPesquisarCliIDActionPerformed

    private void dgvClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgvClientesMouseClicked
        // Preenche o Grid com os dados gravados na tabela clientes do MySQL
        //Formatando a data do banco, para localdate  
        int linhaSelecionada = dgvClientes.getSelectedRow();
        txtCodigoIDCli.setText(dgvClientes.getValueAt(linhaSelecionada, 0).toString());
        txtNomeCli.setText(dgvClientes.getValueAt(linhaSelecionada, 1).toString());
        txtEnderecoCli.setText(dgvClientes.getValueAt(linhaSelecionada, 2).toString());
        btnIncluirCli.setEnabled(false);
        btnAlterarCli.setEnabled(true);
        btnExcluirCli.setEnabled(true);

    }//GEN-LAST:event_dgvClientesMouseClicked

    private void btnLimparCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCliActionPerformed
        //Limpa os campos do formulário e do grid ou tabela 
        btnIncluirCli.setEnabled(true);
        btnAlterarCli.setEnabled(false);
        btnExcluirCli.setEnabled(false);
        btnMostrarTodosCli.setEnabled(true);
        txtCodigoIDCli.setText("");
        txtEnderecoCli.setText("");
        txtNomeCli.setText("");
        txtNomeCli.requestFocus();
        DefaultTableModel tabm = (DefaultTableModel)dgvClientes.getModel();
        for (int contador = tabm.getRowCount() -1; contador >= 0; contador--)
        {
            tabm.removeRow(contador);
        }

    }//GEN-LAST:event_btnLimparCliActionPerformed

    private void dgvClientesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_dgvClientesAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_dgvClientesAncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCli;
    private javax.swing.JButton btnExcluirCli;
    private javax.swing.JButton btnIncluirCli;
    private javax.swing.JButton btnLimparCli;
    private javax.swing.JButton btnMostrarTodosCli;
    private javax.swing.JButton btnPesquisarCliID;
    private javax.swing.JButton btnSairCli;
    private javax.swing.JTable dgvClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCodigoIDCli;
    private javax.swing.JTextField txtEnderecoCli;
    private javax.swing.JTextField txtNomeCli;
    // End of variables declaration//GEN-END:variables

}