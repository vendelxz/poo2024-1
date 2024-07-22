package br.ufpb.wendel.dcx.ex2;

import java.io.IOException;

public class Livro {
    private String nome;
    private String autor;

    public Livro(String nome, String autor) throws IOException {
        this.nome = nome;
        this.autor = autor;

    }
    public Livro() throws IOException {
        this("","");
    }

    public String getNome(){
        return this.nome;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setNome(String Nome){
        this.nome = Nome;
    }
    public void setAutor(String Autor){
        this.autor = Autor;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Livro livro = (Livro) object;
        return java.util.Objects.equals(nome, livro.nome) && java.util.Objects.equals(autor, livro.autor);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), nome, autor);
    }
    public String toString(){
        return "Livro de nome "+this.nome+" do autor(a) "+this.autor;
    }
}
