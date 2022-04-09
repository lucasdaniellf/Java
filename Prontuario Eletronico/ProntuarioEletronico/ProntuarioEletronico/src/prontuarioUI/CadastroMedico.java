
package prontuarioUI;

import Excecoes.MedicoException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Medico;
import prontuarioConfig.AppConfig;
import prontuarioConfig.Criptografia;

/**
 *
 * @author lucas
 */
public class CadastroMedico extends javax.swing.JFrame {

    private final AppConfig appConfig;
    public CadastroMedico() {
        initComponents();
        appConfig  = AppConfig.getAppConfig();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCRM = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblDataNascimento = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtCRM = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JFormattedTextField();
        pswSenha = new javax.swing.JPasswordField();
        btnInserir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMedico = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCRM.setText("CRM");

        lblCelular.setText("Celular");

        lblCPF.setText("CPF");

        lblDataNascimento.setText("Data Nascimento");

        lblNome.setText("Nome");

        lblEmail.setText("Email");

        lblSenha.setText("Senha");

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        tbMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CRM", "Nome", "CPF", "Email", "Celular", "Data de Nascimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbMedico);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInserir)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCRM)
                                    .addComponent(txtCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCelular))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCPF))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDataNascimento)
                                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSenha)
                                    .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCRM)
                    .addComponent(lblCelular)
                    .addComponent(lblCPF)
                    .addComponent(lblDataNascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblEmail)
                    .addComponent(lblSenha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnInserir)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addGap(11, 11, 11))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        preencherTabela();
    }//GEN-LAST:event_formWindowOpened

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        Medico medico = new Medico();
        try {
            medico.setCrm(Integer.parseInt(txtCRM.getText()));    
            medico.setCpf(txtCPF.getText().trim());
            medico.setNome(txtNome.getText().trim());
            
            if(medico.getNome().equals("") || medico.getNome() == null) {
                throw new MedicoException(3);
            }
            
            if(medico.getCpf().trim().length() != 14) {
                throw new MedicoException(4);
            }
            
            medico.setEmail(txtEmail.getText());
            medico.setNumCelular(txtCelular.getText());
            
            medico.setSenha((String.valueOf(pswSenha.getPassword())).trim());
            
            if(medico.getSenha().equals("") || medico.getSenha() == null) {
                throw new MedicoException(1);
            }

            medico.setSenha(Criptografia.CriptografiaMD5(medico.getSenha()));
            Date date = appConfig.getSdf().parse(txtDataNascimento.getText());
            medico.setDataNascimento(date);
            
            boolean flag =  appConfig.getMedicoNG().cadastrarMedico(appConfig.getConexaoDB(), appConfig.getMedicoAD(), medico);
            if (flag) {
                JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso", "Sucesso", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao realizar o cadastro, tente novamente", "Erro", 2);
            }
            preencherTabela();
            limparCampos();
        } 
        catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null, "Formato de CRM Inválido", "Erro ", 2);
        }
        catch (MedicoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMensagemErro(), "Erro "+ ex.getCodigoErro(), 2);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro no formato da Data de Nascimento", "Erro", 2);
        } 
        catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar a senha, tente novamente", "Erro ", 2);
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed


    private void preencherTabela() {
        try {
            ArrayList<Medico> listaMedicos = appConfig.getMedicoNG().buscarMedicos(appConfig.getConexaoDB(), appConfig.getMedicoAD());        
            DefaultTableModel model = (DefaultTableModel)tbMedico.getModel();
            model.setNumRows(0);
            
            listaMedicos.forEach(medico -> {
                model.addRow(new Object[] {
                    medico.getCrm(),
                    medico.getNome(),
                    medico.getCpf(),
                    medico.getEmail(),
                    medico.getNumCelular(),
                    appConfig.getDateFormat().format(medico.getDataNascimento())
                });
            });
            
        } catch (MedicoException ex){
            JOptionPane.showMessageDialog(null, ex.getMensagemErro(), "Erro "+ ex.getCodigoErro(), 2);
        }
    }
    
    private void limparCampos() {
        txtCRM.setText("");
        txtCPF.setText("");
        txtNome.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
        txtDataNascimento.setText("");     
        pswSenha.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCRM;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTable tbMedico;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCRM;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JFormattedTextField txtEmail;
    private javax.swing.JFormattedTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
