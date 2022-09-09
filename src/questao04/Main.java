package questao04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Filme [] filmes = new Filme[6];
        String nome;
        int duracao;
        boolean audio, legenda;
        int resposta1, resposta2;
        int mediaDuracao = 0;

        for (int i =0; i< filmes.length; i++){
            System.out.print("Nome do filme: ");
            nome = entrada.nextLine();

            System.out.print("Duração do filme (minutos): ");
            duracao = entrada.nextInt();

            System.out.print("O áudio é original? (1 - sim, 2 - não): ");
            resposta1 = entrada.nextInt();

            System.out.print("É legendado? (1- sim, 2 - não): ");
            resposta2 = entrada.nextInt();

            if(resposta1 == 1){
                audio = true;
            } else {
                audio = false;
            }

            if(resposta2 == 1){
                legenda = true;
            } else {
                legenda = false;
            }
            System.out.println("*********************************************");
            entrada.nextLine();

            Filme filmeTemp = new Filme(nome, duracao, audio, legenda);
            filmes[i] = filmeTemp;
            mediaDuracao += duracao;
        }

        mediaDuracao = (mediaDuracao/6);

        for (int i = 0; i < filmes.length; i ++){
            System.out.println("Nome do filme: " + filmes[i].getTitulo()+
                    "\nDuração do filme: " + filmes[i].getDuracaoHorasMinutos()+
                    "\nÁudio original: " + filmes[i].getAudioOriginal()+
                    "\nLegendado: " + filmes[i].getLegenda());

            if(filmes[i].getMinutos() >= mediaDuracao){
                System.out.print("Minutos acima da média: " + (filmes[i].getMinutos() - mediaDuracao));
            } else {
                System.out.print("Minutos abaixo da média: " + ((filmes[i].getMinutos() - mediaDuracao)* -1));
            }

            System.out.println("\n*********************************************");
        }
    }
}