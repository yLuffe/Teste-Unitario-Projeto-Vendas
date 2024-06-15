// Feito por Luiz Fernando
package br.com.projeto.mock;

import br.com.projeto.interfaces.FuncionariosDao;
import br.com.projeto.model.Funcionario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncionariosMockDao implements FuncionariosDao {

    private List<Funcionario> funcionariosDataBase;

    public FuncionariosMockDao() {
        funcionariosDataBase = new ArrayList<>();
        inicializarDadosMock();
    }

    private void inicializarDadosMock() {
        funcionariosDataBase.add(new Funcionario("1", "Administrador", "Administrador", 001, "Luiz Fernando",
                "12.123.163-12", "123.456.789-12", "1", "(48) 91234-5678", "(48) 91234-5678",
                "12123-000", "Rua Sem Nome", 69, "null",
                "Agronomica", "Florianópolis", "SC"));

        funcionariosDataBase.add(new Funcionario("2", "Gerente", "Administrador", 002, "Ana Silva",
                "12.123.163-12", "987.654.321-00", "2", "(48) 98765-4321", "(48) 98765-4321",
                "88034-000", "Rua das Flores", 123, "Apt 101",
                "Centro", "Florianópolis", "RJ"));

        funcionariosDataBase.add(new Funcionario("senha002", "Analista", "Usuario", 003, "Carlos Souza",
                "12.123.163-12", "123.456.789-01", "carlos.souza@empresa.com", "(48) 97654-3210", "(48) 97654-3210",
                "88035-000", "Avenida Central", 456, "Bloco B",
                "Trindade", "Florianópolis", "SC"));

        funcionariosDataBase.add(new Funcionario("senha003", "Desenvolvedor", "Usuario", 004, "Maria Oliveira",
                "12.123.163-12", "987.654.321-12", "maria.oliveira@empresa.com", "(48) 96543-2109", "(48) 96543-2109",
                "88036-000", "Rua do Sol", 789, "Casa 2",
                "Coqueiros", "Florianópolis", "MG"));

        funcionariosDataBase.add(new Funcionario("senha004", "Tester", "Administrador", 005, "João Santos",
                "12.123.163-12", "123.456.789-23", "joao.santos@empresa.com", "(48) 95432-1098", "(48) 95432-1098",
                "88037-000", "Rua das Palmeiras", 101, "Apt 303",
                "Córrego Grande", "Florianópolis", "SC"));
    }

    @Override
    public void cadastrarFuncionarios(Funcionario obj) {
        // Simula a geração de um ID único
        int novoId = 1;
        for (Funcionario funcionario : funcionariosDataBase) {
            novoId = Math.max(novoId, funcionario.getId() + 1);
        }
        obj.setId(novoId);
        funcionariosDataBase.add(obj);
        System.out.println("Funcionário cadastrado (Mock): " + obj);
    }

    @Override
    public List<Funcionario> listarFuncionarios() {
        return new ArrayList<>(funcionariosDataBase);
    }

    @Override
    public void excluirFuncionario(int id) {
        Iterator<Funcionario> iterator = funcionariosDataBase.iterator();
        while (iterator.hasNext()) {
            Funcionario funcionario = iterator.next();
            if (funcionario.getId() == id) {
                iterator.remove();
                System.out.println("Funcionário removido (Mock): " + funcionario);
                return;
            }
        }
        System.out.println("Funcionário não encontrado para exclusão (Mock) com ID: " + id);
    }

    @Override
    public void alterarFuncionario(Funcionario obj) {
        for (Funcionario funcionario : funcionariosDataBase) {
            if (funcionario.getId() == obj.getId()) {
                funcionario.setNome(obj.getNome());
                funcionario.setRg(obj.getRg());
                funcionario.setCpf(obj.getCpf());
                funcionario.setEmail(obj.getEmail());
                funcionario.setSenha(obj.getSenha());
                funcionario.setCargo(obj.getCargo());
                funcionario.setNivelAcesso(obj.getNivelAcesso());
                funcionario.setTelefone(obj.getTelefone());
                funcionario.setCelular(obj.getCelular());
                funcionario.setCep(obj.getCep());
                funcionario.setEndereco(obj.getEndereco());
                funcionario.setNumero(obj.getNumero());
                funcionario.setComplemento(obj.getComplemento());
                funcionario.setBairro(obj.getBairro());
                funcionario.setCidade(obj.getCidade());
                funcionario.setUf(obj.getUf());
                System.out.println("Funcionário alterado (Mock): " + funcionario);
                return;
            }
        }
        System.out.println("Funcionário não encontrado para alteração (Mock): " + obj);
    }

    @Override
    public List<Funcionario> buscarFuncionario(String nome) {
        List<Funcionario> resultado = new ArrayList<>();
        for (Funcionario funcionario : funcionariosDataBase) {
            if (funcionario.getNome().toLowerCase().contains(nome.replaceAll("%", "").toLowerCase())) {
                resultado.add(funcionario);
            }
        }
        return resultado;
    }

    @Override
    public Funcionario buscarFuncionario(int id) {
        try {
            for (Funcionario f : funcionariosDataBase) {
                if (f.getId() == id) {
                    return f;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }

    @Override
    public String efetuaLogin(String email, String senha) {
            for (Funcionario funcionario : funcionariosDataBase) {
                if (funcionario.getEmail().equals(email) && funcionario.getSenha().equals(senha)) {
                    System.out.println("Usuário logado (Mock): " + funcionario.getNome());
                    return funcionario.getNome();
                }
            }
            throw new IllegalArgumentException("Erro: Usuário não encontrado ou senha incorreta (Mock)");
    }
}
