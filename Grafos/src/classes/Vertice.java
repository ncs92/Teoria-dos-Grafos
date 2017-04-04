/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.List;

/**
 *
 * @author a899607
 */
public class Vertice {
    private String nome;
    private List<Aresta> arestasAdjacentes;

    public Vertice() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public List<Aresta> getArestasAdjacentes() {
        return arestasAdjacentes;
    }

    public void setArestasAdjacentes(List<Aresta> arestasAdjacentes) {
        this.arestasAdjacentes = arestasAdjacentes;
    }
    
    
}
