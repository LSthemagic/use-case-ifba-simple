package entity;

import entity.exceptions.AvaliacaoException;
import entity.exceptions.PesoException;

import java.util.ArrayList;
import java.util.List;

public class Semestre {
    private List<Avaliacao> avaliacaoList;

    public Semestre() {
        avaliacaoList = new ArrayList<>();
    }

    public void addAvaliacao(Avaliacao ava) {
        Double pesoTotal = 0.0;

        for (Avaliacao x : avaliacaoList) {
            pesoTotal += x.getTotalPeso();
        }

        if ((pesoTotal + ava.getTotalPeso()) > 7) {
            throw new PesoException("Peso total das avaliações não pode ultrapassar 7.");
        }

        avaliacaoList.add(ava);
    }

    public double calcularMedia() {
        double somaPontos = 0;
        double somaPesos = 0;

        for (Avaliacao avaliacao : avaliacaoList) {
            somaPontos += avaliacao.getQntdPnts();
            somaPesos += avaliacao.getTotalPeso();
        }

        return somaPontos / somaPesos;
    }

    public String verificarAprovacao() {
        double media = calcularMedia();
        return media >= 6.0 ? "APROVADO" : "REPROVADO";
    }
}
