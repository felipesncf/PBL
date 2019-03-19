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
public class Casa {
    private String cor;
    private ArrayList<Porta>portas;
    private Porta quant;
    
    
    public Casa(){
      this.portas = new ArrayList();  
    }

    
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public ArrayList<Porta> getPortas(){
        return portas;
    }
    public void setPortas(ArrayList<Porta> portas){
        this.portas=portas;
    }
    public void setPorta(Porta porta){
        this.portas.add(porta);
    }
    
    
    public void pinta(String cor){
        this.setCor(cor);
    }
    
    int quantasPortasEstaoAbertas(){
        return this.ParImpar();
    }
   
    public void cadastraPorta(Porta porta){
        this.portas.add(porta);
    }
    
    
    public int chegarTotal(){
        int x=0;
        for(int i=0;i<portas.size();i++){
         if(portas.get(i).getPortaAberta()==1){
             x++;
         }   
        }
        return x;
    }
    public int totalDePortas(){
        return portas.size();
    }
    
    public int ParImpar(){
        int quantAbertas=0;
        for(int i=0; i<this.getPortas().size();i++){
            if(i%2==0){
                this.portas.get(i).abre();
                quantAbertas++;
            }
            else{
                this.portas.get(i).fecha();
            }
        }
        return quantAbertas;
    }
    
    
}
