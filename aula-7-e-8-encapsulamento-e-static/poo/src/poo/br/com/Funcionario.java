package poo.br.com;

public class Funcionario extends Pessoa{

    private float valorDaHora;
    private float cargaHoraria;

    public Funcionario(Long id, String nome, String endereco, String telefone, float valorDaHora, float cargaHoraria) {
        super(id, nome, endereco, telefone);
        this.valorDaHora = valorDaHora;
        this.cargaHoraria = cargaHoraria;

    }

    public float getValorDaHora() {
        return valorDaHora;
    }

    public void setValorDaHora(float valorDaHora) {
        this.valorDaHora = valorDaHora;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public Funcionario(){
    }
    public float calculaSalario(float valorDaHora, float cargaHoraria){
        float salario = valorDaHora* cargaHoraria;
        return  salario;
    }


}
