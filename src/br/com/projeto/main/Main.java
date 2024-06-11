// Feito por Luiz Fernando Kuhn
package br.com.projeto.main;

import br.com.projeto.dao.FuncionariosDAO;
import br.com.projeto.interfaces.FuncionariosDao;
import br.com.projeto.mock.FuncionariosMockDao;
import br.com.projeto.view.FrmLogin;
import javax.swing.UIManager;
import br.com.projeto.test.AppConfig;

public class Main {

    public static void main(String[] args) {
        // Traduz o "JOP.YES_NO_OPTION para SIM e NÃO"
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");

        // Look And Feel
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println(e);
        }

        // Inicia o Form de Login
        new FrmLogin().setVisible(true);
    }
}
