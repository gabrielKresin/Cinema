package controladores;

import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class Metodos {

    public DefaultComboBoxModel<Vendedor> listarVendedores() {

        Vector<Vendedor> listaDeFuncionarios = new Vector<>();

        Vendedor v = new Vendedor();

        for (int i = 0; i < Vendedor.vendedores.size(); i++) {
            listaDeFuncionarios.add(Vendedor.vendedores.get(i));
        }

        DefaultComboBoxModel<Vendedor> modelo = new DefaultComboBoxModel<>(listaDeFuncionarios);

        return modelo;
    }

    public DefaultComboBoxModel<Sala> listarSalas(){
       
        Vector<Sala> listaDeSalas = new Vector<>();

        Sala s = new Sala();

        for (int i = 0; i < Sala.salas.size(); i++) {
            listaDeSalas.add(Sala.salas.get(i));
        }

        DefaultComboBoxModel<Sala> modelo = new DefaultComboBoxModel<>(listaDeSalas);

        return modelo;
    }
    
    public DefaultComboBoxModel<Filme> listarFilmes() {

        Vector<Filme> listaDeFilmes = new Vector<>();

        Filme f = new Filme();

        for (int i = 0; i < Filme.filmes.size(); i++) {
            listaDeFilmes.add(Filme.filmes.get(i));
        }
        DefaultComboBoxModel<Filme> modelo = new DefaultComboBoxModel<>(listaDeFilmes);

        return modelo;
    }

    public String calculaTroco(double preco, double dinheiro){
        return ""+(dinheiro-preco);
    }

}
