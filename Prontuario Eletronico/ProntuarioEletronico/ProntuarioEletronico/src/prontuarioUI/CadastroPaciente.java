package prontuarioUI;

import Excecoes.PacienteException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Medico;
import model.Paciente;
import prontuarioConfig.AppConfig;

public class CadastroPaciente extends javax.swing.JFrame {

    private final AppConfig appConfig;
    private final Medico medico;
    private Paciente paciente;
    
    public CadastroPaciente(Medico medico) {
        initComponents();
        this.medico = medico;
        appConfig = AppConfig.getAppConfig();
    }
    
    public CadastroPaciente(Medico medico, Paciente paciente) {
        initComponents();
        this.medico = medico;
        this.paciente = paciente;
        appConfig = AppConfig.getAppConfig();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rblGroupSexo = new javax.swing.ButtonGroup();
        lblNome = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        lblDataNascimento = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        rblMasculino = new javax.swing.JRadioButton();
        rblFeminino = new javax.swing.JRadioButton();
        txtNome = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JFormattedTextField();
        txtEndereco = new javax.swing.JFormattedTextField();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPaciente = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnBuscarPaciente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblNome.setText("Nome:");

        lblTelefone.setText("Telefone");

        lblCelular.setText("Celular");

        lblDataNascimento.setText("Data de Nascimento");

        lblEndereco.setText("Endereço");

        lblEmail.setText("Email");

        lblSexo.setText("Sexo");

        rblGroupSexo.add(rblMasculino);
        rblMasculino.setSelected(true);
        rblMasculino.setText("Masculino");

        rblGroupSexo.add(rblFeminino);
        rblFeminino.setText("Feminino");

        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tbPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sexo", "Endereço", "Telefone", "Celular", "Email", "Data de Nascimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPaciente);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnAdicionar.setText("Adicionar Paciente");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar Paciente");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir Paciente");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblID.setLabelFor(txtID);
        lblID.setText("ID:");
        lblID.setEnabled(false);
        lblID.setFocusable(false);

        txtID.setEnabled(false);

        btnLimpar.setText("Limpar Campos");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnBuscarPaciente.setText("Buscar Paciente");
        btnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rblMasculino)
                        .addGap(18, 18, 18)
                        .addComponent(rblFeminino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdicionar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSexo)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEndereco)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtID))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNome)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDataNascimento)
                                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefone)
                            .addComponent(lblCelular)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnBuscarPaciente)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(txtCelular))))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblDataNascimento)
                    .addComponent(lblCelular))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSexo)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rblMasculino)
                    .addComponent(rblFeminino)
                    .addComponent(btnAtualizar)
                    .addComponent(btnAdicionar)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnVoltar))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(this.paciente != null){
            preencherCampos(this.paciente);
        }
        preencherTabela();
    }//GEN-LAST:event_formWindowOpened

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        try {
            paciente = obterPacienteTela();
            
            if(paciente.getNome().equals("") || paciente.getNome() == null) 
            {
                throw new PacienteException(3);
            }
            
            boolean flag =  appConfig.getPacienteNG().cadastrarPaciente(appConfig.getConexaoDB(), appConfig.getPacienteAD(), paciente);
            if (flag) {
                JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso", "Sucesso", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao realizar o cadastro, tente novamente", "Erro", 2);
            }
            preencherTabela();
            limparCampos();
        }
        catch (PacienteException ex) {
            JOptionPane.showMessageDialog(null, ex.getMensagemErro(), "Erro "+ ex.getCodigoErro(), 2);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro no formato da Data de Nascimento", "Erro", 2);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ID inválido", "Erro de ID", 2);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void tbPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPacienteMouseClicked
        paciente = new Paciente();
        int row = tbPaciente.getSelectedRow();  
        System.out.println(row);
        
        try {
            paciente.setIdPaciente((int)tbPaciente.getValueAt(row, 0));
            paciente.setNome((String)tbPaciente.getValueAt(row, 1));
            paciente.setSexo((char)tbPaciente.getValueAt(row, 2));
            paciente.setEndereco((String)tbPaciente.getValueAt(row, 3));
            paciente.setTelefone((String)tbPaciente.getValueAt(row, 4));
            paciente.setNumCelular((String)tbPaciente.getValueAt(row, 5));
            
            String dataNascimento = (String) tbPaciente.getValueAt(row, 6);
            paciente.setDataNascimento(appConfig.getSdf().parse(dataNascimento));

            paciente.setEmail((String)tbPaciente.getValueAt(row, 7));
        }
        catch (ParseException ex) 
        {
            JOptionPane.showMessageDialog(null, "Erro no formato da Data de Nascimento", "Erro", 2);   
        }
        preencherCampos(paciente);
    }//GEN-LAST:event_tbPacienteMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        
        if(!"".equals(txtID.getText())) {
            String texto = "Deseja mesmo atualizar os dados do paciente de ID "+ txtID.getText() +"?";
            int op = JOptionPane.showConfirmDialog(null, texto, "Atualizar Conta", JOptionPane.YES_NO_OPTION);

            if(op == 0) {
                try {
                    paciente = obterPacienteTela();

                    if(paciente.getNome().equals("") || paciente.getNome() == null) 
                    {
                        throw new PacienteException(3);
                    }
                    boolean flag =  appConfig.getPacienteNG().atualizarPaciente(appConfig.getConexaoDB(), appConfig.getPacienteAD(), paciente);
                    if (flag) {
                        JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso", "Sucesso", 1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao realizar a atualização dos dados, tente novamente", "Erro", 2);
                    }
                    preencherTabela();

                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Erro no formato da Data de Nascimento", "Erro", 2);
                } catch (PacienteException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMensagemErro(), "Erro "+ ex.getCodigoErro(), 2);
                }   catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "ID inválido", "Erro de ID", 2);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "ID inválido", "Erro de ID", 2);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Deseja mesmo deletar esse cadastro?", "Deletar Cadastro", JOptionPane.YES_NO_OPTION);
        if(op == 0) {
            try 
            {
                int id = Integer.parseInt(txtID.getText());

                boolean flag =  appConfig.getPacienteNG().deletePaciente(appConfig.getConexaoDB(), appConfig.getPacienteAD(), id);

                if (flag) {
                    JOptionPane.showMessageDialog(null, "Registro deletado com Sucesso", "Sucesso", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao realizar o procedimento, tente novamente", "Erro", 2);
                }
                preencherTabela();
                limparCampos();               
                
            } catch (PacienteException ex) 
            {
                JOptionPane.showMessageDialog(null, ex.getMensagemErro(), "Erro "+ ex.getCodigoErro(), 2);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "ID inválido", "Erro de ID", 2);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed
        BuscarPaciente buscarPaciente = new BuscarPaciente(medico, true);   
        buscarPaciente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBuscarPacienteActionPerformed

    private void preencherTabela() {
        try {
            ArrayList<Paciente> listaPacientes = appConfig.getPacienteNG().buscarTodosPacientes(appConfig.getConexaoDB(), appConfig.getPacienteAD());        
            DefaultTableModel model = (DefaultTableModel)tbPaciente.getModel();
            model.setNumRows(0);
            listaPacientes.forEach(p -> {
                    model.addRow(new Object[] {
                    p.getIdPaciente(),
                    p.getNome(),
                    p.getSexo(),
                    p.getEndereco(),
                    p.getTelefone(),
                    p.getNumCelular(),
                    appConfig.getDateFormat().format(p.getDataNascimento()),
                    p.getEmail()
                });
            });

        } catch (PacienteException ex){
            JOptionPane.showMessageDialog(null, ex.getMensagemErro(), "Erro "+ ex.getCodigoErro(), 2);
        }
    }
        
    private void preencherCampos(Paciente p) {        
        txtNome.setText(p.getNome());
        txtID.setText(String.valueOf(p.getIdPaciente()));
        rblMasculino.setSelected(p.getSexo() == 'm');
        rblFeminino.setSelected(!rblMasculino.isSelected());

        txtEndereco.setText(p.getEndereco());
        txtTelefone.setText(p.getTelefone());
        txtCelular.setText(p.getNumCelular());
        txtEmail.setText(p.getEmail());
        txtDataNascimento.setText(appConfig.getDateFormat().format(p.getDataNascimento()));
    }
    
    private void limparCampos() {        
        txtNome.setText("");
        txtID.setText("");
        rblMasculino.setSelected(true);
        
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
        txtDataNascimento.setText("");
    }
    
    private Paciente obterPacienteTela() throws ParseException, PacienteException, NumberFormatException {
        
        Paciente p = new Paciente();        
        if(!"".equals(txtID.getText())) {
            p.setIdPaciente(Integer.parseInt(txtID.getText()));        
        }
        
        char sexo = rblMasculino.isSelected()? 'm' : 'f';

        p.setNome(txtNome.getText().trim());
        
        p.setSexo(sexo);
        p.setEndereco(txtEndereco.getText());
        p.setTelefone(txtTelefone.getText());
        p.setNumCelular(txtCelular.getText());
        Date date = appConfig.getSdf().parse(txtDataNascimento.getText());
        p.setDataNascimento(date);
        p.setEmail(txtEmail.getText());
        
        return p;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnBuscarPaciente;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JRadioButton rblFeminino;
    private javax.swing.ButtonGroup rblGroupSexo;
    private javax.swing.JRadioButton rblMasculino;
    private javax.swing.JTable tbPaciente;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JFormattedTextField txtEmail;
    private javax.swing.JFormattedTextField txtEndereco;
    private javax.swing.JTextField txtID;
    private javax.swing.JFormattedTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
