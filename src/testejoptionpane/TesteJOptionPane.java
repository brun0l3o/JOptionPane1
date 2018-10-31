/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejoptionpane;
import javax.swing.JOptionPane;

public class TesteJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont, alunos1, alunos2,alunos3,visitas;
        double porcent1, porcent2,porcent3;
        cont=0;
        alunos1=0;
        alunos2=0;
        alunos3=0;
        
        while(cont<=5){
            visitas=Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes você frequentou a biblioteca esse mês:"));
            if(visitas<10){
                alunos1=alunos1+1;
                
            }
            else if(visitas>=10 && visitas<15){
                alunos2=alunos2+1;
                
            }
            else{
                alunos3=alunos3+1;
                
            }
            
         cont++;   
        }
        porcent1=((alunos1*100)/cont);
        porcent2=((alunos2*100)/cont);
        porcent3=((alunos3*100)/cont);
        JOptionPane.showMessageDialog(null, "A porcentagem de alunos que visitou a biblioteca menos de 10 vezes foi: "+porcent1);
        JOptionPane.showMessageDialog(null, "A porcentagem de alunos que visitou a biblioteca menos de 15 e mais de 10 vezes foi: "+porcent2);
        JOptionPane.showMessageDialog(null, "A porcentagem de alunos que visitou a biblioteca mais de 15 vezes foi: "+porcent3);
    }
    
}
