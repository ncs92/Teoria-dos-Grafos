/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author a899607
 */
public class Grafo {
    Map<Vertice, List<Aresta>> grafo = new HashMap<>();

    public Grafo() {
    }
    
    public Vertice getVetice(Vertice v){
       return (Vertice) grafo.get(v);
    }
    
    public List<Aresta> getArestasVertice (Vertice v){        
       return null;
    }
    
    public void inserirVertice(Vertice v){
        grafo.put(v, null);
    }
    
    public void inserirAresta(Vertice v, Aresta a){
      //  grafo.put(v, a);
    }
      
      
}
