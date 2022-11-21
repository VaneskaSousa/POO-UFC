/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associacoes.classes;

/**
 *
 * @author SilvaVan
 */

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (desafiado.getCategoria().equalsIgnoreCase(desafiante.getCategoria())
                && !desafiado.equals(desafiante)) {

            setAprovada(true);
            this.desafiado = desafiado;
            this.desafiante = desafiante;

        } else {
            setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }

    }

    public void Lutar() {

        if (this.getAprovada() == true) {
            System.out.println("### DESAFIADO ##");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

        } else {

            System.out.println("Essa luta não pode acontecer");
        }

        int vencedor = (int) Math.round(Math.random() * 10);
        if (getDesafiado().getDerrotas() > getDesafiante().getDerrotas()) {
            switch (vencedor) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("O vencedor foi: " + this.getDesafiante().getNome());
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;

                case 6:
                    System.out.println("Empate!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();

                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("O vencedor foi: " + this.getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();

            }

        } else if (this.getDesafiado().getDerrotas() < this.getDesafiante().getDerrotas()) {
            switch (vencedor) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("O vencedor foi: " + getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;

                case 6:
                    System.out.println("Empate!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();

                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("O vencedor foi: " + getDesafiante().getNome());
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();

            }
        } else {
            System.out.println("ERRO");
        }

    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

}
