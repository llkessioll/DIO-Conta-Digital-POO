package com.dio.entity;

public abstract class Conta implements MetodosConta{

	private int agencia = 1;
	private int numero;
	private double saldo = 0;
	
	public Conta() {
		this.numero ++;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -=valor;
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta conta) {
		this.sacar(valor);
		conta.depositar(valor);
	}
	
	protected void extrato() {
		System.out.println("Agencia: %d " + getAgencia());
		System.out.println("Numero: %d " + getNumero() );
		System.out.println("Saldo: %.2d " + getSaldo());
	}

	
}
