package br.ufpb.wendel.amigosecreto;

public class AmigoNaoSorteadoExcepetion extends Exception {
    public String getMessage(){
        return "Amigo não sorteado";
    }
}
