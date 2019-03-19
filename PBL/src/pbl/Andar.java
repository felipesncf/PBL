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
public class Andar {
    private ArrayList<Andar>nomeAndar;
    
    public Andar(){
        this.nomeAndar=new ArrayList();
    }
    
    public ArrayList<Andar> getNomeAndar() {
        return nomeAndar;
    }
    public void setNomeAndar(ArrayList<Andar> nomeAndar) {
        this.nomeAndar = nomeAndar;
    }
    
}
