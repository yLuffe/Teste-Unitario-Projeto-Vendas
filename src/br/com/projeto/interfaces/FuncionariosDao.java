// Feito por Luiz Fernando
package br.com.projeto.interfaces;

import br.com.projeto.model.Funcionarios;
import java.util.List;

public interface FuncionariosDao {

    void cadastrarFuncionarios(Funcionarios obj);

    List<Funcionarios> listarFuncionarios();

    void excluirFuncionario(Funcionarios obj);

    void alterarFuncionario(Funcionarios obj);

    List<Funcionarios> buscaFuncionario(String nome);

    void efetuaLogin(String email, String senha);
}
