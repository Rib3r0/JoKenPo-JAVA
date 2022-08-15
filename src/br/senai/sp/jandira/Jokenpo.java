package br.senai.sp.jandira;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Random rand = new Random();
		
		int escolha;
		int escolhaPc = rand.nextInt(1, 4);
		
		System.out.println("*************************");
		System.out.println("********JOKENPÔ**********");
		
		System.out.println("Qual sua escolha?");
		System.out.println("1 -> Pedra");
		System.out.println("2 -> Papel");
		System.out.println("3 -> Tesoura");
		
		escolha = leitor.nextInt();
		
		//escolhas do jogador
		
		//escolha pedra
		if(escolha == 1) {
			System.out.println("Você escolheu Pedra");
		}
		//escolha papel
		if(escolha == 2) {
			System.out.println("Você escolheu Papel");
		}
		//escolha tesoura
		if(escolha == 3) {
			System.out.println("Você escolheu Tesoura");	
		}
		
		//esolhas do PC
		
		//escolha PC pedra
		if(escolhaPc == 1) {
			System.out.println("O PC escolheu Pedra");
		}
		//escolha PC papel
		if(escolhaPc == 2) {
			System.out.println("O PC escolheu Papel");
		}
		//escolha PC tesoura
		if(escolhaPc == 3) {
			System.out.println("O PC escolheu Tesoura");	
		}
		
		//resultados
		
		//empate
		if(escolha == escolhaPc) {
			System.out.println("!!!Empate!!!");
		}
		//pedra X papel
		if(escolha == 1 && escolhaPc == 2) {
			System.out.println("!!!Você perdeu!!!");	
		}
		//pedra X Tesoura
		if(escolha == 1 && escolhaPc == 3 ) {
			System.out.println("!!!Você ganhou!!!");	
		}
		//papel X pedra
		if(escolha == 2 && escolhaPc == 1) {
			System.out.println("!!!Você ganhou!!!");	
		}	
		//papel X tesoura
		if(escolha == 2 && escolhaPc == 3) {
			System.out.println("!!!Você perdeu!!!");	
		}
		//tesoura X pedra
		if(escolha == 3 && escolhaPc == 1) {
			System.out.println("!!!Você perdeu!!!");	
		}
		//tesoura X papel
		if(escolha == 3 && escolhaPc == 2) {
			System.out.println("!!!Você ganhou!!!");	
		}
			
	}

}
