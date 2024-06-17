package br.com.projeto.view;

import br.com.projeto.dao.ClientesDAO;
import br.com.projeto.model.Cliente;
import br.com.projeto.model.Utilitarios;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FrmCliente extends javax.swing.JFrame {

    //Método Listar na Tabela
    public void listar() {

        ClientesDAO dao = new ClientesDAO();
        List<Cliente> lista = dao.listarClientes();
        DefaultTableModel dados = (DefaultTableModel) tableClientes.getModel();
        dados.setNumRows(0);

        for (Cliente c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getRg(),
                c.getCpf(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getUf()
            });
        }
    }

    public FrmCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanelTitulo = new javax.swing.JPanel();
        labelCadastroClientes = new javax.swing.JLabel();
        jTabbedPaneClientes = new javax.swing.JTabbedPane();
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
        labelEndereço = new javax.swing.JLabel();
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
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanelConsultaClientes = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        textPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanelTitulo.setBackground(new java.awt.Color(102, 204, 255));

        labelCadastroClientes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelCadastroClientes.setForeground(new java.awt.Color(255, 255, 255));
        labelCadastroClientes.setText("Cadastro de Clientes");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelCadastroClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(labelCadastroClientes)
                .addContainerGap(40, Short.MAX_VALUE))
        );

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

        labelEndereço.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEndereço.setText("Rua");

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

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Informações Pessoais");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Endereço");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Identificador");

        javax.swing.GroupLayout jPanelDadosPessoaisLayout = new javax.swing.GroupLayout(jPanelDadosPessoais);
        jPanelDadosPessoais.setLayout(jPanelDadosPessoaisLayout);
        jPanelDadosPessoaisLayout.setHorizontalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelRG, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textRG, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTelFixo)
                            .addComponent(labelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNumFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(labelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(labelUF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(boxUnidadeFederativa, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(textCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(labelComplemento)
                                        .addGap(12, 12, 12)
                                        .addComponent(textComplemento))))
                            .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel17))
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel18))
                    .addGroup(jPanelDadosPessoaisLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel19)))
                .addGap(15, 15, 15))
        );
        jPanelDadosPessoaisLayout.setVerticalGroup(
            jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosPessoaisLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel17)
                .addGap(15, 15, 15)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(textNumFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTelFixo)
                    .addComponent(textNumCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCelular)
                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome))
                .addGap(10, 10, 10)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelRG)
                    .addComponent(textRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCPF)
                    .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail))
                .addGap(30, 30, 30)
                .addComponent(jLabel18)
                .addGap(15, 15, 15)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEndereço)
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
                .addComponent(jLabel19)
                .addGap(15, 15, 15)
                .addGroup(jPanelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jTabbedPaneClientes.addTab("Dados Pessoais", jPanelDadosPessoais);

        jPanelConsultaClientes.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Nome:");

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

        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "E-mail", "CPF", "Celular", "Telefone", "Cidade", "UF", "RG", "CEP", "Endereço", "Nº", "Comp", "Bairro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableClientes.getTableHeader().setReorderingAllowed(false);
        tableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableClientes);
        if (tableClientes.getColumnModel().getColumnCount() > 0) {
            tableClientes.getColumnModel().getColumn(8).setResizable(false);
            tableClientes.getColumnModel().getColumn(9).setResizable(false);
            tableClientes.getColumnModel().getColumn(10).setResizable(false);
            tableClientes.getColumnModel().getColumn(11).setResizable(false);
            tableClientes.getColumnModel().getColumn(12).setResizable(false);
            tableClientes.getColumnModel().getColumn(13).setResizable(false);
        }

        javax.swing.GroupLayout jPanelConsultaClientesLayout = new javax.swing.GroupLayout(jPanelConsultaClientes);
        jPanelConsultaClientes.setLayout(jPanelConsultaClientesLayout);
        jPanelConsultaClientesLayout.setHorizontalGroup(
            jPanelConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaClientesLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelConsultaClientesLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(textPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnPesquisar)
                        .addGap(0, 494, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        jPanelConsultaClientesLayout.setVerticalGroup(
            jPanelConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaClientesLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelConsultaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(textPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jTabbedPaneClientes.addTab("Consulta de Clientes", jPanelConsultaClientes);

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
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPaneClientes)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnSalvar)
                .addGap(20, 20, 20)
                .addComponent(btnEditar)
                .addGap(20, 20, 20)
                .addComponent(btnExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEditar, btnExcluir, btnNovo, btnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneClientes)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir))
                .addGap(10, 10, 10))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEditar, btnExcluir, btnNovo, btnSalvar});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Botão Editar 
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Cliente obj = new Cliente();

        obj.setNome(textNome.getText());
        obj.setRg(textRG.getText());
        obj.setCpf(textCPF.getText());
        obj.setEmail(textEmail.getText());
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

        ClientesDAO dao = new ClientesDAO();
        dao.alterarCliente(obj);

        new Utilitarios().limparJTextFields(jPanelDadosPessoais);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        new Utilitarios().limparJTextFields(jPanelDadosPessoais);
    }//GEN-LAST:event_btnNovoActionPerformed

    // Botão Salvar   
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Cliente obj = new Cliente();

        obj.setNome(textNome.getText());
        obj.setRg(textRG.getText());
        obj.setCpf(textCPF.getText());
        obj.setEmail(textEmail.getText());
        obj.setTelefone(textNumFixo.getText());
        obj.setCelular(textNumCelular.getText());
        obj.setCep(textCEP.getText());
        obj.setEndereco(textEndereco.getText());
        obj.setNumero(Integer.parseInt(textNumero.getText()));
        obj.setComplemento(textComplemento.getText());
        obj.setBairro(textBairro.getText());
        obj.setCidade(textCidade.getText());
        obj.setUf(boxUnidadeFederativa.getSelectedItem().toString());

        ClientesDAO dao = new ClientesDAO();
        dao.cadastrarCliente(obj);

        new Utilitarios().limparJTextFields(jPanelDadosPessoais);
    }//GEN-LAST:event_btnSalvarActionPerformed

    // Botão Excluir
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Cliente obj = new Cliente();

        obj.setId(Integer.parseInt(textId.getText()));

        ClientesDAO dao = new ClientesDAO();

        dao.excluirCliente(obj);

        new Utilitarios().limparJTextFields(jPanelDadosPessoais);
    }//GEN-LAST:event_btnExcluirActionPerformed

    //Carrega a lista
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
    }//GEN-LAST:event_formWindowActivated

    // Pegar Dados
    private void tableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientesMouseClicked
        jTabbedPaneClientes.setSelectedIndex(0);

        textId.setText(tableClientes.getValueAt(tableClientes.getSelectedRow(), 0).toString());
        textNome.setText(tableClientes.getValueAt(tableClientes.getSelectedRow(), 1).toString());
        textRG.setText(tableClientes.getValueAt(tableClientes.getSelectedRow(), 2).toString());
        textCPF.setText(tableClientes.getValueAt(tableClientes.getSelectedRow(), 3).toString());
        textEmail.setText(tableClientes.getValueAt(tableClientes.getSelectedRow(), 4).toString());
        textNumFixo.setText(tableClientes.getValueAt(tableClientes.getSelectedRow(), 5).toString());
        textNumCelular.setText(tableClientes.getValueAt(tableClientes.getSelectedRow(), 6).toString());
        textCEP.setText(tableClientes.getValueAt(tableClientes.getSelectedRow(), 7).toString());
        textEndereco.setText(tableClientes.getValueAt(tableClientes.getSelectedRow(), 8).toString());
        textNumero.setText(tableClientes.getValueAt(tableClientes.getSelectedRow(), 9).toString());
        textComplemento.setText(tableClientes.getValueAt(tableClientes.getSelectedRow(), 10).toString());
        textBairro.setText(tableClientes.getValueAt(tableClientes.getSelectedRow(), 11).toString());
        textCidade.setText(tableClientes.getValueAt(tableClientes.getSelectedRow(), 12).toString());
        boxUnidadeFederativa.setSelectedItem(tableClientes.getValueAt(tableClientes.getSelectedRow(), 13).toString());
    }//GEN-LAST:event_tableClientesMouseClicked

    // Botão Pesquisar
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String nome = "%" + textPesquisa.getText() + "%";
        ClientesDAO dao = new ClientesDAO();
        List<Cliente> lista = dao.buscaClientePorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tableClientes.getModel();
        dados.setNumRows(0);

        for (Cliente c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getRg(),
                c.getCpf(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getUf()
            });
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void textPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textPesquisaKeyPressed
        String nome = "%" + textPesquisa.getText() + "%";
        ClientesDAO dao = new ClientesDAO();
        List<Cliente> lista = dao.buscaClientePorNome(nome);
        DefaultTableModel dados = (DefaultTableModel) tableClientes.getModel();
        dados.setNumRows(0);

        for (Cliente c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getRg(),
                c.getCpf(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getUf()

            });
        }
    }//GEN-LAST:event_textPesquisaKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxUnidadeFederativa;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanelConsultaClientes;
    private javax.swing.JPanel jPanelDadosPessoais;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneClientes;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCEP;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCadastroClientes;
    private javax.swing.JLabel labelCelular;
    private javax.swing.JLabel labelCidade;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelComplemento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereço;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelRG;
    private javax.swing.JLabel labelTelFixo;
    private javax.swing.JLabel labelUF;
    private javax.swing.JTable tableClientes;
    private javax.swing.JTextField textBairro;
    private javax.swing.JFormattedTextField textCEP;
    private javax.swing.JFormattedTextField textCPF;
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
    // End of variables declaration//GEN-END:variables
}
