package br.com.exercicio3;

public class RevistaCientifica {
    private String titulo;
    private long issn;
    private String periodicidade;

    private Edicao edicoes;

    public RevistaCientifica(String titulo, long issn, String periodicidade, Edicao edicoes) {
        this.titulo = titulo;
        this.issn = issn;
        this.periodicidade = periodicidade;
        this.edicoes = edicoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getIssn() {
        return issn;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public Edicao getEdicoes() {
        return edicoes;
    }

    public void setEdicoes(Edicao edicoes) {
        this.edicoes = edicoes;
    }

    public void adicionaEdicao(Edicao edc){
        edicoes = edc;
    }
}
