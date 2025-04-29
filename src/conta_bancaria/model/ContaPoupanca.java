package conta_bancaria.model;

import java.time.LocalDate;

public class ContaPoupanca extends Conta{
	
	private LocalDate aniversario;
	
	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, LocalDate aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
	}

	public LocalDate getAniversario() {
		return aniversario;
	}

	public void setAniversario(LocalDate aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	public boolean sacar(float valor) {
		if (this.getSaldo() < valor) {
			System.out.println("Saldo insuficiente!");
			return false;
		} 
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversario da poupança: " + this.aniversario);
	}
}
