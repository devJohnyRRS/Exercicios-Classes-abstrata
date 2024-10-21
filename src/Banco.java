import java.util.ArrayList;
import java.util.List;

public class Banco {
    private int numInstrumentos;
    private List<InstrumentoFinanceiro> instrumentos = new ArrayList<>();

    public void adicionar(InstrumentoFinanceiro instrumento) {
        this.instrumentos.add(instrumento);
        this.numInstrumentos++;
    }

    public float calcularSaldos() {
        float total = 0;
        for (InstrumentoFinanceiro instrumento : this.instrumentos) {
            total += instrumento.calcularSaldoTotal();
        }
        return total;
    }

    public void main(String[] args) {
        
    }
}
