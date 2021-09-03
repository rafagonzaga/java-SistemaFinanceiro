public class SistemaFinanceiro {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setnome("Fulano");
        cliente.setSobrenome("de Tal");

//        Conta conta = new Conta(cliente);
        ContaCorrente contaCorrente = new ContaCorrente(cliente);

        System.out.println();
//        System.out.println("Número da conta: " + conta.getNumero());
//        System.out.println("Saldo da conta: " + conta.getSaldo());
//        System.out.println("Nome do titular: " + conta.getTitular().getNome());
//        System.out.println("Sobrenome do titular: " + conta.getTitular().getSobrenome());

        Conta novaContaCorrente = new ContaCorrente(cliente);
//        System.out.println();
//        System.out.println("Número da conta: " + novaContaCorrente.getNumero());
//        System.out.println("Saldo da conta: " + novaContaCorrente.getSaldo());
//        System.out.println("Nome do titular: " + novaContaCorrente.getTitular().getNome());
//        System.out.println("Sobrenome do titular: " + novaContaCorrente.getTitular().getSobrenome());

        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);
//        System.out.println();
//        System.out.println("Número da conta: " + contaPoupanca.getNumero());
//        System.out.println("Saldo da conta: " + contaPoupanca.getSaldo());
//        System.out.println("Nome do titular: " + contaPoupanca.getTitular().getNome());
//        System.out.println("Sobrenome do titular: " + contaPoupanca.getTitular().getSobrenome());

        CaixaEletronico caixa = new CaixaEletronico();
//        System.out.println("Saldo da conta corrente:");
//        caixa.consultarSaldo(contaCorrente);
//        System.out.println("Saldo da conta poupança:");
//        caixa.consultarSaldo(contaPoupanca);

        ContaEspecial contaEspecial = new ContaEspecial(cliente);

        caixa.consultarSaldo(contaCorrente);
        contaCorrente.depositar(1000);
        caixa.consultarSaldo(contaCorrente);
        contaCorrente.sacar(200);
        caixa.consultarSaldo(contaCorrente);

        caixa.consultarSaldo(contaPoupanca);
        contaPoupanca.depositar(2000);
        caixa.consultarSaldo(contaPoupanca);
        contaPoupanca.sacar(300);
        caixa.consultarSaldo(contaPoupanca);

        caixa.consultarSaldo(contaEspecial);
        contaEspecial.depositar(10000);
        caixa.consultarSaldo(contaEspecial);
        contaEspecial.sacar(500);
        caixa.consultarSaldo(contaEspecial);

    }

}
