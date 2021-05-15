package me.victormoraes.exercicio01;

import java.text.ParseException;
import java.time.LocalDate;

public class TestePessoa {
    public static void main(String[] args) throws ParseException {
        // Testar o método imprimirDados
        Pessoa pessoa = new Pessoa();
        pessoa.setAltura("1,62");
        pessoa.setDataNasc("02/04/1982");
        pessoa.setNome("Lidianne");

        pessoa.imprimirDados();
        System.out.println(pessoa.calcularIdade());

    }
}
