package com.dio.entity;

public abstract class Conta {

	private int agencia;
	private int numero;
	private double saldo;
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferecia(double valor);
}
