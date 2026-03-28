package br.com.fiap.exercicio01.model;

public class Aluno {
    public String nome;
    public  double cp1, cp2, sprint1, sprint2, gs;

    //Criação do método
    public double calcularMedia (){
        double mediaCp = (cp1 + cp2 )/2;
        double mediaSpr = (sprint1 + sprint2)/2;
        double mediaFinal = mediaCp * 0.2  + mediaSpr * 0.2 + gs * 0.6;
        return mediaFinal;
    }

}
