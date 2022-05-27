
public class Main {

	public static void main(String[] args) {

		Cliente fernando = new Cliente();
		fernando.setNome("Fernando do Amaral Guimarães");
		
		ContaCorrente cc = new ContaCorrente(fernando);
		ContaPoupanca poupanca = new ContaPoupanca(fernando);
		
		cc.depositar(1000);	
		cc.transferir(500, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		poupanca.rendimentoMensal(poupanca.getSaldo(), 0.02);
		
		System.out.println("EXTRATO APÓS RENDIMENTOS");
		poupanca.imprimirExtrato();
	}

}
