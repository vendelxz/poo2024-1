package br.ufpb.banco.uml;

public interface SistemaBanco {
    public void CadastraConta(String cpf, String nome);
    public boolean RemoveConta(String cpf, String nome) throws NomeInvalidoException;
    public void ProcuraPeloNome(String nome) throws NomeInvalidoException;

}
