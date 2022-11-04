package br.com.exercicio3;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //variaveis de edicao
        int numero, volume, tiragem;
        String dataEdicao;
        //variveis de revista
        String titulo, periodicidade;
        long issn;
        //variaveis do artigo
        String tituloRevista, resumo, autores;

        tituloRevista = JOptionPane.showInputDialog("Titulo da revista");
        issn = Long.parseLong(JOptionPane.showInputDialog("ISSN"));
        periodicidade = JOptionPane.showInputDialog("Periodicidade");

        numero = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
        volume = Integer.parseInt(JOptionPane.showInputDialog("Volume"));
        tiragem = Integer.parseInt(JOptionPane.showInputDialog("Tiragem"));
        dataEdicao = JOptionPane.showInputDialog("Data da Edicao");

        Edicao ed1 = new Edicao(numero, volume, dataEdicao,tiragem);
        RevistaCientifica revista1 = new RevistaCientifica(tituloRevista, issn, periodicidade, ed1);

        ArrayList<Artigo> artigos = new ArrayList<>();
        for(int i = 0; i<10;i++){
            titulo = JOptionPane.showInputDialog("Digite Titulo do Artigo");
            resumo = JOptionPane.showInputDialog("Resumo");
            autores = JOptionPane.showInputDialog("Autores");
            artigos.add(new Artigo(titulo, resumo, autores));
            ed1.adicionaArtigo(artigos.get(i));
        }
    }
}
