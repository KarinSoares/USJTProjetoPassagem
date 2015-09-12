package br.usjt.passagem;

/**
 * Created by asbonato on 8/30/15.
 */
import java.util.ArrayList;
import java.util.TreeSet;

public class Especialista {
    private static final ArrayList<Passagem> PASSAGEM = cadastroDePassagens();

    public Especialista() {

    }

    private Passagem buscarNome(String nome) {
        for (Passagem passagem : PASSAGEM) {
            if (nome.equals(passagem.getNome())) {
                return passagem;
            }
        }
        return null;
    }

    public TreeSet<Passagem> listarPassagens(String origem, String destino) {
        TreeSet<Passagem> marcas = new TreeSet<Passagem>();

        if (origem.length() > 0 && destino.length() > 0) {
            marcas = buscarOrigemDestino(origem, destino);
        } else if (origem.length() > 0) {
            marcas = buscarOrigem(origem);
        } else if (destino.length() > 0) {
            marcas = buscarDestino(destino);
        } else {
            marcas = todas();
        }

        return marcas;
    }

    private TreeSet<Passagem> buscarOrigem(String origem) {
        TreeSet<Passagem> lista = new TreeSet<Passagem>();
        for (Passagem passagem : PASSAGEM) {
            if (origem.equals(passagem.getOrigem())) {
                lista.add(passagem);
            }
        }
        return lista;
    }

    private TreeSet<Passagem> buscarDestino(String destino) {
        TreeSet<Passagem> lista = new TreeSet<Passagem>();
        for (Passagem passagem : PASSAGEM) {
            if (destino.equals(passagem.getDestino())) {
                lista.add(passagem);
            }
        }
        return lista;
    }

    private TreeSet<Passagem> buscarOrigemDestino(String origem, String destino) {
        TreeSet<Passagem> lista = new TreeSet<Passagem>();
        for (Passagem passagem : PASSAGEM) {
            if (origem.equals(passagem.getOrigem())
                    && destino.equals(passagem.getDestino())) {
                lista.add(passagem);
            }
        }
        return lista;
    }   

    private TreeSet<Passagem> todas() {
        TreeSet<Passagem> lista = new TreeSet<Passagem>();
        for (Passagem passagem : PASSAGEM) {
            lista.add(passagem);
        }
        return lista;
    }

    private static ArrayList<Passagem> cadastroDePassagens() {
        ArrayList<Passagem> PASSAGEM = new ArrayList<Passagem>();
        PASSAGEM.add(new Passagem("C01", "São Paulo",
                "Rio de Janeiro", "cerveja001", 99.99));
        PASSAGEM.add(new Passagem("C02", "Rio de Janeiro",
                "Fortaleza", "cerveja002", 99.99));
        PASSAGEM.add(new Passagem("C03", "Fortaleza",
                "Curitiba", "cerveja003", 99.99));
        PASSAGEM.add(new Passagem("C04", "Curitiba",
                "São Paulo", "cerveja004", 99.99));

        return PASSAGEM;
    }
}