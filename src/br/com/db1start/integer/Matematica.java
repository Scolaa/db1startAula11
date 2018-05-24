package br.com.db1start.integer;

public class Matematica {

	private Integer valor1;
	private Integer valor2;
	private String par;
	private String impar;
	private Integer numero;

	public Matematica() {

	}

	public Matematica(Integer valor1, Integer valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public Integer getValor1() {
		return valor1;
	}

	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}

	public Integer getValor2() {
		return valor2;
	}

	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}

	public String getPar() {
		return par;
	}

	public void setPar(String par) {
		this.par = par;
	}

	public String getImpar() {
		return impar;
	}

	public void setImpar(String impar) {
		this.impar = impar;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer somar(Integer valor1, Integer valor2) {
		return valor1 + valor2;
	}

	public Integer subtrair(Integer valor1, Integer valor2) {
		return valor1 - valor2;
	}

	public Integer multiplicar(Integer valor1, Integer valor2) {
		return valor1 * valor2;
	}

	public Integer dividir(Integer valor1, Integer valor2) {
		return valor1 / valor2;
	}

}
