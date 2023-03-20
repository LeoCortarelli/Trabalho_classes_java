package TRABALHO;

public class Conta {

	public int numero;
	public double saldo;
	
	
	public String toString() {
		return "Numero Conta: " + numero + "\nSaldo: " + saldo;
	}
	
	public void debitaSaldo(double num) {
		this.saldo = this.saldo - num;
	}
	
	public void creditaSaldo(double num) {
		this.saldo = this.saldo + num;
	}

}
