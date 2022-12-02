package br.com.newtonpaiva.provaAv2;

import javax.swing.*;
import java.util.ArrayList;

public class RedeSocial {
    private String dataCriacao, nomeUsuario, dataNascimento, senha;
    String dataPublicacao, textoPublicacao,linkMidia;

    ArrayList<Publicacao> publicacoes = new ArrayList<> ();

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {

        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }


    public void inserePublicacao(Publicacao publi){
        publi = new Publicacao(dataPublicacao, textoPublicacao, linkMidia);
        publicacoes.add(publi);
    }

     public void imprimePublicacoes(){
        for (Publicacao p: publicacoes ){
            JOptionPane.showMessageDialog(null,"Data publicação: " + p.getDataPublicacao() + "\nTexto Publicação: " + p.getTextoPublicacao());
        }
      }

}
