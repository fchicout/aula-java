package br.edu.uniaeso;

public class Pessoa {
    private int idade;
    private String nome;

    public Pessoa(){
        setIdade(0);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
