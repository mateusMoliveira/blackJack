/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack.io;

import java.util.Scanner;

/**
 * Produz um objeto capaz de ler e escrever sentenças e valores de modo mais
 * estruturado e organizado que o System.out ou o Scanner padrão
 *
 * @author mateus menezes de oliveira
 */
public class IO {

    static private Scanner scan = new Scanner(System.in);

    /**
     * Imprime uma string ou qualquer objeto que será convertido para string por
     * meio do método .toString()
     *
     * @param obj Objeto a ser impresso por meio do método .toString()
     */
    public static void print(Object obj) {
        System.out.println(obj.toString());
    }

    /**
     * Método que Lê uma string via teclado, podendo exibir uma mensagem de
     * entrada anteriormente. Caso não deseje exibir nada, passe "" como
     * parâmetro
     *
     * @param msg Mensagem de exibição de entrada de dados pré-leitura
     * @return retorna uma String lida via teclado
     */
    public static String readString(String msg) {
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    /**
     * Método que lê um valor do tipo inteiro via teclado, contornando possíveis
     * leituras incorretas
     *
     * @param msg Mensagem de exibição de entrada de dados pré-leitura
     * @return returna um inteiro lido via teclado
     */
    public static int readInt(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                int var = Integer.parseInt(scan.nextLine());
                return var;
            } catch (Exception e) {
                print("Entrada incorreta. Digite um valor inteiro!");
            }
        }
    }

    /**
     * Método que lê um valor do tipo float via teclado, contornando possíveis
     * leituras incorretas
     *
     * @param msg Mensagem de exibição de entrada de dados pré-leitura
     * @return returna um float lido via teclado
     */
    public static float readFloat(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                float var = Float.parseFloat(scan.nextLine());
                return var;
            } catch (Exception e) {
                print("Entrada incorreta. Digite um valor real!");
            }
        }
    }

    /**
     * Método que lê um valor do tipo double via teclado, contornando possíveis
     * leituras incorretas
     *
     * @param msg Mensagem de exibição de entrada de dados pré-leitura
     * @return returna um double lido via teclado
     */
    public static double readDouble(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                double var = Double.parseDouble(scan.nextLine());
                return var;
            } catch (Exception e) {
                print("Entrada incorreta. Digite um valor real!");
            }
        }
    }

}
