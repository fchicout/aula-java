package br.edu.uniaeso;

public class CalculadorDias {
    private final int DIAS_EM_UM_ANO = 365;
    private Pessoa pessoa;

    public CalculadorDias() {
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int totalDias(Pessoa pessoa) {
        return DIAS_EM_UM_ANO * pessoa.getIdade();
    }

}
