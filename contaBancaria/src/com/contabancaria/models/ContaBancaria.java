package com.contabancaria.models;

import java.util.Scanner;

public class ContaBancaria {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;



    public void transferir(double quantia){

        this.saldo += quantia;
    }

    public void sacar(double quantia){

        this.saldo -= quantia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
