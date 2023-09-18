package br.com.caelum.ed.conjuntos;

import java.util.List;

public class Teste {
    public static void main(String[] args) {
        ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");
        
        List<Object> palavras = conjunto.pegaTodas();
        
        System.out.println("- Antes de remover");
            for (Object palavra : palavras) {
        System.out.println(palavra);
        }

        conjunto.remove("Rafael");

        palavras = conjunto.pegaTodas();

        System.out.println("- Depois de remover");
        for (Object palavra : palavras) {
        System.out.println(palavra);
        }
    }
}
