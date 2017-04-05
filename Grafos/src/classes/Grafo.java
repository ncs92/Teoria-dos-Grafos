/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author nani
 */
public class Grafo {
    static Map<Vertice, ArrayList<Aresta>> grafo = new HashMap<>();

    public Grafo() {
    }
    
    public static Map<Vertice, List<Aresta>> getGrafo(){
        return null;
    }

    public static void inserirVerticeGrafo(Vertice v) {
        if (grafo.containsKey(v)) {
            System.out.println("\n O grafo já contem este valor como key.");
        } else {
            grafo.put(v, null);
        }
    }

    public static void inserirArestaGrafo(Vertice v, Aresta a) {
        ArrayList<Aresta> auxiliar = new ArrayList();
        if (grafo.containsKey(v)) {
            if (grafo.get(v) != null) {
                auxiliar = grafo.get(v);
            }
        }
        auxiliar.add(a);
        grafo.put(v, auxiliar);
    }

    public static void removeKeyGrafo(Vertice v){
       grafo.remove(v);
    }

    public static void removerTodasKeyGrafo(){
        grafo.clear();
    }
    
    public static ArrayList<Aresta> getArestasVertice(Vertice v ){
        return grafo.get(v);
    }
    
    public static Set<Vertice> getAllKeys(){
        return  grafo.keySet();
    }
    
        
    public static Collection<ArrayList<Aresta>> todosValoresGrafo(){
        return grafo.values();
    }
    
    public static void mostrarGrafo(){
        ArrayList<Vertice> vertices = new ArrayList();
        vertices.addAll(getAllKeys());
        for (Vertice v: vertices){
            System.out.print("\n" + v.getNome() + " : ");
            ArrayList<Aresta> arestas = new ArrayList();
            arestas = getArestasVertice(v);
            if (arestas == null) {
                System.out.print("null ");
            } else {
                for (Aresta a : arestas) {
                    System.out.print("\n" + a.getV1().getNome() + " -> ");
                }
            }
        }
    }
}
