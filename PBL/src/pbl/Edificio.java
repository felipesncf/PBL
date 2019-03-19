/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl;

import java.util.ArrayList;

/**
 *
 * @author pioca_000
 */
public class Edificio {
    private String cor;
    private ArrayList<Andar>andares;
    private ArrayList<Porta>portas;
    private Porta quant;

  
    public Edificio(){
        this.portas = new ArrayList();
        this.andares = new ArrayList();
    }
    
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

   
    

   
    public ArrayList<Porta> getPortas() {
        return portas;
    }
    public void setPortas(ArrayList<Porta> portas) {
        this.portas = portas;
    }
    
    
    public void pinta(String cor){
        this.setCor(cor);
    }
    
   int quantasPortasEstaoAbertas(){
       int quantPorta=0;
       for(int i=0; i<this.getPortas().size();i++){
           if(portas.get(i).estarAberta()){
               quantPorta++;
           }
       }
       return quantPorta;
   }
    
    public void cadastraPorta(Porta porta){
        this.portas.add(porta);
    }
    
    public int totalDePortas(){
        return portas.size();
    }
    
    public void cadastrarAndar(Andar andar){
        this.andares.add(andar);
    }
    
    public int totalDeAndares(){
        return andares.size();
    }
    
    
}
