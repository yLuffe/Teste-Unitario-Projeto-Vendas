package br.com.projeto.test;

import br.com.projeto.dao.FuncionariosDAO;
import br.com.projeto.interfaces.FuncionariosDao;
import br.com.projeto.mock.FuncionariosMockDao;

public class AppConfig {

    // Variável para controlar o modo de teste
    private static boolean TEST_MODE = false;

    // Método para verificar se o modo de teste está ativado
    public static boolean isTestMode() {
        return TEST_MODE;
    }
    
    // Utilizado para definir modo de teste
    public static void setTestMode(boolean testMode){
       TEST_MODE = testMode;
    }

    // Método para obter o DAO verdadeiro ou falso com base no modo de teste
    public static FuncionariosDao getFuncionariosDao() {
        if (isTestMode()) {
            // DAO Simulado
            return new FuncionariosMockDao();
        } else {
            // DAO Real
            return new FuncionariosDAO();
        }
    }
}
