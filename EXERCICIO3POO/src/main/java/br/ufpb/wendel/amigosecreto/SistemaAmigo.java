package br.ufpb.wendel.amigosecreto;
import java.util.ArrayList;
import java.util.List;
public class SistemaAmigo extends Amigo  {
    private List<Mensagem> mensagens = new ArrayList<>();
    private List<Amigo> amigos = new ArrayList<>();

    public List<Mensagem> pesquisaMensagensAnonimas(){
        List<Mensagem> mensagensAnonimas = new ArrayList<>();
        for(Mensagem a: mensagens){
            if(a.ehAnonima() == true){
                mensagensAnonimas.add(a);
            }
        }
        return mensagensAnonimas;
    }
    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException{

    }
    public List <Mensagem> pesquisaTodasAsMensagens(){
        List<Mensagem> todasAsMensagens = new ArrayList<>();
        for (Mensagem a : mensagens){
            todasAsMensagens.add(a);
        }
        return todasAsMensagens;
    }
    public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException, AmigoNaoSorteadoExcepetion{

    }






}

