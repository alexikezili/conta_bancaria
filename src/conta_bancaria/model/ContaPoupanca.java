package conta_bancaria.model;

public class ContaPoupanca extends Conta{
	
	private int aniversario;
	
	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = aniversario;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
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
