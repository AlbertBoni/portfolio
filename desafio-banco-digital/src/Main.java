public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente albert = new Cliente();
        albert.setNome("Albert");

        Conta cc = new ContaCorrente(albert);
        banco.contas.add(cc);
        Conta poupanca = new ContaPoupanca(albert);
        banco.contas.add(poupanca);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        poupanca.sacar(50);

        banco.imprimirContas();
    }
}
