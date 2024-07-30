package br.ufpb.wendel.amigosecreto;

import javax.swing.*;

public class TestaSistemaAmigo {
    public static void main(String[] args){
        SistemaAmigo sistema = new SistemaAmigo();
        //letra a
       sistema.cadastraAmigo("José", "jose@gmail.com");
        sistema.cadastraAmigo("Maria", "maria@gmail.com");

        //letra b
        try{
            sistema.configuraAmigoSecretoDe("José","Maria");
            sistema.configuraAmigoSecretoDe("Maria","José");
            //letra c & d
            sistema.enviarMensagemParaAlguem("Olá","maria@gmail.com","jose@gmail.com",true);
            sistema.enviarMensagemParaTodos("Olá","maria@gmail.com",true);
            //letra e

            //letra f
           if(sistema.pesquisaAmigoSecretoDe("jose@gmail.com").equals("maria@gmail.com")){
               System.out.println("OK!");
           }
            System.out.println("NÃO É!!");


        }catch (AmigoInexistenteException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }catch (AmigoNaoSorteadoExcepetion e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }





    }
}
