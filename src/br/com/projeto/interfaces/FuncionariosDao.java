// Feito por Luiz Fernando
package br.com.projeto.interfaces;

import br.com.projeto.model.Funcionario;
import java.util.List;

public interface FuncionariosDao {

    void cadastrarFuncionarios(Funcionario obj);

    List<Funcionario> listarFuncionarios();

    void excluirFuncionario(Funcionario obj);

    void alterarFuncionario(Funcionario obj);

    List<Funcionario> buscaFuncionario(String nome);

    void efetuaLogin(String email, String senha);
}
