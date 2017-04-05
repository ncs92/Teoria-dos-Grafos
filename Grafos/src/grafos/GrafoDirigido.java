/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import classes.Aresta;
import classes.Vertice;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author a899607
 */
public class GrafoDirigido {

    public static void lerArquivo() {
        String texto;
        String arquivo = "/home/nani/Documentos/UTFPR/Grafos/grafo.txt";
        File file = new File(arquivo);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((texto = br.readLine()) != null) {
                System.out.println(texto);
                Vertice v = new Vertice();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void inserirVerticeGrafo(){
        
    }
    
    public static void inserirArestaGrafo(){
        
    }
    
    public static Map<Vertice, List<Aresta>> getGrafo(){
        return null;
    }
    
    public static List<Vertice> getTodosVertices(){
        return null;
    }
    
    public static Vertice getVertice(){
        return null;
    }
        
    
    public static void mostrarGrafo(){
        
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Vertice, List<Aresta>> grafo = new HashMap<>();
        lerArquivo();
    }

}
