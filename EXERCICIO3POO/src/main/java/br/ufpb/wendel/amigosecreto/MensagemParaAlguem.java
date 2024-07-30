package br.ufpb.wendel.amigosecreto;

public class MensagemParaAlguem extends Mensagem{
    private String emailDestinatario;

    public MensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean anonima){
        this.emailDestinatario = emailDestinatario;
    }
    public String getEmailDestinatario(){
        return this.emailDestinatario;
    }
    public void setEmailDestinatario(String emailDestinatario){
        this.emailDestinatario = emailDestinatario;
    }
    public String getTextoCompletoAExibir(){
        if(ehAnonima()){
            return "Mensagem para "+getEmailDestinatario()+" Texto: "+getTexto();
        } return "Mensagem de: "+getEmailRemetente()+" para: "+getEmailDestinatario();
    }

}
