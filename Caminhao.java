// Integrantes da equipe:
// CLEYTON ESLEY GOMES FERREIRA
// AMANDA SILVINO DE MOURA SILVA
// MIRELLA RABELLO BEZERRA
// DÉBORA POLIANA DA SILVA
// KEYLLA PRISCILA ISIDIO DA SILVA

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String placa, String marca, String modelo, int ano, double valor, double capacidadeCarga) {
        super(placa, marca, modelo, ano, valor);
        setCapacidadeCarga(capacidadeCarga);
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        if (capacidadeCarga <= 0) {
            throw new IllegalArgumentException("Capacidade de carga deve ser positiva.");
        }
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularIpva() {
        if (capacidadeCarga <= 5) {
            return getValor() * 0.02;
        } else {
            return getValor() * 0.03;
        }
    }

    @Override
    public String toString() {
        return "Caminhão: Placa: " + getPlaca() + ", Marca: " + getMarca() + ", Modelo: " + getModelo() +
               ", Ano: " + getAno() + ", Valor: R$" + getValor() + ", Capacidade de Carga: " + capacidadeCarga +
               " toneladas, IPVA: R$" + String.format("%.2f", calcularIpva());
    }
}