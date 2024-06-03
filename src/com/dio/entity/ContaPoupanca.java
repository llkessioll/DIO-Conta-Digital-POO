package com.dio.entity;

public class ContaPoupanca extends Conta{

	public void imprimir() {
		System.out.println("======== Extrato conta Poupança ========");
		super.extrato();
	}
	
}
