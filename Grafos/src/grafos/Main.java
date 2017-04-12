/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import classes.Aresta;
import classes.BuscaLargura;
import classes.Grafo;
import classes.Vertice;
import classes.VerticeLargura;
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
       Grafo grafoLargura = new Grafo();
       VerticeLargura a = new VerticeLargura();
       a.setNome("A");
       VerticeLargura b = new VerticeLargura();
       b.setNome("B");
       VerticeLargura c = new VerticeLargura();
       c.setNome("C");
       VerticeLargura d = new VerticeLargura();
       d.setNome("D");
       VerticeLargura e = new VerticeLargura();
       e.setNome("E");
       
       Aresta ab = new Aresta();
       ab.setPeso("8");
       ab.setV1(b);
       Aresta ac = new Aresta();
       ac.setPeso("4");
       ac.setV1(c);
       Aresta bd = new Aresta();
       bd.setPeso("9");
       bd.setV1(d);
       Aresta ce = new Aresta();
       ce.setPeso("9");
       ce.setV1(e);
       
       
       grafoLargura.inserirVerticeGrafo(a);
       grafoLargura.inserirVerticeGrafo(b);
       grafoLargura.inserirVerticeGrafo(c);
       grafoLargura.inserirVerticeGrafo(d);
       grafoLargura.inserirVerticeGrafo(e);
       
       grafoLargura.inserirArestaGrafo(a, ab);
       grafoLargura.inserirArestaGrafo(a, ac);
       grafoLargura.inserirArestaGrafo(b, bd);
       grafoLargura.inserirArestaGrafo(c, ce);
       
       System.out.println("\n Arvore :");
       grafoLargura.mostrarGrafoLargura();
            
      
      //  lerArquivo();
    }

}
