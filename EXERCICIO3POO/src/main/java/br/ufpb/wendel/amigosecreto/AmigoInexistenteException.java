package br.ufpb.wendel.amigosecreto;

public class AmigoInexistenteException extends Exception {
    @Override
    public String getMessage() {
        return "Amigo inexistente";
    }
}
