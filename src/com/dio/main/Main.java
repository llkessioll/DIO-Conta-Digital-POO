package com.dio.main;

import com.dio.entity.Conta;
import com.dio.entity.ContaCorrente;
import com.dio.entity.ContaPoupanca;

public class Main {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca poupanca = new ContaPoupanca();
		
		cc.depositar(100);
		
		cc.imprimir();
		
		poupanca.imprimir();
		
	}
}
