package com.example.aula.model;

public enum Posicao {
    GOLEIRO("Goleiro"),
    ZAGUEIRO("Zagueiro"),
    ALA_ESQUERDA("Ala esquerda"),
    ALA_DIREITA("Ala direita"),
    MEIA_DIREITA("Meia direita"),
    MEIA_ESQUERDA("Meia esquerda"),
    ATACANTE("Atacante");


    private String posicao_jogador;

    Posicao(String posicao_jogador) {
        this.posicao_jogador = posicao_jogador;
    }

    public String getPosicao_jogador() {
        return posicao_jogador;
    }
}
