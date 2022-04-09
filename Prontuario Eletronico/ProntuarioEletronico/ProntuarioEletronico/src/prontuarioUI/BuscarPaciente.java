package prontuarioUI;

import Excecoes.PacienteException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Medico;
import model.Paciente;
import prontuarioConfig.AppConfig;

public class BuscarPaciente extends javax.swing.JFrame {

    private final AppConfig appConfig;
    public final Medico medico;
    private final boolean isFromCadastroPaciente;
    
    public BuscarPaciente(Medico medico, boolean isFromCadastroPaciente) {
        this.isFromCadastroPaciente = isFromCadastroPaciente;
        this.medico = medico;
        appConfig  = AppConfig.getAppConfig();
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNomePaciente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdPaciente = new javax.swing.JTextField();
        btnBuscarPorNome = new javax.swing.JButton();
        btnBuscarPorID = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPacientes = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("ID Paciente:");

        btnBuscarPorNome.setText("Buscar por Nome");
        btnBuscarPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorNomeActionPerformed(evt);
            }
        });

        btnBuscarPorID.setText("Buscar por ID");
        btnBuscarPorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorIDActionPerformed(evt);
            }
        });

        tbPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sexo", "Data Nascimento"
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
        jScrollPane1.setViewportView(tbPacientes);
        if (tbPacientes.getColumnModel().getColumnCount() > 0) {
            tbPacientes.getColumnModel().getColumn(0).setResizable(false);
            tbPacientes.getColumnModel().getColumn(1).setResizable(false);
            tbPacientes.getColumnModel().getColumn(2).setResizable(false);
            tbPacientes.getColumnModel().getColumn(3).setResizable(false);
        }

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirmar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomePaciente)
                            .addComponent(txtIdPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarPorNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarPorID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPorNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPorID))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(btnConfirmar))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnBuscarPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorNomeActionPerformed
        try {
            ArrayList<Paciente> listaPacientes = appConfig.getPacienteNG().buscarPacientesPorNome(appConfig.getConexaoDB(), appConfig.getPacienteAD(), txtNomePaciente.getText().trim());
            if(listaPacientes.size() > 0){
                preencherTabela(listaPacientes);
            } else{
                JOptionPane.showMessageDialog(null, "Não Encontrado", "Nenhum paciente localizado", 2);
            }
        } catch (PacienteException ex) {
            JOptionPane.showMessageDialog(null, ex.getMensagemErro(), "Erro "+ ex.getCodigoErro(), 2);
        }
    }//GEN-LAST:event_btnBuscarPorNomeActionPerformed

    private void btnBuscarPorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorIDActionPerformed
        try {
            Paciente paciente = appConfig.getPacienteNG().buscarPacientePorID(appConfig.getConexaoDB(), appConfig.getPacienteAD(), Integer.parseInt(txtIdPaciente.getText()));
            if(paciente.getIdPaciente() > 0){
            preencherTabela(new ArrayList<Paciente>(){{
                add(paciente);
            }});               
            } else {
                JOptionPane.showMessageDialog(null, "Não Encontrado", "Paciente não Localizado ", 2);
            }    
        } catch (PacienteException ex) {
            JOptionPane.showMessageDialog(null, ex.getMensagemErro(), "Erro "+ ex.getCodigoErro(), 2);
        }

    }//GEN-LAST:event_btnBuscarPorIDActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if(isFromCadastroPaciente){
            CadastroPaciente cadastroPaciente = new CadastroPaciente(medico);
            cadastroPaciente.setVisible(true);
            dispose();
        } else {
            MedicoPrincipal medicoPrincipal = new MedicoPrincipal(medico);   
            medicoPrincipal.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        confirmar();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void confirmar() {
        int row = tbPacientes.getSelectedRow();
        if(row >= 0){
            try {

                Paciente paciente = appConfig.getPacienteNG().buscarPacientePorID(appConfig.getConexaoDB(), appConfig.getPacienteAD(), (int)tbPacientes.getValueAt(row, 0));
                if(isFromCadastroPaciente){
                    CadastroPaciente cadastroPaciente = new CadastroPaciente(medico);
                    cadastroPaciente.setVisible(true);
                    dispose();               
                }else {
                    CadastroConsulta cadastroConsulta = new CadastroConsulta(paciente, medico);   
                    cadastroConsulta.setVisible(true);
                    dispose();
                }

            } catch (PacienteException ex) {
                JOptionPane.showMessageDialog(null, ex.getMensagemErro(), "Erro "+ ex.getCodigoErro(), 2);
            }            
        }
    }
    
    private void preencherTabela(ArrayList<Paciente> listaPacientes) {
            DefaultTableModel model = (DefaultTableModel)tbPacientes.getModel();
            model.setNumRows(0);
            listaPacientes.forEach(paciente -> {
                    model.addRow(new Object[] {
                    paciente.getIdPaciente(),
                    paciente.getNome(),
                    paciente.getSexo(),
                    appConfig.getDateFormat().format(paciente.getDataNascimento())
                });
            });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPorID;
    private javax.swing.JButton btnBuscarPorNome;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPacientes;
    private javax.swing.JTextField txtIdPaciente;
    private javax.swing.JTextField txtNomePaciente;
    // End of variables declaration//GEN-END:variables
}
