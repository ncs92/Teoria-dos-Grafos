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
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author a899607
 */
public class Grafos {

    /**
     * @param args the command line arguments
     */
    public void lerArquivo(String arquivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        while (br.ready()) {
            String linha = br.readLine();
            System.out.println(linha);
        }
        br.close();
    }

    public static void main(String[] args) {
        // TODO code application logic here
      Grafo grafo = new Grafo();

    }

}
