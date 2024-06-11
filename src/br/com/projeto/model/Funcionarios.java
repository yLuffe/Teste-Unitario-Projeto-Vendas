package br.com.projeto.model;

public class Funcionarios extends Clientes {

    //Atributos
    private String senha;
    private String cargo;
    private String nivel_acesso;

    //Construtor feito por Luiz Fernando
    public Funcionarios() {
    }

    public Funcionarios(String senha, String cargo, String nivel_acesso, int id, String nome, String rg, String cpf, String email, String telefone, String celular, String cep, String endereco, int numero, String complemento, String bairro, String cidade, String uf) {
        super(id, nome, rg, cpf, email, telefone, celular, cep, endereco, numero, complemento, bairro, cidade, uf);
        this.senha = senha;
        this.cargo = cargo;
        this.nivel_acesso = nivel_acesso;
    }
    

    //Getters and Setters
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNivel_acesso() {
        return nivel_acesso;
    }

    public void setNivel_acesso(String nivel_acesso) {
        this.nivel_acesso = nivel_acesso;
    }

    //Feito por Luiz Fernando
    @Override
    public String toString() {
        return "Funcionarios{" + "senha=" + senha + ", cargo=" + cargo + ", nivel_acesso=" + nivel_acesso + '}';
    }

}
