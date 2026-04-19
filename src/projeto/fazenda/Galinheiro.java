package projeto.fazenda;

import java.time.LocalDate;

public class Galinheiro {

    // Atributos
    private String nome;
    private int qtdGalinha;
    private int qtdOvosDia;
    private LocalDate dataHoraCriacao;


    // Contrutor
    public Galinheiro(String nome, int qtdGalinha, int qtdOvosDia) {
        this.nome = nome;
        this.qtdGalinha = qtdGalinha;
        this.qtdOvosDia = qtdOvosDia;
        this.dataHoraCriacao = LocalDate.now();
    }


    public int calcularProducaoDiaria(){
        return this.qtdGalinha * qtdOvosDia;
    }

    public int calcularProducaoMensal() {
        return this.calcularProducaoDiaria() * 30;
    }

    public void mostrarInfo() {
        System.out.println("=============");
        System.out.println("Nome: " + this.nome);
        System.out.println("Quantidade de Galinhas: " + this.qtdGalinha );
        System.out.println("Quantidade de ovos por Dia por Galinha: " + this.qtdOvosDia);
        System.out.println("Data e hora da criação: " + this.dataHoraCriacao);
        System.out.println("Produção Diaria dos Ovos: " + this.calcularProducaoDiaria() + " ovos");
        System.out.println("Produção Mensal dos Ovos " + this.calcularProducaoMensal() + " ovos");


    }


    public LocalDate getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    public void setDataHoraCriacao(LocalDate dataHoraCriacao) {
        this.dataHoraCriacao = dataHoraCriacao;
    }

    public int getQtdOvosDia() {
        return qtdOvosDia;
    }

    public void setQtdOvosDia(int qtdOvosDia) {
        this.qtdOvosDia = qtdOvosDia;
    }

    public int getQtdGalinha() {
        return qtdGalinha;
    }

    public void setQtdGalinha(int qtdGalinha) {
        this.qtdGalinha = qtdGalinha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
