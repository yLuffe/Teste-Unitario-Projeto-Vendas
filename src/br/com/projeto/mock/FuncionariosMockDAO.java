// Feito por Luiz Fernando
package br.com.projeto.mock;

import br.com.projeto.interfaces.FuncionariosDao;
import br.com.projeto.model.Funcionarios;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FuncionariosMockDao implements FuncionariosDao {

    private List<Funcionarios> funcionariosList;

    public FuncionariosMockDao() {
        funcionariosList = new ArrayList<>();
        inicializarDadosMock();
    }

    private void inicializarDadosMock() {
        funcionariosList.add(new Funcionarios("123456", "Master", "Master", 001, "Luiz Fernando",
                "1123123", "12345678912", "teste@teste.com", "48912345678", "48912345678",
                "12123000", "Rua Sem Nome", 69, "null",
                "Agronomica", "Florianópolis", "SC"));
    }

    @Override
    public void cadastrarFuncionarios(Funcionarios obj) {
        // Simula a geração de um ID único
        int novoId = 1;
        for (Funcionarios funcionario : funcionariosList) {
            novoId = Math.max(novoId, funcionario.getId() + 1);
        }
        obj.setId(novoId);
        funcionariosList.add(obj);
        System.out.println("Funcionário cadastrado (Mock): " + obj);
    }

    @Override
    public List<Funcionarios> listarFuncionarios() {
        return new ArrayList<>(funcionariosList);
    }

    @Override
    public void excluirFuncionario(Funcionarios obj) {
        Iterator<Funcionarios> iterator = funcionariosList.iterator();
        while (iterator.hasNext()) {
            Funcionarios funcionario = iterator.next();
            if (funcionario.getId() == obj.getId()) {
                iterator.remove();
                System.out.println("Funcionário removido (Mock): " + obj);
                return;
            }
        }
        System.out.println("Funcionário não encontrado para exclusão (Mock): " + obj);
    }

    @Override
    public void alterarFuncionario(Funcionarios obj) {
        for (Funcionarios funcionario : funcionariosList) {
            if (funcionario.getId() == obj.getId()) {
                funcionario.setNome(obj.getNome());
                funcionario.setRg(obj.getRg());
                funcionario.setCpf(obj.getCpf());
                funcionario.setEmail(obj.getEmail());
                funcionario.setSenha(obj.getSenha());
                funcionario.setCargo(obj.getCargo());
                funcionario.setNivel_acesso(obj.getNivel_acesso());
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
    public List<Funcionarios> buscaFuncionario(String nome) {
        List<Funcionarios> resultado = new ArrayList<>();
        for (Funcionarios funcionario : funcionariosList) {
            if (funcionario.getNome().toLowerCase().contains(nome.toLowerCase())) {
                resultado.add(funcionario);
            }
        }
        return resultado;
    }

    @Override
    public void efetuaLogin(String email, String senha) {
        for (Funcionarios funcionario : funcionariosList) {
            if (funcionario.getEmail().equals(email) && funcionario.getSenha().equals(senha)) {
                System.out.println("Usuário logado (Mock): " + funcionario.getNome());
                return;
            }
        }
        System.out.println("Usuário não encontrado ou senha incorreta (Mock)");
    }
}
