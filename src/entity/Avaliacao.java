package entity;

import entity.enums.EAvalicoes;

public class Avaliacao {
    private EAvalicoes avaliacoes;
    private Double[] pesos;
    private Double[] notas;
    private Double qntdPnts;

    public Avaliacao(EAvalicoes avaliacoes, Double[] notas, Double[] pesos) {
        this.avaliacoes = avaliacoes;
        this.notas = notas;
        this.pesos = pesos;
        this.qntdPnts = calcularQuantidadePontos();
    }

    public EAvalicoes getAvalicoes() {
        return avaliacoes;
    }

    public Double[] getPesos() {
        return pesos;
    }

    public Double[] getNotas() {
        return notas;
    }

    public Double getQntdPnts() {
        return qntdPnts;
    }

    public Double getTotalPeso() {
        double totalPeso = 0.0;
        for (Double peso : pesos) {
            totalPeso += peso;
        }
        return totalPeso;
    }

    private Double calcularQuantidadePontos() {
        Double somaPontos = 0.0;
        for (int i = 0; i < notas.length; i++) {
            somaPontos += notas[i] * pesos[i];
        }
        return somaPontos;
    }
}
