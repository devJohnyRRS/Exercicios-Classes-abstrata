public class FundoDeAplicacao extends InstrumentoFinanceiro {
    private float rentabilidade;

    public void setRentabilidade(float rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    @Override
    public float calcularSaldoTotal() {
        return this.getSaldo() * (1 + this.rentabilidade);
    }
}
