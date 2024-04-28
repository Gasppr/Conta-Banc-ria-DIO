package com.contabancaria.models;

import java.util.Scanner;

public class ContaBancaria {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;


    public ContaBancaria() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        this.agencia = sc.next();

        System.out.println("Por favor, digite o número da conta!");
        this.numero = sc.nextInt();

        System.out.println("Por favor, digite o seu nome!");
        this.nomeCliente = sc.next();

        this.saldo = 0;

        System.out.println("Olá "+ this.nomeCliente + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é "+ this.agencia +", conta " + this.numero + " e seu saldo "+ this.saldo +" já está disponível" +
                " para saque");
    }



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
