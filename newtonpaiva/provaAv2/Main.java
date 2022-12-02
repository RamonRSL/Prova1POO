package br.com.newtonpaiva.provaAv2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Publicacao publ;
        RedeSocial rede;
        String dataCriacao, nomeUsuario, dataNascimento, senha;

        nomeUsuario = JOptionPane.showInputDialog(null, "Insira o nome de usuário: ","Usuário: ", JOptionPane.INFORMATION_MESSAGE);
        dataNascimento= JOptionPane.showInputDialog(null,"Insira sua data de nascimento: ", "Data Nascimento",1);
        senha= JOptionPane.showInputDialog(null,"Insira sua senha desejada: ","Senha", 1);
        dataCriacao=JOptionPane.showInputDialog(null,"Insira a data de hoje: ","Data",1);

        RedeSocial rs = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);

        String dataPublicacao, textoPublicacao, linkMidia;

        textoPublicacao=JOptionPane.showInputDialog(null,"Insira sua publicação: ","Publicação",1);
        dataPublicacao=JOptionPane.showInputDialog(null,"Qual a data de hoje: ","Data de Hoje",1);
        linkMidia=null;


       publ = new Publicacao(dataPublicacao, textoPublicacao, linkMidia);
       rede = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);
       rede.inserePublicacao(publ);

       rede.imprimePublicacoes();

    }
}
