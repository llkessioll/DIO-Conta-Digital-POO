package com.dio.entity;

public interface MetodosConta {

	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta conta);
}
