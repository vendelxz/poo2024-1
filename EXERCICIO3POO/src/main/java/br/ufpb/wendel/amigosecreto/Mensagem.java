package br.ufpb.wendel.amigosecreto;

public class Mensagem {
    private String texto;
    private String emailRemetente;
    private boolean anonima;

    public Mensagem(String texto, String emailRemetente, boolean anonima){
        this.texto = texto;
        this.emailRemetente = emailRemetente;
        this.anonima = anonima;

    }
    public Mensagem(){
        this("","", false);
    }
    public String getTexto(){
        return this.texto;
    }
    public void setTexto(String texto){
        this.texto = texto;
    }
    public String getTextoCompletoAExibir(){
        // Meteódo para ser implementado
    }
    public String getEmailRemetente(){
        return this.emailRemetente;
    }
    public void setEmailRemetente(String emailRemetente){
        this.emailRemetente = emailRemetente;
    }
    public boolean ehAnonima(){
        if (this.anonima){
            return true;
        }
        return false;
    }

}
