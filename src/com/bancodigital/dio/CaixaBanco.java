package com.bancodigital.dio;

import java.io.IOException;

public class CaixaBanco {
    public static void main(String[] args) throws IOException {

        String codigoGerente;
        String nomeCliente;

        System.out.println("Insira o Código do Gerente da Agência: ");
        codigoGerente = LeituraDados.lerLinha();
        System.out.println("Insira o Nome do Cliente: ");
        nomeCliente = LeituraDados.lerLinha();

        CodigoGerenteAgencia codigoGerenteAgencia = CodigoGerenteAgencia.valueOf(codigoGerente);

        ContaCorrente cc1 = new ContaCorrente(null, nomeCliente, codigoGerenteAgencia);

        ContaPoupanca cc2 = new ContaPoupanca(null, "Milene", CodigoGerenteAgencia.bbb);

        cc1.depositar(1000);

        cc1.transferir(100, cc2);

        cc2.depositar(500);

        cc1.imprimirExtrato();

        cc2.imprimirExtrato();

    }
}
