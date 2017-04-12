/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author nani
 */
public class BuscaLargura {
    private int menorDistancia;
    

    public void initGrafo(Grafo g, VerticeLargura s){
        ArrayList<Object> vertices = new ArrayList<>();
        vertices.addAll(g.getAllKeys());
        for(Object v : vertices){
            VerticeLargura aux = new VerticeLargura();
            aux = (VerticeLargura) v;
            if(!aux.equals(s)){
                aux.setCor("white");
                aux.setDistancia(-1);
                aux.setPredecessor(null);
            }else{
                aux.setCor("gray");
                aux.setDistancia(0);
                aux.setPredecessor(null);
            }
        }        
    }

    public void busca(Grafo g, VerticeLargura s) {
        ArrayList<VerticeLargura> atuais = new ArrayList<VerticeLargura>();
        ArrayList<VerticeLargura> aux = new ArrayList<VerticeLargura>();
        atuais.add(s);
        do {
            aux = null;
            for (VerticeLargura atual : atuais) {
                if (atual != null) {
                    ArrayList<Aresta> adj = new ArrayList<>();
                    adj.addAll((ArrayList) g.getArestasVertice(atual));
                    for (Aresta a : adj) {                     
                        VerticeLargura v = new VerticeLargura();
                        v = (VerticeLargura) a.getV1();
                        v.setCor("gray");
                        v.setDistancia(atual.getDistancia() + 1);
                        v.setPredecessor(atual);
                        a.setV1(v);
                        aux.add((VerticeLargura) a.getV1());
                    }
                    atual.setCor("black");
                }
            }
            atuais = aux;

        } while (atuais != null);
    }

    
}
