package controladores;

import java.util.ArrayList;
import java.util.Date;

public class Sala {
    
    private String filme;
    private String nome;
    private String data;
    private double preco;
    static private int espaco;
    static private int espacoDisponivel;

    public int getEspaco() {
        return espaco;
    }

    public void setEspaco(int espaco) {
        this.espaco = espaco;
    }

    public int getEspacoDisponivel() {
        return espacoDisponivel;
    }

    public void setEspacoDisponivel(int espacoDisponivel) {
        this.espacoDisponivel = espacoDisponivel;
    }

    public Sala(String nome, String data, double preco, String filme, int espaco, int espacoDisponivel) {
        this.nome = nome;
        this.data = data;
        this.preco = preco;
        this.filme = filme;
        this.espaco = espaco;
        this.espacoDisponivel = espacoDisponivel;
    }

    public Sala(){
        
    }
    
    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public String toString(){
        return nome;
    }
    
    static ArrayList<Sala> salas = new ArrayList<>();
}
