package br.ufpb.amigosecretohashmap.dcx;

public class MensagemParaTodos extends Mensagem {
    public MensagemParaTodos(String texto, String emailRemetente, boolean anonima){
        // O construtor usa os atributos da classe mãe
    }
    public String getTextoCompletoAExibir(){
        if(ehAnonima()){
            return  "Mensagem para todos. Texto: "+ this.getTexto();
        } return "Mensagem de: "+getEmailRemetente()+"Texto: "+getTexto();
    }
}
