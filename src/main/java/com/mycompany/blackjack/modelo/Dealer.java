/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.blackjack.modelo;

import com.mycompany.blackjack.base.Carta;
import com.mycompany.blackjack.io.IO;

/**
 *
 * @author mateus menezes de oliveira
 */
public class Dealer extends Player {

    @Override
    public void exibirMao() {
    }
    
    public void exibirMao(int fim_partida) {
        int valorCartas = 0;
        int i = 0;

        if (fim_partida == 1) {
            for (Carta carta : this.maoJogador) {
                valorCartas += carta.getPontuacao();
                i++;
            }
            IO.print("Dealer: " + valorCartas);
        } else {
            for (Carta carta : this.maoJogador) {
                if (i == 0) {
                } else {
                    valorCartas += carta.getPontuacao();
                }
                i++;
            }
            IO.print("Dealer: " + valorCartas);
        }
    }
}
