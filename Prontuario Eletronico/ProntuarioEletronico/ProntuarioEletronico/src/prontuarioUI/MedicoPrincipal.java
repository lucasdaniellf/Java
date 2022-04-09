/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prontuarioUI;

import Excecoes.MedicoException;
import Excecoes.PacienteException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Consulta;
import model.Medico;
import model.Paciente;
import prontuarioConfig.AppConfig;
import prontuarioConfig.Criptografia;

/**
 *
 * @author lucas
 */
public class MedicoPrincipal extends javax.swing.JFrame {

    private final AppConfig appConfig;
    private Medico medico;

    public MedicoPrincipal(Medico medico) {
        initComponents();
        appConfig  = AppConfig.getAppConfig();
        this.medico = medico;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsultas = new javax.swing.JTable();
        btnAtualizarDados = new javax.swing.JButton();
        btnAddConsulta = new javax.swing.JButton();
        btnRemoveConsulta = new javax.swing.JButton();
        btnUpdateConsulta = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        menuLogin = new javax.swing.JMenuBar();
        itemCadastro = new javax.swing.JMenu();
        menuItemPaciente = new javax.swing.JMenuItem();
        menuItemSair = new javax.swing.JMenuItem();
        itemOpcoes = new javax.swing.JMenu();
        menuItemDeletarConta = new javax.swing.JMenuItem();
        menuItemSobre = new javax.swing.JMenu();
        itemMenuSobre = new javax.swing.JMenuItem();
        menuItemInformacoes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        tbConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº Consulta", " ID Paciente", "Nome", "Data da Consulta", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbConsultas);

        btnAtualizarDados.setText("Atualizar Dados");
        btnAtualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarDadosActionPerformed(evt);
            }
        });

        btnAddConsulta.setText("Adicionar Consulta");
        btnAddConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddConsultaActionPerformed(evt);
            }
        });

        btnRemoveConsulta.setText("Remover Consulta");
        btnRemoveConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveConsultaActionPerformed(evt);
            }
        });

        btnUpdateConsulta.setText("Alterar Consulta");
        btnUpdateConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateConsultaActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        itemCadastro.setText("Cadastro");

        menuItemPaciente.setText("Paciente");
        menuItemPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPacienteActionPerformed(evt);
            }
        });
        itemCadastro.add(menuItemPaciente);

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        itemCadastro.add(menuItemSair);

        menuLogin.add(itemCadastro);

        itemOpcoes.setText("Opções");

        menuItemDeletarConta.setText("Deletar Conta no Sistema");
        menuItemDeletarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDeletarContaActionPerformed(evt);
            }
        });
        itemOpcoes.add(menuItemDeletarConta);

        menuLogin.add(itemOpcoes);

        menuItemSobre.setText("Sobre");

        itemMenuSobre.setText("Sobre");
        itemMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuSobreActionPerformed(evt);
            }
        });
        menuItemSobre.add(itemMenuSobre);

        menuItemInformacoes.setText("Informações");
        menuItemInformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInformacoesActionPerformed(evt);
            }
        });
        menuItemSobre.add(menuItemInformacoes);

        menuLogin.add(menuItemSobre);

        setJMenuBar(menuLogin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddConsulta)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemoveConsulta)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateConsulta)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(lblDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAtualizarDados)))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtualizarDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
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
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblEmail)
                    .addComponent(lblSenha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddConsulta)
                    .addComponent(btnRemoveConsulta)
                    .addComponent(btnUpdateConsulta))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addGap(11, 11, 11))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        preencherCampos();
        preencherTabela();
    }//GEN-LAST:event_formWindowOpened

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void btnAtualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarDadosActionPerformed
        String texto = "Deseja mesmo atualizar os dados do médico "+ this.medico.getNome()+", de CRM "+ this.medico.getCrm() +"?";
        int op = JOptionPane.showConfirmDialog(null, texto, "Atualizar Conta", JOptionPane.YES_NO_OPTION);

        if(op == 0) {
            try {
                Medico medicoAtualizado = new Medico();

                medicoAtualizado.setCrm(Integer.parseInt(txtCRM.getText()));    
                medicoAtualizado.setCpf(txtCPF.getText().trim());
                medicoAtualizado.setNome(txtNome.getText().trim());

                if(medicoAtualizado.getNome().equals("") || medicoAtualizado.getNome() == null) {
                    throw new MedicoException(3);
                }

                if(medicoAtualizado.getCpf().trim().length() != 14) {
                    throw new MedicoException(4);
                }
                medicoAtualizado.setEmail(txtEmail.getText());
                medicoAtualizado.setNumCelular(txtCelular.getText());
                medicoAtualizado.setSenha(String.valueOf(pswSenha.getPassword()).trim());

                if(medicoAtualizado.getSenha().equals("") || medicoAtualizado.getSenha() == null) {
                    throw new MedicoException(1);
                }
                medicoAtualizado.setSenha(Criptografia.CriptografiaMD5(medicoAtualizado.getSenha()));
                
                Date date = appConfig.getSdf().parse(txtDataNascimento.getText());
                medicoAtualizado.setDataNascimento(date);

                boolean flag = appConfig.getMedicoNG().atualizarMedico(appConfig.getConexaoDB(), appConfig.getMedicoAD(), medicoAtualizado, this.medico.getCrm());
                if (flag) {
                    JOptionPane.showMessageDialog(null, "Cadastro Atualizado com Sucesso", "Sucesso", 1);
                    medico = medicoAtualizado;
                    preencherCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao realizar a atualização do cadastro, tente novamente", "Erro", 2);
                }
            } catch (MedicoException ex) {
                JOptionPane.showMessageDialog(null, ex.getMensagemErro(), "Erro "+ ex.getCodigoErro(), 2);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Erro no formato da Data de Nascimento", "Erro", 2);        
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Formato de CRM Inválido", "Erro ", 2);
            }
            catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar a senha, tente novamente", "Erro ", 2);
            }
        }
    }//GEN-LAST:event_btnAtualizarDadosActionPerformed

    private void menuItemDeletarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDeletarContaActionPerformed
        
        int op = JOptionPane.showConfirmDialog(null, "Deseja mesmo deletar esta conta?", "Deletar Conta", JOptionPane.YES_NO_OPTION);
        if(op == 0) {
            try {
                boolean flag = appConfig.getMedicoNG().deleteMedico(appConfig.getConexaoDB(), appConfig.getMedicoAD(), this.medico.getCrm());

                if (flag) 
                {
                    JOptionPane.showMessageDialog(null, "Conta Deletada com Sucesso", "Sucesso", 1);
                    dispose();
                    Login login = new Login();
                    login.setVisible(true);
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "Erro ao realizar a operação, tente novamente", "Erro", 2);
                }

            } catch (MedicoException ex) {
                JOptionPane.showMessageDialog(null, ex.getMensagemErro(), "Erro "+ ex.getCodigoErro(), 2);
            }  
        }
    }//GEN-LAST:event_menuItemDeletarContaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void menuItemPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPacienteActionPerformed
        CadastroPaciente cadastroPaciente = new CadastroPaciente(medico);
        cadastroPaciente.setVisible(true);
    }//GEN-LAST:event_menuItemPacienteActionPerformed

    private void itemMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuSobreActionPerformed
        Sobre sobre = new Sobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_itemMenuSobreActionPerformed

    private void menuItemInformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInformacoesActionPerformed
        Informacoes info = new Informacoes();
        info.setVisible(true);
    }//GEN-LAST:event_menuItemInformacoesActionPerformed

    private void btnAddConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddConsultaActionPerformed
        BuscarPaciente buscarPaciente = new BuscarPaciente(medico, false);   
        buscarPaciente.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAddConsultaActionPerformed

    private void btnRemoveConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveConsultaActionPerformed
        int row = tbConsultas.getSelectedRow();
        if(row >= 0){
            int op = JOptionPane.showConfirmDialog(null, "Deseja mesmo deletar esse cadastro?", "Deletar Cadastro", JOptionPane.YES_NO_OPTION);
            if(op == 0) {
                int idConsulta = (int) tbConsultas.getValueAt(row, 0);
                boolean flag = appConfig.getConsultaNG().deleteConsulta(appConfig.getConexaoDB(), 
                                                                        appConfig.getConsultaAD(), 
                                                                        idConsulta);
                if (flag) {
                    JOptionPane.showMessageDialog(null, "Registro deletado com Sucesso", "Sucesso", 1);
                    preencherTabela();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao realizar o procedimento, tente novamente", "Erro", 2);
                }
            }   
        }
    }//GEN-LAST:event_btnRemoveConsultaActionPerformed

    private void btnUpdateConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateConsultaActionPerformed

        int row = tbConsultas.getSelectedRow();
        if(row >= 0) {
            try {
                int idConsulta = (int) tbConsultas.getValueAt(row, 0);
                int idPaciente = (int) tbConsultas.getValueAt(row, 1);
                Paciente paciente = appConfig.getPacienteNG().buscarPacientePorID(appConfig.getConexaoDB(),
                        appConfig.getPacienteAD(),
                        idPaciente);

                Consulta consulta = appConfig.getConsultaNG()
                                             .BuscarConsulta(appConfig.getConexaoDB(), 
                                                             appConfig.getConsultaAD(), 
                                                             idConsulta);
                CadastroConsulta cadastroConsulta = new CadastroConsulta(paciente, medico, consulta);   
                cadastroConsulta.setVisible(true);
                dispose();

            } catch (PacienteException ex) {
                JOptionPane.showMessageDialog(null, ex.getMensagemErro(), "Erro "+ ex.getCodigoErro(), 2);
            }            
        }

    }//GEN-LAST:event_btnUpdateConsultaActionPerformed


    private void preencherCampos() {
        txtCRM.setText(String.valueOf(this.medico.getCrm()));
        txtCPF.setText(this.medico.getCpf());
        txtNome.setText(this.medico.getNome());
        txtCelular.setText(this.medico.getNumCelular());
        txtEmail.setText(this.medico.getEmail());
        txtDataNascimento.setText(appConfig.getDateFormat().format(this.medico.getDataNascimento()));        
    }
    
    private void preencherTabela() {
        ArrayList<Consulta> listaConsultas = appConfig.getConsultaNG().BuscarConsultasPorMedico(
                                                        appConfig.getConexaoDB(), appConfig.getConsultaAD(), this.medico.getCrm());
        
        DefaultTableModel model = (DefaultTableModel)tbConsultas.getModel();
            model.setNumRows(0);
            listaConsultas.forEach(c -> {
                
            try {
                Paciente paciente = appConfig.getPacienteNG().buscarPacientePorID(
                        appConfig.getConexaoDB(), appConfig.getPacienteAD(), c.getIdPaciente());
                

                model.addRow(new Object[] {
                    c.getIdConsulta(),
                    c.getIdPaciente(),
                    paciente.getNome(),
                    appConfig.getDateFormat().format(c.getDataConsulta()),
                    c.getDescricao()
                });
            } catch (PacienteException ex) {
                JOptionPane.showMessageDialog(null, ex.getMensagemErro(), "Erro "+ ex.getCodigoErro(), 2);
            }});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddConsulta;
    private javax.swing.JButton btnAtualizarDados;
    private javax.swing.JButton btnRemoveConsulta;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnUpdateConsulta;
    private javax.swing.JMenu itemCadastro;
    private javax.swing.JMenuItem itemMenuSobre;
    private javax.swing.JMenu itemOpcoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCRM;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JMenuItem menuItemDeletarConta;
    private javax.swing.JMenuItem menuItemInformacoes;
    private javax.swing.JMenuItem menuItemPaciente;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenu menuItemSobre;
    private javax.swing.JMenuBar menuLogin;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTable tbConsultas;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCRM;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JFormattedTextField txtEmail;
    private javax.swing.JFormattedTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
