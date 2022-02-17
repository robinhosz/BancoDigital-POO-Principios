package com.bancodigital.dio;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente, String nomeCliente, CodigoGerenteAgencia codigoGerenteAgencia) {
		super(cliente);
	}



public void imprimirExtrato() {
    System.out.println("\n*********** Extrato Conta Corrente ***********");
    super.imprimirInfosComuns();
}

}