/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.blackjack.modelo;

import com.mycompany.blackjack.base.Jogador;
import com.mycompany.blackjack.base.Carta;
import com.mycompany.blackjack.io.IO;
import java.util.ArrayList;

/**
 *
 * @author mateus menezes de oliveira
 */
public class Player extends Jogador {

    public Player() {
        this.maoJogador = new ArrayList<Carta>();
    }

    @Override
    public void comprarCarta(Carta carta) {
        this.maoJogador.add(carta);
    }

    @Override
    public void comprarCartas(ArrayList<Carta> cartas) {
        this.maoJogador = cartas;
    }

    public int getTotalMao() {
        int valorCartas = 0;

        for (Carta carta : this.maoJogador) {
            valorCartas += carta.getPontuacao();
        }
        return valorCartas;
    }

    @Override
    public void exibirMao() {
        int valorCartas = 0;
        int i = 0;

        for (Carta carta : this.maoJogador) {
            valorCartas += carta.getPontuacao();
            i++;
        }
        IO.print("Sua mão: " + valorCartas);
    }
}
