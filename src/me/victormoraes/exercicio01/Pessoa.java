package me.victormoraes.exercicio01;

import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

/**
 * Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de
 * nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um
 * método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade
 * da pessoa.
 */
public class Pessoa {

    private String nome;
    private String altura;
    private String dataNasc;

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimirDados() {
        System.out.println("nome: "+this.nome + "altura: "+ this.altura + "Data de nascimento: " + this.dataNasc);
    }

    public int calcularIdade() throws ParseException {
        String idade = this.dataNasc;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = sdf.parse(idade);
        Calendar c = Calendar.getInstance();
        c.setTime(d);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) +1;
        int date = c.get(Calendar.DATE);

        LocalDate ll = LocalDate.of(year, month, date);
        LocalDate now1 = LocalDate.now();
        Period diffl = Period.between(ll, now1);

        return diffl.getYears();
    }
}
