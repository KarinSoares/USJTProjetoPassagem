package br.usjt.passagem;

/**
 * Created by asbonato on 8/30/15.
 */
public class Passagem implements Comparable<Passagem>{
    private String nome;
    private String imagem;
    private double preco;
    private String origem;
    private String destino;
    public static final String NAO_ENCONTRADA = "Não encontrada.";

    public Passagem(String nome, String origem, String destino, String imagem, double preco) {
        this.nome = nome;
        this.imagem = imagem;
        this.preco = preco;
        this.origem = origem;
        this.destino = destino;
    }

    public String getNome() {
        return nome;
    }

    public String getImagem() {
        return imagem;
    }

    public double getPreco() {
        return preco;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }


    @Override
    public String toString() {
        return "br.usjt.cervejap1.Passagem{" +
                "nome='" + nome + '\'' +
                ", imagem='" + imagem + '\'' +
                ", preco='" + preco + '\'' +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }

    @Override
    public int compareTo(Passagem passagem) {
        if (nome.equals(passagem.getNome())
                && origem.equals(passagem.getOrigem())
                && destino.equals(passagem.getDestino())) {
            return 0;
        }
        return this.getNome().compareTo(passagem.getNome());
    }
}
