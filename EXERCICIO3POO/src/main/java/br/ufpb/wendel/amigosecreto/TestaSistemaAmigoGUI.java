package br.ufpb.wendel.amigosecreto;

import javax.swing.*;

public class TestaSistemaAmigoGUI {
    public static void main(String[] args){
        SistemaAmigo sistemaAmigo = new SistemaAmigo();
        try{
            int quant = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas irá participar? "));
            for(int k = 0;k<quant;k++){
                String nome = JOptionPane.showInputDialog("Digite o nome: ");
                String email = JOptionPane.showInputDialog("Digite o email: ");
                String desejaEnviar = JOptionPane.showInputDialog("Deseja enviar mensagem? ");
                sistemaAmigo.cadastraAmigo(nome,email);
                sistemaAmigo.sortear();
                for(Amigo a: sistemaAmigo.getAmigos()){
                    String emailAmigoSorteado = sistemaAmigo.pesquisaAmigoSecretoDe(a.getEmail());
                    System.out.println(a.getNome() + " ficou com: "+ emailAmigoSorteado);

                }
                if (desejaEnviar.equalsIgnoreCase("Sim")) {
                    String texto = JOptionPane.showInputDialog("O que deseja enviar?: ");
                    String emailE = JOptionPane.showInputDialog("Digite seu email novamente:");
                    sistemaAmigo.enviarMensagemParaTodos(texto, emailE, true);
                }


            }
        } catch (AmigoInexistenteException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch (AmigoNaoSorteadoExcepetion e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
