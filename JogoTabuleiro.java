package exercicio1;
import java.util.Random;
import java.util.Scanner;
public class JogoTabuleiro {
    public static void main(String[] args) {
        Random random = new Random();
        int dado1 = random.nextInt(7);
        int dado2 = random.nextInt(7);
        int soma = dado1 + dado2;
        System.out.println("Resultado do primeiro dado: " + dado1);
        System.out.println("Resultado do segundo dado: " + dado2);

        if (dado2 > dado1) {
            System.out.println("Jogador 2 começa a jogar.");
        } else if (dado1 > dado2) {
            System.out.println("Jogador 1 começa a jogar.");
        } else {
            System.out.println("Deu empate, jogue novamente. ");

        }
            int jogadorAtual = 1;
            if (jogadorAtual % 2 != 0) {
                Scanner scanner = new Scanner(System.in);
                int PosicaoJogador = 0;
                int dado;
                System.out.println("É a vez do jogador 1. Você começa na posição 0.");
                while (PosicaoJogador < 30) {
                    System.out.println("Jogue o dado.");
                    scanner.nextLine();

                    dado = (int) (Math.random() * 6) + 1;
                    System.out.println("Deu " + dado);

                    PosicaoJogador += dado;

                    if (PosicaoJogador == 2 || PosicaoJogador == 5 || PosicaoJogador == 8 || PosicaoJogador == 10 || PosicaoJogador == 14 || PosicaoJogador == 17 || PosicaoJogador == 20 || PosicaoJogador == 22 || PosicaoJogador == 27 || PosicaoJogador == 28) {
                        PosicaoJogador += 2;
                        System.out.println("Sortudo! Você caiu na casa verde, avance 2 casas.");

                    } else if (PosicaoJogador == 3 || PosicaoJogador == 4 || PosicaoJogador == 6 || PosicaoJogador == 12 || PosicaoJogador == 15 || PosicaoJogador == 19 || PosicaoJogador == 21 || PosicaoJogador == 24 || PosicaoJogador == 25 || PosicaoJogador == 30) {
                        PosicaoJogador -= 2;
                        System.out.println("Se deu mal! Você caiu na casa vermelho, volte 2 casas.");
                    } else if (PosicaoJogador == 7 || PosicaoJogador == 13 || PosicaoJogador == 23) {
                        System.out.println("Parabéns, você recebeu uma pista!");
                        if (PosicaoJogador == 7) {
                            System.out.println("A raposa estava escondida no celeiro à noite.");
                        } else if (PosicaoJogador == 13) {
                            System.out.println("Tinha penas de galinhas perto do lago.");
                        } else if (PosicaoJogador == 23) {
                            System.out.println("Você encontrou a raposa com um pé de galinha na boca!");

                        }
                    } else if (jogadorAtual % 2 == 0) {
                        System.out.println("É a vez do jogador 2.");
                        while (PosicaoJogador < 30) {
                            System.out.println("Jogue o dado.");
                            scanner.nextLine();

                            dado = (int) (Math.random() * 6) + 1;
                            System.out.println("Deu " + dado);

                            PosicaoJogador += dado;

                            if (PosicaoJogador == 2 || PosicaoJogador == 5 || PosicaoJogador == 8 || PosicaoJogador == 10 || PosicaoJogador == 14 || PosicaoJogador == 17 || PosicaoJogador == 20 || PosicaoJogador == 22 || PosicaoJogador == 27 || PosicaoJogador == 28) {
                                PosicaoJogador += 2;
                                System.out.println("Sortudo! Você caiu na casa verde, avance 2 casas.");

                            } else if (PosicaoJogador == 3 || PosicaoJogador == 4 || PosicaoJogador == 6 || PosicaoJogador == 12 || PosicaoJogador == 15 || PosicaoJogador == 19 || PosicaoJogador == 21 || PosicaoJogador == 24 || PosicaoJogador == 25 || PosicaoJogador == 30) {
                                PosicaoJogador -= 2;
                                System.out.println("Se deu mal! Você caiu na casa vermelho, volte 2 casas.");
                            } else if (PosicaoJogador == 7 || PosicaoJogador == 13 || PosicaoJogador == 23) {
                                System.out.println("Parabéns, você recebeu uma pista!");
                                if (PosicaoJogador == 7) {
                                    System.out.println("A raposa estava escondida no celeiro à noite.");
                                } else if (PosicaoJogador == 13) {
                                    System.out.println("Tinha penas de galinhas perto do lago.");
                                } else if (PosicaoJogador == 23) {
                                    System.out.println("Você encontrou a raposa com um pé de galinha na boca!");

                                }
                                {

                                }


                            }
                        }

                    }

                }
            }
        }
    }



