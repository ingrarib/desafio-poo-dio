package br.com.dio.desafio.dominio;

public abstract class Conteudo {

   protected static final double XP_PADRAO = 10d; // static = posso acessar o XP_PADRAO fora da classe conteudo

    private String titulo;
    private String descricao;

    // criar método xp
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
