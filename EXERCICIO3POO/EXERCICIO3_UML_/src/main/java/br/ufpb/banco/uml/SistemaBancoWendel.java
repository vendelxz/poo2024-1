package br.ufpb.banco.uml;

import java.util.ArrayList;
import java.util.List;

public abstract class  SistemaBancoWendel implements SistemaBanco{
   List<Banco> contas = new ArrayList<>();

    @Override
    public void CadastraConta(String cpf, String nome) {
        Banco banco =  new Banco(cpf, nome);
        contas.add(banco);

    }

    @Override
    public boolean RemoveConta(String cpf, String nome) throws NomeInvalidoException {
       for( Banco b: contas){
           if(b.equals(nome) & b.equals(cpf)){
               contas.remove(b);
               return true;
           }

           } throw new  NomeInvalidoException("Nome repassado foi inválido!");


    }

    @Override
    public void ProcuraPeloNome(String nome) throws NomeInvalidoException {
        for(Banco b: contas){
            if(b.equals(nome)){
                System.out.println(b.toString());
            }else {
                throw new NomeInvalidoException("Nome repassado foi inválido!");
            }
        }

    }
}
