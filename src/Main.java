import entity.Avaliacao;
import entity.Semestre;
import entity.enums.EAvalicoes;

public class Main {
    public static void main(String[] args) {
        Semestre semestre = new Semestre();

        Double[] notasProva1 = {8.0};
        Double[] pesosProva1 = {2.0};

        Double[] notasProva2 = {6.0};
        Double[] pesosProva2 = {2.0};

        Double[] notasTrabalho = {7.0, 8.0, 9.0};
        Double[] pesosTrabalho = {0.5, 0.3, 0.2};

        Double[] notasInterdisciplinar = {6.0, 5.0, 7.0, 8.0};
        Double[] pesosInterdisciplinar = {0.5, 0.5, 0.5, 0.5};

        semestre.addAvaliacao(new Avaliacao(EAvalicoes.PROVA, notasProva1, pesosProva1));
        semestre.addAvaliacao(new Avaliacao(EAvalicoes.PROVA, notasProva2, pesosProva2));
        semestre.addAvaliacao(new Avaliacao(EAvalicoes.TRABALHO, notasTrabalho, pesosTrabalho));
        semestre.addAvaliacao(new Avaliacao(EAvalicoes.INTERDICIPLINAR, notasInterdisciplinar, pesosInterdisciplinar));

        System.out.println("Média do Semestre: " + semestre.calcularMedia());
        System.out.println("Resultado: " + semestre.verificarAprovacao());
    }
}
