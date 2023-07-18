/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.blackjack.modelo;

import com.mycompany.blackjack.base.Carta;
import com.mycompany.blackjack.io.IO;
import java.util.Arrays;

/**
 *
 * @author mateus menezes de oliveira
 */
public class Cartas21 extends Carta {

    private static final String[] valores = {"Ás", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"};

    public Cartas21(String nipe, String valor) {
        this.nipe = nipe;
        this.valor = valor;
    }

    @Override
    public String getNipe() {
        return nipe;
    }

    @Override
    public String getValor() {
        return valor;
    }

    @Override
    public int getPontuacao() {
        int index = Arrays.asList(valores).indexOf(valor);

        if (index >= 0 && index <= 8) {
            return index + 1;
        } else if (index >= 9) {
            return 10;
        }

        return 0;
    }

    @Override
    public void setPontuacao(int pontuacao) {
    }

    @Override
    public void exibir() {
        IO.print(valor + " de " + nipe);
    }

}
