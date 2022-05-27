
public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void rendimentoMensal(double saldo, double rendimento) {
		this.saldo = saldo + (saldo * rendimento);
	}
		
	@Override
	public void imprimirExtrato() {
		System.out.println("*** Extrato Conta Poupança ***");
		imprimirInfosComuns();
	}

	
}
