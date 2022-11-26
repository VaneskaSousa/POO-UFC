package poo.br.com;

public class main {
    public static void main(String args[]){

        Especialidade e = new Especialidade();
        e.setId(1L);
        e.setNomeEspecialidade("Cardiologia");

        Medico m = new Medico();
        m.setEspecialidade(e);
        m.setId(1L);
        m.setNome("José Silva");
        m.setEndereco("Rua A");
        m.setTelefone("(00) 1001-0110");
        m.setCargaHoraria(220);
        m.setValorDaHora(130);

        float salario = m.calculaSalario(m.getValorDaHora(),m.getCargaHoraria());
        System.out.println(m);
        System.out.println("o salario é:" + salario);



    }

}
