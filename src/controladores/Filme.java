package controladores;

import java.util.ArrayList;

public class Filme {
    
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMenorIdade() {
        return menorIdade;
    }

    public void setMenorIdade(String menorIdade) {
        this.menorIdade = menorIdade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Filme(String nome, String menorIdade, String genero, String duracao) {
        this.nome = nome;
        this.menorIdade = menorIdade;
        this.genero = genero;
        this.duracao = duracao;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }
    
    public String toString() {
        return nome;
    }

    public Filme() {
    }
    String menorIdade;
    String genero;
    String duracao;
    static ArrayList<Filme> filmes = new ArrayList<>();
}
