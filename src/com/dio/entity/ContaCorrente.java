package com.dio.entity;

public class ContaCorrente extends Conta {

	public void imprimir() {
		System.out.println("======== Extrato conta Corrente ========");
		super.extrato();
	}
}
