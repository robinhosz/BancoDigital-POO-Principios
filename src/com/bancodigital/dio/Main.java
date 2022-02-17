package com.bancodigital.dio;

public class Main {

	public static void main(String[] args) {
		Cliente robson = new Cliente();
		robson.setNome("Robson");
		
		Conta cc = new ContaCorrente(robson, null, null);
		Conta poupanca = new ContaPoupanca(robson, null, null);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}