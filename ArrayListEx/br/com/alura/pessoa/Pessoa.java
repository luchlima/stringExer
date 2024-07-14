package br.com.alura.pessoa;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }


    @Override
    public String toString() {
        return "Pessoa: " + this.nome + " (Idade: " + this.idade + ")";
    }
}

