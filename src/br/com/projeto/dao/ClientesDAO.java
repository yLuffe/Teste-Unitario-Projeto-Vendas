package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClientesDAO {

    //Variavel de Conexão
    private Connection con;

    //Método Construtor Conexão
    public ClientesDAO() {
        this.con = new ConnectionFactory().getConnection();
    }

    //Método Cadastrar Cliente
    public void cadastrarCliente(Cliente obj) {

        try {

            //1 Passo - Criar o comando SQL
            String sql = "insert into tb_clientes(nome,rg,cpf,email,telefone,celular,cep,endereco,numero,complemento,bairro,cidade,estado)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

            //2-Passo - Conectar o BD e organizar o camando SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefone());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCep());
            stmt.setString(8, obj.getEndereco());
            stmt.setInt(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getUf());

            //3Passo - Executar e fechar o Comando SQL
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado Com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }
    }
    

    //Método Alterar Cliente
    public void alterarCliente(Cliente obj) {
        
        try {

            //1 Passo - Criar o comando SQL
            String sql = "update tb_clientes set nome=?,rg=?,cpf=?,email=?,telefone=?,celular=?,cep=?,endereco=?,numero=?,"
                    +"complemento=?,bairro=?,cidade=?,estado=? where id=?";
                    

            //2-Passo - Conectar o BD e organizar o camando SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefone());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCep());
            stmt.setString(8, obj.getEndereco());
            stmt.setInt(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getUf());
            
            stmt.setInt(14, obj.getId());


            //3Passo - Executar e fechar o Comando SQL
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Alterado Com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro);

        }
        

    }
    
    

    //Método Excluir Cliente
    public void excluirCliente(Cliente obj) {
        try {
            
            //1ºPasso - Criar o comando SQL
            String sql = "delete from tb_clientes where id=?";
            
            //2ºPasso - Conectar o BD e Organizar o Comando SQL
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1,obj.getId());
            
            //3ºPasso - Executar o Comando SQL
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null,"Excluido com Sucesso!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Erro : "+ erro);
        }
        
        
        
        

    }
    

    //Método Listar Clientes
    public List<Cliente> listarClientes() {
        try {
            //1Passo criar a lista
            List<Cliente> lista = new ArrayList<>();

            //2Passo - criar o sql e executar
            String sql = "select * from tb_clientes";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente obj = new Cliente();

                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
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
            
            JOptionPane.showMessageDialog(null,"Erro : "+erro);
            return null;
            
        }
    }
    
    //Método Buscar Cliente por Nome
        public List<Cliente> buscaClientePorNome(String nome) {
        try {
            //1Passo criar a lista
            List<Cliente> lista = new ArrayList<>();

            //2Passo - criar o sql e executar
            String sql = "select * from tb_clientes where nome like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente obj = new Cliente();

                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
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
            
            JOptionPane.showMessageDialog(null,"Erro : "+erro);
            return null;
            
        }
    
        }
}
