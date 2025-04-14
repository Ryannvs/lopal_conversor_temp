package br.dev.marcos.temperatura.model;

import java.util.Set;

public class Temperatura {
	private double celsius;

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	public double getCelsius() {
		return celsius;
	}

	// Conversão para Fahrenheit
	public double converterParaKelvin() {
		double kelvin = (celsius * 9 / 5) + 32;
		return kelvin;
	}

	// Conversão para Kelvin
	public double converterParaFahreinheit() {
		double fahreinheit = celsius + 273.15;
		return fahreinheit;
	}

}
