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
                " sua agência é "+ this.agencia +", conta " + this.numero + " e seu saldo é de: R$"+ this.saldo );
    }


    public void sistema() {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        System.out.println("***************************************************");
        System.out.println("BEM-VINDO AO BANCO REDNATNAS!");
        while (op != 5){
            System.out.println("""
                    O que deseja fazer hoje?
                    
                    1 - Ver perfil
                    2 - Ver saldo
                    3 - Transferir
                    4 - Sacar
                    5 - Sair
                    """);
            op = sc.nextInt();

            if(op == 1) System.out.println(toString());
            else if(op == 2) System.out.println("Seu saldo atual é de: R$" + getSaldo());
            else if (op == 3) {

                System.out.println("Saldo atual: R$" + getSaldo());
                System.out.println("Quanto deseja tranferir para sua conta?");
                System.out.println("digite:");
                double valor = sc.nextDouble();
                if (valor > 0.0 ){
                    transferir(valor);
                    System.out.println("Transferencia concluída, seu saldo é de:" + getSaldo());
                }else System.out.println("Valores menores que 0 , não são possiveis de efetuar! tente novamente");
                System.out.println("**************************************************");
            }
            else if(op == 4){

                System.out.println("Saldo atual: R$" + getSaldo());
                System.out.println("Quanto deseja sacar da sua conta?");
                System.out.println("digite:");
                double valor = sc.nextDouble();
                if (valor < getSaldo() ){
                    sacar(valor);
                    System.out.println("Saque efetuado com sucesso, seu saldo atual é de: R$" + getSaldo());
                }else System.out.println("Valores maiores que seu saldo atual , não é possivel de efetuar!  tente novamente");
                System.out.println("**************************************************");

            } else if (op == 5) {
                System.out.println("Até uma próxima!");
                break;
            }
        }
    }



    public void transferir(double quantia){

        this.saldo += quantia;
    }

    public void sacar(double quantia){

        this.saldo -= quantia;
    }


    public String toString(){
        return "Nome: "+ this.nomeCliente +
        ", sua agência é "+ this.agencia +", conta: " + this.numero + " e seu saldo: "+ this.saldo;
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
