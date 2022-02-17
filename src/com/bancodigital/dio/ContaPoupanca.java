package com.bancodigital.dio;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente, String string, CodigoGerenteAgencia bbb) {
		super(cliente);
	}


	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}