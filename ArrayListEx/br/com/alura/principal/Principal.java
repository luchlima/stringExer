package br.com.alura.principal;

import br.com.alura.pessoa.Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Lucas", 24);
        Pessoa pessoa2 = new Pessoa("Amanda", 21);
        Pessoa pessoa3 = new Pessoa("Sophia", 15);

        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);

        System.out.println(listaPessoas.size());
        System.out.println(listaPessoas.get(1));
        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaPessoas){
            System.out.println(pessoa);
        }
    }
}
