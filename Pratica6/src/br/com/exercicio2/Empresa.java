package br.com.exercicio2;

import java.util.List;
import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;
    private int qtdeFuncionarios;
    Funcionario[] funcionarios;
    private static int cont = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getQtdeFuncionarios() {
        return qtdeFuncionarios;
    }

    public void setQtdeFuncionarios(int qtdeFuncionarios) {
        this.qtdeFuncionarios = qtdeFuncionarios;
    }

    public Empresa(String nome, String cnpj, int qtdeFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtdeFuncionarios = qtdeFuncionarios;
        if(qtdeFuncionarios <= 100){
            this.qtdeFuncionarios = qtdeFuncionarios;
            funcionarios = new Funcionario[qtdeFuncionarios];
        }else {
            this.qtdeFuncionarios = 100;
            funcionarios = new Funcionario[100];
        }
    }

    public void adicionaFuncionario(Funcionario func){
        funcionarios[cont] = func;
        cont++;
    }
}