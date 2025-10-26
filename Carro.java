// Integrantes da equipe:
// CLEYTON ESLEY GOMES FERREIRA
// AMANDA SILVINO DE MOURA SILVA
// MIRELLA RABELLO BEZERRA
// DÉBORA POLIANA DA SILVA
// KEYLLA PRISCILA ISIDIO DA SILVA

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String placa, String marca, String modelo, int ano, double valor, int numeroPortas) {
        super(placa, marca, modelo, ano, valor);
        setNumeroPortas(numeroPortas);
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        if (numeroPortas < 2 || numeroPortas > 5) {
            throw new IllegalArgumentException("Número de portas deve ser entre 2 e 5.");
        }
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularIpva() {
        return getValor() * 0.035;
    }

    @Override
    public String toString() {
        return "Carro: Placa: " + getPlaca() + ", Marca: " + getMarca() + ", Modelo: " + getModelo() +
               ", Ano: " + getAno() + ", Valor: R$" + getValor() + ", Portas: " + numeroPortas +
               ", IPVA: R$" + String.format("%.2f", calcularIpva());
    }
}