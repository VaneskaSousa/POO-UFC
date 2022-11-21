/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package associacoes;

import associacoes.classes.Luta;
import associacoes.classes.Lutador;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SilvaVan
 */
public class Associacoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[6];
        lutador[0] = new Lutador("Socorro@Deus", "BR", 18, 1.70, 80.3, 12, 3, 2);
        lutador[1] = new Lutador("Acaba Semestre", "BR", 18, 1.70, 80.3, 12, 3, 2);
        lutador[2] = new Lutador("Jason Mamoa", "BR", 18, 1.70, 80.3, 12, 3, 2);
        lutador[3] = new Lutador("Dwanyne Jonhson", "BR", 18, 1.70, 80.3, 12, 3, 2);
        lutador[4] = new Lutador("The Rock", "BR", 18, 1.70, 80.3, 12, 3, 2);
        lutador[5] = new Lutador("Other Strong Guy", "BR", 18, 1.70, 80.3, 12, 3, 2);

        Luta luta = new Luta();
        Random random = new Random(); //havia implementado para ser randomico mas devido ter exagerado nas regras a luta nao poderia acontecer, entao deixei fixo mesmo
        luta.marcarLuta(lutador[2], lutador[0]);
        luta.Lutar();
    }
    
}
