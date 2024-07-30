package br.ufpb.banco.uml;

import java.util.Objects;

public class Banco implements ComparableB {

    private String cpf;
    private String nome;

    public Banco(String cpf, String nome){
    this.cpf = cpf;
    this.nome = nome;

    }
    public Banco(){
        this("","");
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banco banco = (Banco) o;
        return Objects.equals(cpf, banco.cpf) && Objects.equals(nome, banco.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, nome);
    }
    public int CompareTo(ComparableB comparableb){
        throw new UnsupportedOperationException("Error");
    }

    @Override
    public int compareTo(ComparableB o) {
        return 0;
    }
}
