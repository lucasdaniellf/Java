/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prontuarioUI;

import Excecoes.PacienteException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Consulta;
import model.Medico;
import model.Paciente;
import prontuarioConfig.AppConfig;

/**
 *
 * @author lucas
 */
public class CadastroConsulta extends javax.swing.JFrame {

    private Consulta _consulta;
    private final Paciente paciente;
    private final Medico medico;
    private final AppConfig appConfig;
    
    public CadastroConsulta(Paciente paciente, Medico medico) {
        initComponents();
        this.paciente = paciente;
        this.medico = medico;
        this.appConfig = AppConfig.getAppConfig();
    }
    
    public CadastroConsulta(Paciente paciente, Medico medico, Consulta consulta) {
        initComponents();
        this.paciente = paciente;
        this.medico = medico;
        this.appConfig = AppConfig.getAppConfig();
        this._consulta = consulta;
    }
    

    private void preencherCampos(){
        txtIdPaciente.setText(String.valueOf(this.paciente.getIdPaciente()));
        txtNomePaciente.setText(this.paciente.getNome());
        
        if(_consulta != null){
            txtIdConsulta.setText(String.valueOf(_consulta.getIdConsulta()));
            txtDataConsulta.setText(appConfig.getDateFormat().format(_consulta.getDataConsulta()));
            txtDescricao.setText(_consulta.getDescricao());
        }
        
        ArrayList<Consulta> listaConsultas = appConfig.getConsultaNG()
                                                      .BuscarConsultasPorPaciente(appConfig.getConexaoDB(), 
                                                                                  appConfig.getConsultaAD(), 
                                                                                  paciente.getIdPaciente());
        DefaultTableModel model = (DefaultTableModel)tbConsultas.getModel();
        model.setNumRows(0);
        listaConsultas.forEach(c -> {
                model.addRow(new Object[] {
                c.getIdConsulta(),
                appConfig.getDateFormat().format(c.getDataConsulta()),
                c.getDescricao()
            });
        });

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdPaciente = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsultas = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtNomePaciente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIdConsulta = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtDataConsulta = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("ID Paciente:");

        jLabel2.setText("Data da Consulta:");

        jLabel3.setText("Descrição:");

        txtIdPaciente.setEditable(false);

        tbConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Consulta", "Data da Consulta", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbConsultasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbConsultas);
        if (tbConsultas.getColumnModel().getColumnCount() > 0) {
            tbConsultas.getColumnModel().getColumn(0).setResizable(false);
            tbConsultas.getColumnModel().getColumn(1).setResizable(false);
            tbConsultas.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel4.setText("Nome:");

        txtNomePaciente.setEditable(false);

        jLabel5.setText("Nº Consulta:");

        txtIdConsulta.setEditable(false);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnLimparCampos.setText("Limpar Campos");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        try {
            txtDataConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimparCampos)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirmar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescricao)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNomePaciente))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(355, 355, 355)
                                        .addComponent(txtIdConsulta))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnLimparCampos)
                    .addComponent(btnVoltar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbConsultasMouseClicked
        int row = tbConsultas.getSelectedRow();
        int idConsulta = (int) tbConsultas.getValueAt(row, 0);
        
        _consulta = appConfig.getConsultaNG()
                                     .BuscarConsulta(appConfig.getConexaoDB(), 
                                                     appConfig.getConsultaAD(), 
                                                     idConsulta);                              
        preencherCampos();
    }//GEN-LAST:event_tbConsultasMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        MedicoPrincipal medicoPrincipal = new MedicoPrincipal(medico);   
        medicoPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            if("".equals(txtIdConsulta.getText())){
                Consulta consulta = new Consulta();
                consulta.setCrmMedico(medico.getCrm());
                consulta.setIdPaciente(paciente.getIdPaciente());
                consulta.setDescricao(txtDescricao.getText());
                consulta.setDataConsulta(appConfig.getSdf().parse(txtDataConsulta.getText()));

                boolean flag = appConfig.getConsultaNG().inserirConsulta(appConfig.getConexaoDB(), appConfig.getConsultaAD(), consulta);
                 if (flag) {
                    JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso", "Sucesso", 1);
                    limparCampos();
                    preencherTabela();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao realizar o cadastro, tente novamente", "Erro", 2);
                }                
            } else {
                Consulta consulta = new Consulta();
                consulta.setCrmMedico(medico.getCrm());
                consulta.setIdConsulta(Integer.parseInt(txtIdConsulta.getText()));
                consulta.setIdPaciente(paciente.getIdPaciente());
                consulta.setDescricao(txtDescricao.getText());
                consulta.setDataConsulta(appConfig.getSdf().parse(txtDataConsulta.getText()));

                boolean flag = appConfig.getConsultaNG().atualizarConsulta(appConfig.getConexaoDB(), appConfig.getConsultaAD(), consulta);
                if (flag) {
                    JOptionPane.showMessageDialog(null, "Cadastro Atualizado com Sucesso", "Sucesso", 1);
                    preencherTabela();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao realizar a atualiação, tente novamente", "Erro", 2);
                } 
            }
            
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro no formato da Data da Consulta", "Erro", 2);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        preencherCampos();
        preencherTabela();
    }//GEN-LAST:event_formWindowOpened

    private void preencherTabela(){
        ArrayList<Consulta> listaConsultas = appConfig.getConsultaNG().BuscarConsultasPorMedico(
                                                        appConfig.getConexaoDB(), appConfig.getConsultaAD(), this.medico.getCrm());
        
        DefaultTableModel model = (DefaultTableModel)tbConsultas.getModel();
        model.setNumRows(0);
        listaConsultas.forEach(c ->            

        model.addRow(new Object[] {
            c.getIdConsulta(),
            appConfig.getDateFormat().format(c.getDataConsulta()),
            c.getDescricao()
        }));
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbConsultas;
    private javax.swing.JFormattedTextField txtDataConsulta;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtIdConsulta;
    private javax.swing.JTextField txtIdPaciente;
    private javax.swing.JTextField txtNomePaciente;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        txtIdConsulta.setText("");
        txtDataConsulta.setText("");
        txtDescricao.setText("");
    }
}
