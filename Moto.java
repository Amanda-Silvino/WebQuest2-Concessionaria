// Integrantes da equipe:
// CLEYTON ESLEY GOMES FERREIRA
// AMANDA SILVINO DE MOURA SILVA
// MIRELLA RABELLO BEZERRA
// DÉBORA POLIANA DA SILVA
// KEYLLA PRISCILA ISIDIO DA SILVA

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String marca, String modelo, int ano, double valor, int cilindradas) {
        super(placa, marca, modelo, ano, valor);
        setCilindradas(cilindradas);
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        if (cilindradas <= 0) {
            throw new IllegalArgumentException("Cilindradas devem ser positivas.");
        }
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularIpva() {
        return getValor() * 0.025;
    }

    @Override
    public String toString() {
        return "Moto: Placa: " + getPlaca() + ", Marca: " + getMarca() + ", Modelo: " + getModelo() +
               ", Ano: " + getAno() + ", Valor: R$" + getValor() + ", Cilindradas: " + cilindradas +
               ", IPVA: R$" + String.format("%.2f", calcularIpva());
    }
}