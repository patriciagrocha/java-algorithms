package S4.herancaEpolimorfismo;

public class ContaCorrente extends Conta implements Operavel {
    @Override
    protected double obterSaldoAtual() {
        return super.saldo; //super -> indica que veio da super-classe
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;

    }

    @Override
    public double sacar(double valor) {
        super.saldo -= valor;
        return super.saldo;
    }
}
