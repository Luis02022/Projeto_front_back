package com.example.aula.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tab_jogador")
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;


    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @NotBlank(message = "Idade é obrigatório.")
    private String idade;

    @NotBlank(message = "Altura é obrigatória.")
    private String altura;

    @NotBlank(message = "Peso é obrigatório")
    private String peso;

    @Enumerated(EnumType.STRING)
    private Posicao posicao;

    @NotBlank(message = "Número da Camisa é obrigatório")
    private String camisa;


    public Jogador() {
    }

    public Jogador(Long id, String nome, Sexo sexo, String idade, String altura, String peso, Posicao posicao, String camisa) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.camisa = camisa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public @NotBlank(message = "Idade é obrigatório.") String getIdade() {
        return idade;
    }

    public void setIdade(@NotBlank(message = "Idade é obrigatório.") String idade) {
        this.idade = idade;
    }

    public @NotBlank(message = "Altura é obrigatória.") String getAltura() {
        return altura;
    }

    public void setAltura(@NotBlank(message = "Altura é obrigatória.") String altura) {
        this.altura = altura;
    }

    public @NotBlank(message = "Peso é obrigatório") String getPeso() {
        return peso;
    }

    public void setPeso(@NotBlank(message = "Peso é obrigatório") String peso) {
        this.peso = peso;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    public @NotBlank(message = "Número da Camisa é obrigatório") String getCamisa() {
        return camisa;
    }

    public void setCamisa(@NotBlank(message = "Número da Camisa é obrigatório") String camisa) {
        this.camisa = camisa;
    }
}
