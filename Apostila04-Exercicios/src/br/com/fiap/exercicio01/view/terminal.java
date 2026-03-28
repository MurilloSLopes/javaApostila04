package br.com.fiap.exercicio01.view;

import br.com.fiap.exercicio01.model.Aluno;

import java.util.Scanner;

public class terminal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Aluno aluno = new Aluno();

        //ler os dados do aluno
        System.out.println("Digite seu nome: ");
        aluno.nome = leitor.next() + leitor.nextLine() ;

        System.out.println("Digite sua CP1: ");
        aluno.cp1 = leitor.nextDouble();

        System.out.println("Digite sua CP2: ");
        aluno.cp2 = leitor.nextDouble();

        System.out.println("Digite sua gs: ");
        aluno.gs = leitor.nextDouble();

        System.out.println("Digite sua sprint1: ");
        aluno.sprint1 = leitor.nextDouble();

        System.out.println("Digite sua sprint2: ");
        aluno.sprint2 = leitor.nextDouble();

        //calcular media
        double mediaCp =  (aluno.cp1 + aluno.cp2)/2;
        double mediaSpr = (aluno.sprint1 + aluno.sprint2)/2;
        double gs = (aluno.gs);


        //Exibir a media
        System.out.println("Sua media da cp: " + mediaCp);

        System.out.println("Sua media da spr: " + mediaSpr);

        System.out.println("Sua nota da gs: " + gs);

        double media = aluno.calcularMedia();
        System.out.println("Media do " + aluno.nome + " = " + media);
    }
}
