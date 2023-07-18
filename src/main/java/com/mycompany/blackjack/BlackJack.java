package com.mycompany.blackjack;

import com.mycompany.blackjack.io.IO;
import com.mycompany.blackjack.modelo.Baralho21;
import com.mycompany.blackjack.modelo.Dealer;
import com.mycompany.blackjack.modelo.Player;

/**
 *
 * @author mateus menezes de oliveira
 */


public class BlackJack {

    public static void main(String[] args) {
        IO.print("========================================");
        IO.print("Bem vindo ao jogo de Blackjack!\n");

        Baralho21 baralho = new Baralho21();
        Dealer dealer = new Dealer();
        Player player = new Player();

        baralho.gerarEmbaralho();

        String continuar = "sim";

        while (continuar.equalsIgnoreCase("sim")) {
            // Cada jogador começa com 2 cartas
            dealer.comprarCartas(baralho.darCartas());
            player.comprarCartas(baralho.darCartas());

            dealer.exibirMao(0);
            player.exibirMao();

            boolean fimDeJogo = false;

            // Turno do player
            while (true) {
                String input = IO.readString("Comprar outra carta? (Sim/Não):");
                if (input.equalsIgnoreCase("sim")) {
                    player.comprarCarta(baralho.darCarta());
                    player.exibirMao();
                    if (player.getTotalMao() > 21) {
                        IO.print("Você perdeu!");
                        fimDeJogo = true;
                        break;
                    }
                } else {
                    IO.print("Vez do dealer...");
                    break;
                }
            }

            dealer.exibirMao(1);
            if (dealer.getTotalMao() > player.getTotalMao() && !fimDeJogo) {
                IO.print("Dealer venceu!");
                fimDeJogo = true;
            }

            // Turno do dealer
            while ((dealer.getTotalMao() < 17 || dealer.getTotalMao() < player.getTotalMao()) && !fimDeJogo) {
                dealer.comprarCarta(baralho.darCarta());
                dealer.exibirMao(1);
            }

            int valorMaoJogador = player.getTotalMao();
            int valorMaoDealer = dealer.getTotalMao();

            IO.print("\nMãos:");
            dealer.exibirMao(1);
            player.exibirMao();

            // Verifica quem ganhou
            if (valorMaoDealer > 21 && !fimDeJogo) {
                IO.print("Você venceu!");
                fimDeJogo = true;
            }
            if (valorMaoJogador == valorMaoDealer && !fimDeJogo) {
                IO.print("Empate");
                fimDeJogo = true;
            }
            if (valorMaoJogador > valorMaoDealer && !fimDeJogo) {
                IO.print("Você venceu!");
                fimDeJogo = true;
            } else if (valorMaoJogador < valorMaoDealer && !fimDeJogo) {
                IO.print("Você perdeu!");
                fimDeJogo = true;
            }

            // Verificar se quer continuar o jogo
            continuar = IO.readString("Continuar o Jogo? (Sim/Não):");
            baralho.VerificarEPreencherBaralho();
            baralho.embaralhar();
            IO.print("\n\n");
        }
        IO.print("Fim do Jogo.");
    }
}
