package com.bytebank.test;

import clase2.com.bytebank.modelo.Cuenta;
import clase2.com.bytebank.modelo.CuentaCorriente;

public class testLibreria {
	public static void main(String[] args) {
		Cuenta cuenta = new CuentaCorriente(12,12);
		cuenta.depositar(2000);
		System.out.println(cuenta.getSaldo());
		
		
		
	}
}
