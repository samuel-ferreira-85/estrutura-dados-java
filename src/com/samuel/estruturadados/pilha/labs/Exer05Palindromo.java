package com.samuel.estruturadados.pilha.labs;

import java.text.Normalizer;
import java.util.Stack;

public class Exer05Palindromo {

    public static void main(String[] args) {

        String palavra = "Socorram-me, subi no ônibus em Marrocos";

        String palavraTratada = palavra.replaceAll("[\\s.,;-]", "");

        palavraTratada = removeAccents(palavraTratada);

        System.out.println("A palavra/frase '" + palavra +"' é um palidromo? "
                + palindromo(palavraTratada.toLowerCase()));

    }

    private static boolean palindromo(String palavra) {
        Stack<Character> pilha = new Stack<>();
        Stack<Character> pilha1 = new Stack<>();
        Stack<Character> pilha2 = new Stack<>();


        char[] charArray = palavra.toCharArray();

        for (Character c : charArray) {
            pilha.add(c);
        }

        pilha2.addAll(pilha);

        while (!pilha.isEmpty()) {
            pilha1.push(pilha.pop());
        }

        StringBuilder sb = new StringBuilder();

        while (!pilha1.isEmpty()) {
            sb.append(pilha1.pop());
        }

        String s1 = sb.toString();

        sb = new StringBuilder();

        while (!pilha2.isEmpty()) {
            sb.append(pilha2.pop());
        }

        String s2 = sb.toString();

        if (s1.equals(s2)) return true;

        return false;
        }

    public static String removeAccents(String text) {
        String normalizedText = Normalizer.normalize(text, Normalizer.Form.NFD);
        String regex = "\\p{InCombiningDiacriticalMarks}+";
        return normalizedText.replaceAll(regex, "");
    }
}
