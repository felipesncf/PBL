/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl;

import javax.swing.JOptionPane;

/**
 *
 * @author pioca_000
 */
public class PBL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //PARTE DA PORTA:
        Porta porta1 = new Porta();
        
        porta1.setCor("Marrom");
        porta1.setDimensaoX(30);
        porta1.setDimensaoY(15);
        porta1.setDimensaoZ(120);
        porta1.fecha();
        
        int controle;
        int controleAbreFecha;
        
        controleAbreFecha=Integer.parseInt(JOptionPane.showInputDialog("Voce deseja abrir a porta? \n 1-Sim. \n 0-Nao"));
        switch(controleAbreFecha){
            case 1:
                porta1.abre();
                JOptionPane.showMessageDialog(null,"A porta esta aberta.");
                break;
            case 0:
                porta1.fecha();
                JOptionPane.showMessageDialog(null,"A porta esta fechada.");
                break;
        }
        controle=10;
        while(controle!=0){
            controle=Integer.parseInt(JOptionPane.showInputDialog("Voce deseja pintar a porta? \n 1-Sim. \n 0-Nao"));
            switch(controle){
                 case 1:
                    String cor;
                    cor=JOptionPane.showInputDialog("De que cor voce deseja pintar a porta?");
                    porta1.pinta(cor);
                    break;
                 case 0:
                    break;
            }
        }
        
        porta1.setDimensaoX(Integer.parseInt(JOptionPane.showInputDialog("Insira a nova dimensao: ")));
        porta1.setDimensaoY(Integer.parseInt(JOptionPane.showInputDialog("Insira a nova dimensao: ")));
        porta1.setDimensaoZ(Integer.parseInt(JOptionPane.showInputDialog("Insira a nova dimensao: ")));
        
        controle=50;
        while(controle!=0){
            controle=Integer.parseInt(JOptionPane.showInputDialog("Voce deseja ver os dados da porta?\n 1-Sim. \n 0-Nao"));
            if(controle==1){
                if(porta1.estarAberta()){
                JOptionPane.showMessageDialog(null, "A porta esta aberta");
                }
                else{
                    JOptionPane.showMessageDialog(null, "A porta esta fechada");
                }
            JOptionPane.showMessageDialog(null, porta1.getCor());
            JOptionPane.showMessageDialog(null, porta1.getDimensaoX());
            JOptionPane.showMessageDialog(null, porta1.getDimensaoY());
            JOptionPane.showMessageDialog(null, porta1.getDimensaoZ());
            
            }
        }
        
        
        //PARTE DA CASA:
        Casa casa1 = new Casa();
        Porta porta2 = new Porta();
       
        int controleC=50;
        
        casa1.setCor(JOptionPane.showInputDialog("Qual a cor da casa?"));
        while(controleC!=0){
            controleC=Integer.parseInt(JOptionPane.showInputDialog("Voce deseja adicionar uma nova porta? \n 1-Sim. \n 0-Nao."));
            if(controleC==1){
                casa1.setPorta(porta2);
                
            }
            
        }
        casa1.ParImpar();
        
        JOptionPane.showMessageDialog(null, "O total de portas abertas sao: "+casa1.quantasPortasEstaoAbertas());
      
        
        
        
        //PARTE DO EDIFICIO:
        
        Edificio edificio1 = new Edificio();
        Porta porta3 = new Porta();

        porta3.setCor("Marrom");
        porta3.setDimensaoX(30);
        porta3.setDimensaoY(15);
        porta3.setDimensaoZ(120);
        porta3.fecha();
        
        
        Porta porta4 = new Porta();
        
        porta4.setCor("Rosa");
        porta4.setDimensaoX(15);
        porta4.setDimensaoY(30);
        porta4.setDimensaoZ(10);
        porta4.fecha();
        
        
        Porta porta5 = new Porta();
        
        porta5.setCor("Vermelha");
        porta5.setDimensaoX(3);
        porta5.setDimensaoY(5);
        porta5.setDimensaoZ(12);
        porta5.fecha();
        
        Porta porta6 = new Porta();
        
        porta6.setCor("Cinza");
        porta6.setDimensaoX(45);
        porta6.setDimensaoY(67);
        porta6.setDimensaoZ(89);
        porta6.fecha();
        
        Porta porta7 = new Porta();
        
        porta7.setCor("Preta");
        porta7.setDimensaoX(69);
        porta7.setDimensaoY(100);
        porta7.setDimensaoZ(120);
        porta7.fecha();
        
        Porta porta8 = new Porta();
        
        porta8.setCor("Amarela");
        porta8.setDimensaoX(2);
        porta8.setDimensaoY(5);
        porta8.setDimensaoZ(20);
        porta8.fecha();
        
        
        edificio1.setCor(JOptionPane.showInputDialog("Qual a cor do edificio?"));
        
        edificio1.cadastraPorta(porta3);
        edificio1.cadastraPorta(porta4);
        edificio1.cadastraPorta(porta5);
        edificio1.cadastraPorta(porta6);
        edificio1.cadastraPorta(porta7);
        edificio1.cadastraPorta(porta8);
        
        
        int controleEdi=50;
        while(controleEdi!=0){
            controleEdi=Integer.parseInt(JOptionPane.showInputDialog("Voce deseja abrir as porta? \n 1-Sim. \n 2-Nao, quero fechar.\n 0-Sair"));
            if(controleEdi==1){
                int escolhaPortaAbre=50;
                escolhaPortaAbre=Integer.parseInt(JOptionPane.showInputDialog("Qual porta voece deseja abrir?\n Escolha de 3 a 8."));
                switch(escolhaPortaAbre){
                    case 3:
                        porta3.abre();
                        JOptionPane.showMessageDialog(null,"A porta esta aberta.");
                        break;
                    case 4:
                        porta4.abre();
                        JOptionPane.showMessageDialog(null,"A porta esta aberta.");
                        break;
                    case 5:
                        porta5.abre();
                        JOptionPane.showMessageDialog(null,"A porta esta aberta.");
                        break;
                    case 6:
                        porta6.abre();
                        JOptionPane.showMessageDialog(null,"A porta esta aberta.");
                        break;
                    case 7:
                        porta7.abre();
                        JOptionPane.showMessageDialog(null,"A porta esta aberta.");
                        break;
                    case 8:
                        porta8.abre();
                        JOptionPane.showMessageDialog(null,"A porta esta aberta.");
                        break;
                }
            }
            if(controleEdi==2){
                int escolhaPortaFecha;
                escolhaPortaFecha=Integer.parseInt(JOptionPane.showInputDialog("Qual porta voece deseja abrir?\n Escolha de 3 a 8."));
                switch(escolhaPortaFecha){
                    case 3:
                        porta3.fecha();
                        JOptionPane.showMessageDialog(null,"A porta esta fechada.");
                        break;
                    case 4:
                        porta4.fecha();
                        JOptionPane.showMessageDialog(null,"A porta esta fechada.");
                        break;
                    case 5:
                        porta5.fecha();
                        JOptionPane.showMessageDialog(null,"A porta esta fechada.");
                        break;
                    case 6:
                        porta6.fecha();
                        JOptionPane.showMessageDialog(null,"A porta esta fechada.");
                        break;
                    case 7:
                        porta7.fecha();
                        JOptionPane.showMessageDialog(null,"A porta esta fechada.");
                        break;
                    case 8:
                        porta8.fecha();
                        JOptionPane.showMessageDialog(null,"A porta esta fechada.");
                        break;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "A quantidade de portas abertas sao: "+ edificio1.quantasPortasEstaoAbertas());
        JOptionPane.showMessageDialog(null, "O numero todal de portas no edificio eh: "+edificio1.totalDePortas());
        
        int escolhaAndar=50;
        Andar andar1= new Andar();
        while(escolhaAndar!=0){
            escolhaAndar=Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar +1 andar?\n 1-Sim. \n 0-Nao."));
            switch(escolhaAndar){
                case 1:
                    edificio1.cadastrarAndar(andar1);
                    
                    break;
                case 0:
                    break;
            }
        }
        
        JOptionPane.showMessageDialog(null, "O numero total de andares eh: "+edificio1.totalDeAndares());

    }
}
