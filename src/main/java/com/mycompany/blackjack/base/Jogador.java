/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack.base;

import java.util.ArrayList;

/**
 *
 * @author mateus menezes de oliveira
 */
public abstract class Jogador {
    
    protected ArrayList<Carta> maoJogador;
    protected int numCartas;
    
    /**
     * Adiciona uma carta do baralho para a mão
     * @param carta carta comprada do baralho
     */
    public abstract void comprarCarta(Carta carta);
    /**
     * Adiciona uma lista de cartas 
     * @param cartas arraylist de cartas
     */
    public abstract void comprarCartas(ArrayList<Carta> cartas);
    /**
     * exibe lista de cartas
     * se for o dealer não exibe a primeira carta até o fim da jogada do player
     * se for o player exibe normalmente
     */
    public abstract void exibirMao();
    
}
