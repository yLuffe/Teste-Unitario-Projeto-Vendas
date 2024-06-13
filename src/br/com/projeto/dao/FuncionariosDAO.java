package br.com.projeto.dao;

import br.com.projeto.interfaces.FuncionariosDao;
import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Cliente;
import br.com.projeto.model.Funcionario;
import br.com.projeto.view.FrmLogin;
import br.com.projeto.view.FrmMenu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionariosDAO implements FuncionariosDao {

    //Variavel de Conexão
    private Connection con;

    //Método Construtor Conexão
    public FuncionariosDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    //Método Cadastrar Funcionários
    public void cadastrarFuncionarios(Funcionario obj) {

        try {
            //1 Passo - Criar o comando SQL
            String sql = "insert into tb_funcionarios(nome,rg,cpf,email,senha,cargo,nivel_acesso,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            //2-Passo - Conectar o BD e organizar o camando SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());

            stmt.setString(5, obj.getSenha());
            stmt.setString(6, obj.getCargo());
            stmt.setString(7, obj.getNivelAcesso());

            stmt.setString(8, obj.getTelefone());
            stmt.setString(9, obj.getCelular());
            stmt.setString(10, obj.getCep());
            stmt.setString(11, obj.getEndereco());
            stmt.setInt(12, obj.getNumero());
            stmt.setString(13, obj.getComplemento());
            stmt.setString(14, obj.getBairro());
            stmt.setString(15, obj.getCidade());
            stmt.setString(16, obj.getUf());

            //3Passo - Executar e fechar o Comando SQL
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }

    //Método Listar Funcionários
    public List<Funcionario> listarFuncionarios() {
        try {
            //1Passo criar a lista
            List<Funcionario> lista = new ArrayList<>();

            //2Passo - criar o sql e executar
            String sql = "select * from tb_funcionarios";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Funcionario obj = new Funcionario();

                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));

                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivelAcesso(rs.getString("nivel_acesso"));

                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("estado"));

                lista.add(obj);
            }
            return lista;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro : " + erro);
            return null;
        }
    }

    //Método Excluir Funcionário
    @Override
    public void excluirFuncionario(int id) {
        try {
            //1ºPasso - Criar o comando SQL
            String sql = "delete from tb_funcionarios where id=?";
            //2ºPasso - Conectar o BD e Organizar o Comando SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            //3ºPasso - Executar o Comando SQL
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro : " + erro);
        }
    }

    //Método Alterar Funcionário
    @Override
    public void alterarFuncionario(Funcionario obj) {
        try {
            //1 Passo - Criar o comando SQL
            String sql = "update tb_funcionarios set nome=?,rg=?,cpf=?,email=?,senha=?,cargo=?,nivel_acesso=?,telefone=?,celular=?,cep=?,endereco=?,numero=?,"
                    + "complemento=?,bairro=?,cidade=?,estado=? where id=?";
            //2-Passo - Conectar o BD e organizar o camando SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());

            stmt.setString(5, obj.getSenha());
            stmt.setString(6, obj.getCargo());
            stmt.setString(7, obj.getNivelAcesso());

            stmt.setString(8, obj.getTelefone());
            stmt.setString(9, obj.getCelular());
            stmt.setString(10, obj.getCep());
            stmt.setString(11, obj.getEndereco());
            stmt.setInt(12, obj.getNumero());
            stmt.setString(13, obj.getComplemento());
            stmt.setString(14, obj.getBairro());
            stmt.setString(15, obj.getCidade());
            stmt.setString(16, obj.getUf());

            stmt.setInt(17, obj.getId());

            //3Passo - Executar e fechar o Comando SQL
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado Com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }

    //Método Buscar Funcionário por Nome
    @Override
    public List<Funcionario> buscarFuncionario(String nome) {
        try {
            //1Passo criar a lista
            List<Funcionario> lista = new ArrayList<>();
            //2Passo - criar o sql e executar
            String sql = "select * from tb_funcionarios where nome like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario obj = new Funcionario();

                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));

                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivelAcesso(rs.getString("nivel_acesso"));

                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setUf(rs.getString("estado"));

                lista.add(obj);
            }
            return lista;
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Não encontrado!");
            return null;
        }
    }

    //Método Efetuar Login
    public void efetuaLogin(String email, String senha) {
        try {
            //1ºPasso - SQL
            String sql = "select*from tb_funcionarios where email=? and senha=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                //Usuario Logou
                JOptionPane.showMessageDialog(null, "Seja Bem vindo ao Sistema!");
                FrmMenu tela = new FrmMenu();
                tela.usuariologado = rs.getString("nome");
                tela.setVisible(true);
            } else {
                //Dados Incorretos
                JOptionPane.showMessageDialog(null, "Dados Incorretos!");
                FrmLogin telaLogin = new FrmLogin();
                telaLogin.setVisible(true);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro : " + erro);
        }
    }

    @Override
    public Funcionario buscarFuncionario(int id) {
        //TODO
        throw new UnsupportedOperationException("Ainda não implementado");
    }
}
