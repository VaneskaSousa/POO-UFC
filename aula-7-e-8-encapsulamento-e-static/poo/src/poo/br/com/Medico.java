package poo.br.com;

public class Medico extends Funcionario {

    private Especialidade especialidade;

    public Medico() {

    }

    public Medico(Long id, String nome, String endereco, String telefone, float valorDaHora, float cargaHoraria, Especialidade especialidade) {
        super(id, nome, endereco, telefone, valorDaHora, cargaHoraria);
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[ id=" + getId() +", nome=" + getNome() + ", endereço="
                + getEndereco() + ", telefone="+ getTelefone()
                + ", valor da hora ="+ getValorDaHora() + ", carga horaria="
                + getCargaHoraria() + ", especialidade="+ getEspecialidade().getNomeEspecialidade() + "]";
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
}
