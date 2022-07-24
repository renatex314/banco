package banco;

public class Main {

	public static void main(String[] args) {
		Cliente joao = new Cliente("joao");
		Cliente marcos = new Cliente("marcos");
		
		Conta cc = new ContaCorrente(joao);
		Conta poupanca = new ContaPoupanca(marcos);
		
		cc.depositar(10);
		cc.transferir(2, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
