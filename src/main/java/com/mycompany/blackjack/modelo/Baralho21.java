/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.blackjack.modelo;

import com.mycompany.blackjack.base.Baralho;
import com.mycompany.blackjack.base.Carta;
import com.mycompany.blackjack.io.IO;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author mateus menezes de oliveira
 */
public class Baralho21 extends Baralho {

    private static final String[] nipes = {"Ouro", "Espada", "Copas", "Paus"};

    private static final String[] valores = {"Ás", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"};

    public Baralho21() {
        this.cartas = new ArrayList<>();
    }

    @Override
    public void gerarBaralho() {
        for (String nipe : nipes) {
            for (String valor : valores) {
                this.cartas.add(new Cartas21(nipe, valor));
            }
        }
    }

    @Override
    public void embaralhar() {
        Collections.shuffle(this.cartas);
    }

    public void gerarEmbaralho() {
        this.gerarBaralho();
        this.embaralhar();
    }

    @Override
    public Carta darCarta() {
        Carta ret = (Carta) this.cartas.remove(0);
        return ret;
    }

    @Override
    public ArrayList<Carta> darCartas() {
        ArrayList<Carta> ret = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ret.add(darCarta());
        }
        return ret;
    }

    @Override
    protected void exibirBaralho() {
        String listaCartas = "";
        int i = 0;

        for (Carta carta : this.cartas) {
            listaCartas += "\n" + i + " - " + carta.toString();
            i++;
        }

        IO.print(listaCartas);
    }

    @Override
    public void VerificarEPreencherBaralho() {
        if (this.cartas.isEmpty()) {
            this.gerarEmbaralho();
        }
    }

}
