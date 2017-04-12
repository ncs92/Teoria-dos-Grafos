/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author a899607
 */
public class VerticeProfundidade extends Vertice {
    private String cor;
    private VerticeLargura predecessor;
    private int distancia;
    private int tempo;

    public VerticeProfundidade() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public VerticeLargura getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(VerticeLargura predecessor) {
        this.predecessor = predecessor;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
    
}
