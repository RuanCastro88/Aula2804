package com.company;

public class Teste {
    public static void main(String[] args) {
        Escoteiro escoteiroJonas = new Escoteiro();
        Escoteiro escoteiroRobson = new Escoteiro();
        Escoteiro escoteiroThiago = new Escoteiro();

        escoteiroJonas.nome = "Jonas Miguel Oliveira";
        escoteiroJonas.turma = "Turma A";
        escoteiroJonas.idade = 24;

        escoteiroRobson.nome = " Robson Roberto De Moraes";
        escoteiroRobson.turma = " Turma B";
        escoteiroRobson.idade = 30;

        escoteiroThiago.nome = "Thiago Alberto da Silva";
        escoteiroThiago.turma = " Turma C";
        escoteiroThiago.idade = 18;

        escoteiroJonas.imprimir();
        escoteiroRobson.imprimir();
        escoteiroThiago.imprimir();
    }
}