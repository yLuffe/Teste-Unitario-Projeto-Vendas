package br.com.projeto.view;

import br.com.projeto.dao.ClientesDAO;
import br.com.projeto.dao.FuncionariosDAO;
import br.com.projeto.interfaces.FuncionariosDao;
import br.com.projeto.model.Cliente;
import br.com.projeto.model.Funcionario;
import br.com.projeto.model.Utilitarios;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import br.com.projeto.test.AppConfig;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

public class FrmFuncionario extends javax.swing.JFrame {

    // Switch modo teste e modo de operação + criação do objeto para utilizar métodos
    private FuncionariosDao dataAccess = AppConfig.getFuncionariosDao();
    private final DefaultTableModel model;

    public FrmFuncionario() {
        initComponents();
        model = (DefaultTableModel) tableFuncionarios.getModel();
        listarFuncionarios();
    }

    //Método Listar na Tabela
    public void listarFuncionarios() {
        List<Funcionario> listaFuncionarios = dataAccess.listarFuncionarios();
        model.setNumRows(0);

        for (Funcionario f : listaFuncionarios) {
            model.addRow(new Object[]{
                f.getId(),
                f.getNome(),
                f.getCargo(),
                f.getNivelAcesso(),
                f.getEmail(),
                f.getCelular(),
                f.getTelefone(),
                f.getCidade(),
                f.getUf()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelCadastroFuncionarios = new javax.swing.JLabel();
        jTabbedPaneFuncionarios = new javax.swing.JTabbedPane();
        jPanelDadosPessoais = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        labelCelular = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        textNumCelular = new javax.swing.JFormattedTextField();
        labelTelFixo = new javax.swing.JLabel();
        textNumFixo = new javax.swing.JFormattedTextField();
        labelUF = new javax.swing.JLabel();
        textCEP = new javax.swing.JFormattedTextField();
        labelEndereco = new javax.swing.JLabel();
        textEndereco = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        textNumero = new javax.swing.JTextField();
        labelBairro = new javax.swing.JLabel();
        textBairro = new javax.swing.JTextField();
        labelCidade = new javax.swing.JLabel();
        textCidade = new javax.swing.JTextField();
        labelComplemento = new javax.swing.JLabel();
        textComplemento = new javax.swing.JTextField();
        labelCEP = new javax.swing.JLabel();
        boxUnidadeFederativa = new javax.swing.JComboBox();
        labelRG = new javax.swing.JLabel();
        textRG = new javax.swing.JFormattedTextField();
        labelCPF = new javax.swing.JLabel();
        textCPF = new javax.swing.JFormattedTextField();
        labelSenha = new javax.swing.JLabel();
        textSenha = new javax.swing.JPasswordField();
        labelCargo = new javax.swing.JLabel();
        textCargo = new javax.swing.JTextField();
        labelNivelAcesso = new javax.swing.JLabel();
        boxNivelAcesso = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelConsultaFuncionarios = new javax.swing.JPanel();
        labelNomePesquisa = new javax.swing.JLabel();
        textPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFuncionarios = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        labelCadastroFuncionarios.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelCadastroFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        labelCadastroFuncionarios.setText("Cadastro de Funcionários");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelCadastroFuncionarios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(labelCadastroFuncionarios)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPaneFuncionarios.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPaneFuncionariosStateChanged(evt);
            }
        });

        jPanelDadosPessoais.setBackground(new java.awt.Color(255, 255, 255));

        labelCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCodigo.setText("Código:");

        textId.setEditable(false);
        textId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNome.setText("Nome:");

        textNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        textEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCelular.setText("Celular:");

        labelEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEmail.setText("E-mail:");

        try {
            textNumCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # #### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textNumCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelTelFixo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTelFixo.setText("Telefone Fixo:");

        try {
            textNumFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # #### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textNumFixo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelUF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelUF.setText("UF:");

        try {
            textCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##### - ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textCEP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEndereco.setText("Rua:");

        textEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNumero.setText("Nº:");

        textNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelBairro.setText("Bairro:");

        textBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCidade.setText("Cidade:");

        textCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelComplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelComplemento.setText("Complemento:");

        textComplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelCEP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCEP.setText("CEP:");

        boxUnidadeFederativa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxUnidadeFederativa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SC", "MG", "RJ" }));

        labelRG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelRG.setText("RG:");

        try {
            textRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textRG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCPF.setText("CPF:");

        try {
            textCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSenha.setText("Senha:");

        textSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCargo.setText("Cargo:");

        textCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        labelNivelAcesso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNivelAcesso.setText("Nível de Acesso:");

        boxNivelAcesso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxNivelAcesso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario", "Administrador" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Informações Pessoais");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Endereço");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Informações Profissionais");

        javax.swing.GroupLayout jPanelDadosPessoaisLayout = new javax.swing.GroupLayout(jPanelDadosPessoais);
        jPanelDadosPessoais.setLayout(jPanelDadosPessoaisLayout);
        jPanelDadosPessoaisLayout.setHorizontalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25)
                                                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(labelRG, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(12, 12, 12)
                                                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                                        .addComponent(textNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(25, 25, 25)
                                                        .addComponent(labelTelFixo))
                                                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                                        .addComponent(textRG, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(25, 25, 25)
                                                        .addComponent(labelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                                .addComponent(textBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25)
                                                .addComponent(labelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25)
                                                .addComponent(labelComplemento)
                                                .addGap(12, 12, 12)
                                                .addComponent(textComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(textCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(labelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(labelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(labelUF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(boxUnidadeFederativa, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNivelAcesso)
                                    .addComponent(labelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxNivelAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCargo))
                                .addGap(12, 12, 12)
                                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8))
                            .addComponent(textCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textNumFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanelDadosPessoaisLayout.setVerticalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCelular)
                    .addComponent(textNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelFixo)
                    .addComponent(textNumFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail)
                    .addComponent(labelRG)
                    .addComponent(textRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCPF)
                    .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEndereco)
                    .addComponent(labelNumero)
                    .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCEP)
                    .addComponent(labelUF)
                    .addComponent(boxUnidadeFederativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBairro)
                    .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCidade)
                    .addComponent(textComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelComplemento))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNivelAcesso)
                    .addComponent(boxNivelAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCargo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSenha)
                    .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jTabbedPaneFuncionarios.addTab("Dados Pessoais", jPanelDadosPessoais);

        jPanelConsultaFuncionarios.setBackground(new java.awt.Color(255, 255, 255));

        labelNomePesquisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNomePesquisa.setText("Nome:");

        textPesquisa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textPesquisaKeyPressed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Cargo", "Nível Acesso", "E-mail", "Celular", "Telefone", "Cidade", "UF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableFuncionarios.getTableHeader().setReorderingAllowed(false);
        tableFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableFuncionarios);
        if (tableFuncionarios.getColumnModel().getColumnCount() > 0) {
            tableFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(60);
            tableFuncionarios.getColumnModel().getColumn(1).setPreferredWidth(280);
            tableFuncionarios.getColumnModel().getColumn(2).setPreferredWidth(120);
            tableFuncionarios.getColumnModel().getColumn(3).setPreferredWidth(120);
            tableFuncionarios.getColumnModel().getColumn(4).setPreferredWidth(250);
            tableFuncionarios.getColumnModel().getColumn(5).setPreferredWidth(115);
            tableFuncionarios.getColumnModel().getColumn(6).setPreferredWidth(115);
            tableFuncionarios.getColumnModel().getColumn(7).setPreferredWidth(100);
            tableFuncionarios.getColumnModel().getColumn(8).setPreferredWidth(30);
        }

        javax.swing.GroupLayout jPanelConsultaFuncionariosLayout = new javax.swing.GroupLayout(jPanelConsultaFuncionarios);
        jPanelConsultaFuncionarios.setLayout(jPanelConsultaFuncionariosLayout);
        jPanelConsultaFuncionariosLayout.setHorizontalGroup(
            jPanelConsultaFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaFuncionariosLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelConsultaFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelConsultaFuncionariosLayout.createSequentialGroup()
                        .addComponent(labelNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(textPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnPesquisar)
                        .addGap(0, 520, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        jPanelConsultaFuncionariosLayout.setVerticalGroup(
            jPanelConsultaFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaFuncionariosLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelConsultaFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomePesquisa)
                    .addComponent(textPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jTabbedPaneFuncionarios.addTab("Consulta de Funcionários", jPanelConsultaFuncionarios);

        btnNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPaneFuncionarios)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEditar, btnExcluir, btnNovo, btnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneFuncionarios)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar)
                        .addComponent(btnEditar)
                        .addComponent(btnExcluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEditar, btnExcluir, btnNovo, btnSalvar});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Botão Editar  
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            Funcionario obj = new Funcionario();

            obj.setNome(textNome.getText());
            obj.setRg(textRG.getText());
            obj.setCpf(textCPF.getText());
            obj.setEmail(textEmail.getText());

            obj.setSenha(textSenha.getText());
            obj.setCargo(textCargo.getText());
            obj.setNivelAcesso(boxNivelAcesso.getSelectedItem().toString());

            obj.setTelefone(textNumFixo.getText());
            obj.setCelular(textNumCelular.getText());
            obj.setCep(textCEP.getText());
            obj.setEndereco(textEndereco.getText());
            obj.setNumero(Integer.parseInt(textNumero.getText()));
            obj.setComplemento(textComplemento.getText());
            obj.setBairro(textBairro.getText());
            obj.setCidade(textCidade.getText());
            obj.setUf(boxUnidadeFederativa.getSelectedItem().toString());

            obj.setId(Integer.parseInt(textId.getText()));
            dataAccess.alterarFuncionario(obj);

            new Utilitarios().limparJTextFields(jPanelDadosPessoais);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            listarFuncionarios();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    // Botão "Novo"
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        try {
            // Leva o usuário para a tela de Cadastro
            jTabbedPaneFuncionarios.setSelectedIndex(0);
            // Limpa dos jTextFields
            new Utilitarios().limparJTextFields(jPanelDadosPessoais);
            // Ativa o botão de "Salvar"
            btnSalvar.setEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    // Botão Salvar  
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            Funcionario f = new Funcionario(
                    textSenha.getText(),
                    textCargo.getText(),
                    boxNivelAcesso.getSelectedItem().toString(),
                    -1,
                    textNome.getText(),
                    textRG.getText(),
                    textCPF.getText(),
                    textEmail.getText(),
                    textNumFixo.getText(),
                    textNumCelular.getText(),
                    textCEP.getText(),
                    textEndereco.getText(),
                    Integer.parseInt(textNumero.getText()),
                    textComplemento.getText(),
                    textBairro.getText(),
                    textCidade.getText(),
                    boxUnidadeFederativa.getSelectedItem().toString()
            );
            // Cadastra no banco de dados
            dataAccess.cadastrarFuncionarios(f);
            // Limpa os campos da tela
            Utilitarios.limparJTextFields(jPanelDadosPessoais);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            listarFuncionarios();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    // Botão Excluir
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            dataAccess.excluirFuncionario((Integer.parseInt(textId.getText())));
            new Utilitarios().limparJTextFields(jPanelDadosPessoais);
            btnSalvar.setEnabled(textId.getText().isEmpty() ? true : false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            listarFuncionarios();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    // Buscar dados do Funcionário e colocar nos campos do menu Dados Pessoais
    private void tableFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFuncionariosMouseClicked
        try {
            if (evt.getClickCount() == 2) {
                jTabbedPaneFuncionarios.setSelectedIndex(0);

                // Pega a linha selecionada da tabela
                int selectedRow = tableFuncionarios.getSelectedRow();

                // Busca o funcionária por ID
                Funcionario f = dataAccess.buscarFuncionario((int) tableFuncionarios.getValueAt(selectedRow, 0));

                // jTextFields
                textId.setText(f.getId() + "");
                textNome.setText(f.getNome());
                textRG.setText(f.getRg());
                textCPF.setText(f.getCpf());
                textEmail.setText(f.getEmail());
                textCargo.setText(f.getCargo());
                textNumFixo.setText(f.getTelefone());
                textNumCelular.setText(f.getCelular());
                textCEP.setText(f.getCep());
                textEndereco.setText(f.getEndereco());
                textNumero.setText(f.getNumero() + "");
                textComplemento.setText(f.getComplemento());
                textBairro.setText(f.getBairro());
                textCidade.setText(f.getCidade());

                // jComboBoxes
                boxNivelAcesso.setSelectedItem(f.getNivelAcesso());
                boxUnidadeFederativa.setSelectedItem(f.getUf());

                // Desativa o botão de editar quando os dados passam para os jTextFields
                btnSalvar.setEnabled(textId.getText().isEmpty() ? true : false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tableFuncionariosMouseClicked

    // Método Pesquisa de Funcionários
    private void buscarFuncionario() {
        try {
            String nome = "%" + textPesquisa.getText() + "%";
            List<Funcionario> listaFuncionarios = dataAccess.buscarFuncionario(nome);
            model.setNumRows(0);

            for (Funcionario f : listaFuncionarios) {
                model.addRow(new Object[]{
                    f.getId(),
                    f.getNome(),
                    f.getCargo(),
                    f.getNivelAcesso(),
                    f.getEmail(),
                    f.getCelular(),
                    f.getTelefone(),
                    f.getCidade(),
                    f.getUf()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // Métodos de Pesquisa
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        buscarFuncionario();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void textPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPesquisaKeyPressed
        buscarFuncionario();
    }//GEN-LAST:event_textPesquisaKeyPressed

    // Ativar botões de ação conforme menu selecionado
    private void jTabbedPaneFuncionariosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPaneFuncionariosStateChanged
        int selectedIndex = jTabbedPaneFuncionarios.getSelectedIndex();
        boolean isEnabled = (selectedIndex == 0);

        btnExcluir.setEnabled(isEnabled);
        btnSalvar.setEnabled(isEnabled);
        btnEditar.setEnabled(isEnabled);
    }//GEN-LAST:event_jTabbedPaneFuncionariosStateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxNivelAcesso;
    private javax.swing.JComboBox boxUnidadeFederativa;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelConsultaFuncionarios;
    private javax.swing.JPanel jPanelDadosPessoais;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneFuncionarios;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCEP;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCadastroFuncionarios;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelComplemento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNivelAcesso;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNomePesquisa;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelRG;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelTelFixo;
    private javax.swing.JLabel labelUF;
    private javax.swing.JTable tableFuncionarios;
    private javax.swing.JTextField textBairro;
    private javax.swing.JFormattedTextField textCEP;
    private javax.swing.JFormattedTextField textCPF;
    private javax.swing.JTextField textCargo;
    private javax.swing.JTextField textCidade;
    private javax.swing.JTextField textComplemento;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textEndereco;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textNome;
    private javax.swing.JFormattedTextField textNumCelular;
    private javax.swing.JFormattedTextField textNumFixo;
    private javax.swing.JTextField textNumero;
    private javax.swing.JTextField textPesquisa;
    private javax.swing.JFormattedTextField textRG;
    private javax.swing.JPasswordField textSenha;
    // End of variables declaration//GEN-END:variables
}
