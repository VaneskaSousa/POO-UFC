/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associacoes.classes;

/**
 *
 * @author SilvaVan
 */
public class RingGirl {
    private String nome;
    private String idade;
    
    public RingGirl(){
        nome = "Melissa";
        idade = "21";
    }
    
    public void ExibeCartaz(int round){
        System.out.println("A Ring Girl "+nome+" desfila exibindo o cartaz dando iniciao ao round "+round);
        System.out.println("Round "+round+" começou...");
    }
    
    //desisti da ideia de ter uma ring girl entre os rounds. fica no oradmap hehe
}
