/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import classes.Aresta;
import classes.Grafo;
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
public class Main {

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


        
    public static void main(String[] args) {
        // TODO code application logic here
      
       Vertice a = new Vertice();
       a.setNome("A");
       Grafo.inserirVerticeGrafo(a);
       Grafo.mostrarGrafo();
      //  lerArquivo();
    }

}
