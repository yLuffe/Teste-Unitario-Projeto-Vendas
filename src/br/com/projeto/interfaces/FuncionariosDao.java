// Feito por Luiz Fernando
package br.com.projeto.interfaces;

import br.com.projeto.model.Funcionario;
import java.util.List;

public interface FuncionariosDao {

    void cadastrarFuncionarios(Funcionario obj);

    List<Funcionario> listarFuncionarios();

    void excluirFuncionario(int id);

    void alterarFuncionario(Funcionario obj);

    List<Funcionario> buscarFuncionario(String nome);

    Funcionario buscarFuncionario(int id);

    void efetuaLogin(String email, String senha);
}
