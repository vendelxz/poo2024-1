package br.ufpb.wendel.dcx.ex2;
import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class ProgramaLivro {
    public static void main(String [] args){
        ArrayList<Livro> livros = new ArrayList<>();
        boolean continuar  = true;
        do {
            try {
                String nome = JOptionPane.showInputDialog("Digite o nome do livro");
                String autor = JOptionPane.showInputDialog("Digite o nome do autor(a): ");
                Livro livro = new Livro(nome, autor);
                livros.add(livro);
                String sair = JOptionPane.showInputDialog("Deseja adicionar mais: (Sim ou Não)"); // Se sair sem perguntar a lista fica com apenas um livro!!
                if (sair.equalsIgnoreCase("sim")){
                    continuar = true;
                }else if (sair.equalsIgnoreCase("não")){
                    continuar = false;
                } else{
                    JOptionPane.showMessageDialog(null, "Digite corretamente!");
                    continuar = true;
                }


            }catch (IOException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }while (continuar);
        System.out.println(livros);

    }
}
