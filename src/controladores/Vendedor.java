package controladores;

import java.util.ArrayList;

public class Vendedor {

    private String nome, telefone, endereco, cpf, rg, login;
    private int idade;
    private char[] senha;

    public Vendedor(){
        
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public char[] getSenha() {
        return senha;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }

    static ArrayList<Vendedor> vendedores = new ArrayList<>();

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return nome;
    }

    public Vendedor(String login, char[] senha, String nome, String telefone, String endereco, String cpf, String rg, int idade) {
        this.cpf = cpf;
        this.endereco = endereco;
        this.idade = idade;
        this.nome = nome;
        this.rg = rg;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
    }

}
