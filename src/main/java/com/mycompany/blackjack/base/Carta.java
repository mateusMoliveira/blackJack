/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack.base;

/**
 *
 * @author mateus menezes de oliveira
 */
public abstract class Carta {
    
    protected String nipe;
    protected String valor;
    protected int pontuacao;
    

    public abstract String getNipe();    
    public abstract String getValor();
    public abstract int getPontuacao();
    public abstract void setPontuacao(int pontuacao);    
    public abstract void exibir();
    
    
}
