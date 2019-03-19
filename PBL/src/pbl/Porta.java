/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl;

/**
 *
 * @author pioca_000
 */
public class Porta {
    private boolean aberta;
    private String cor;
    private int dimensaoX;
    private int dimensaoY;
    private int dimensaoZ;
    
    private int portaAberta=0;
    
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    
    public int getDimensaoX() {
        return dimensaoX;
    }
    public void setDimensaoX(int dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    
    public int getDimensaoY() {
        return dimensaoY;
    }
    public void setDimensaoY(int dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    
    public int getDimensaoZ() {
        return dimensaoZ;
    }
    public void setDimensaoZ(int dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }
    
    
    public void abre(){
        setPortaAberta(getPortaAberta() + 1);
        this.aberta=true;
    }
    public void fecha(){
        setPortaAberta(getPortaAberta() - 1);
        this.aberta=false;
    }
    
    
    public boolean estarAberta(){
        if(this.aberta){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void pinta(String cor){
        this.setCor(cor);
    }


    
    public int getPortaAberta() {
        return portaAberta;
    }
    public void setPortaAberta(int portaAberta) {
        this.portaAberta = portaAberta;
    }
    
}
