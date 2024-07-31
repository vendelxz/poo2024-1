package br.ufpb.wendel.amigosecreto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SistemaAmigo extends Amigo  {
    private List<Mensagem> mensagens = new ArrayList<>();
    private List<Amigo> amigos = new ArrayList<>();

    public List<Mensagem> pesquisaMensagensAnonimas(){
        List<Mensagem> mensagensAnonimas = new ArrayList<>();
        for(Mensagem a: mensagens){
            if(a.ehAnonima() ){
                mensagensAnonimas.add(a);
            }
        }
        return mensagensAnonimas;
    }

    public void cadastraAmigo(String nome, String email){
        Amigo amigo = new Amigo(nome, email);
        amigos.add(amigo);
    }

    public void enviarMensagemParaTodos(String texto, String emailRemetente, boolean ehAnonima){
        MensagemParaTodos m = new MensagemParaTodos(texto, emailRemetente, ehAnonima);
        mensagens.add(m);
    }
    public void enviarMensagemParaAlguem(String texto, String emailRemetente, String emailDestinatario, boolean ehAnonima){
        MensagemParaAlguem m = new MensagemParaAlguem(texto, emailRemetente, emailDestinatario, ehAnonima);
        mensagens.add(m);
    }
    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws AmigoInexistenteException{
        for( Amigo a: amigos){
            if(a.getEmail().equals(emailDaPessoa)){
                a.setEmailAmigoSorteado(emailAmigoSorteado);

            }
        } throw new AmigoInexistenteException("Amigo Inexistente");

    }
    public List <Mensagem> pesquisaTodasAsMensagens(){
        List<Mensagem> todasAsMensagens = new ArrayList<>();
        for (Mensagem a : mensagens){
            todasAsMensagens.add(a);
        }
        return todasAsMensagens;
    }
    public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException, AmigoNaoSorteadoExcepetion{
        for (Amigo a: amigos){
            if(a.getEmail().equals(emailDaPessoa)){

                if(a.getEmailAmigoSorteado()!= null){
                    return a.getEmailAmigoSorteado();
                } throw new AmigoNaoSorteadoExcepetion("Amigo não sorteado!");
            }
        } throw new AmigoInexistenteException("Amigo inexistente");
    }

    public void sortear(){
        List<Amigo> brothersNaoSorteados = new ArrayList<>(this.amigos);
        Collections.shuffle(brothersNaoSorteados);
        for(Amigo a: amigos){
            int posicaoListaSorteada = (int) (Math.random() * brothersNaoSorteados.size());

            while(a.getEmail().equals(brothersNaoSorteados.get(posicaoListaSorteada).getEmail())){
                posicaoListaSorteada = (int) (Math.random() * brothersNaoSorteados.size());
            }
            Amigo amigoSorteado = brothersNaoSorteados.get(posicaoListaSorteada);
            a.setEmailAmigoSorteado(amigoSorteado.getEmail());
            brothersNaoSorteados.remove(posicaoListaSorteada);
        }

    }

    public List<Amigo> getAmigos() {
        return amigos;
    }
}

