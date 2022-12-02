package br.com.newtonpaiva.provaAv2exer2;

public class AchadoPerdido implements Publicacao {

    String titulo, descricao, foto, tipo, local_achado,data_hora, status;

    public AchadoPerdido(String titulo, String descricao, String foto, String tipo, String local_achado, String data_hora, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.foto = foto;
        this.tipo = tipo;
        this.local_achado = local_achado;
        this.data_hora = data_hora;
        this.status = status;
    }

    public void achadoPerdido(String titulo,String descricao,String tipo,String status ){

    }
    public void completaDados(String foto,String local_achado,String data_hora){

    }

    @Override
    public void BuscarTitulo() {

    }

    @Override
    public void visualizarDetalhes() {

    }
}
