package br.com.projeto.model;

public class Funcionario extends Cliente {

    //Atributos
    private String senha;
    private String cargo;
    private String nivelAcesso;

    //Construtor feito por Luiz Fernando
    public Funcionario() {
    }

    public Funcionario(String senha, String cargo, String nivelAcesso, int id, String nome, String rg, String cpf, String email, String telefone, String celular, String cep, String endereco, int numero, String complemento, String bairro, String cidade, String uf) {
        super(id, nome, rg, cpf, email, telefone, celular, cep, endereco, numero, complemento, bairro, cidade, uf);
        this.senha = senha;
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
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

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    //Feito por Luiz Fernando
    @Override
    public String toString() {
        return "Funcionarios{" + "cargo=" + cargo + ", nivel_acesso=" + nivelAcesso + '}';
    }

}
