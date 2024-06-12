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
        funcionariosDataBase.add(new Funcionario("123456", "Master", "Master", 001, "Luiz Fernando",
                "1123123", "12345678912", "teste@teste.com", "48912345678", "48912345678",
                "12123000", "Rua Sem Nome", 69, "null",
                "Agronomica", "Florianópolis", "SC"));
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
    public void excluirFuncionario(Funcionario obj) {
        Iterator<Funcionario> iterator = funcionariosDataBase.iterator();
        while (iterator.hasNext()) {
            Funcionario funcionario = iterator.next();
            if (funcionario.getId() == obj.getId()) {
                iterator.remove();
                System.out.println("Funcionário removido (Mock): " + obj);
                return;
            }
        }
        System.out.println("Funcionário não encontrado para exclusão (Mock): " + obj);
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
            if (funcionario.getNome().toLowerCase().contains(nome.toLowerCase())) {
                resultado.add(funcionario);
            }
        }
        return resultado;
    }
    
    @Override
    public Funcionario buscarFuncionario(int id) {
        try {
            for(Funcionario f :funcionariosDataBase){
                if(f.getId() == id){
                    return f;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }

    @Override
    public void efetuaLogin(String email, String senha) {
        for (Funcionario funcionario : funcionariosDataBase) {
            if (funcionario.getEmail().equals(email) && funcionario.getSenha().equals(senha)) {
                System.out.println("Usuário logado (Mock): " + funcionario.getNome());
                return;
            }
        }
        System.out.println("Usuário não encontrado ou senha incorreta (Mock)");
    }

    
}
