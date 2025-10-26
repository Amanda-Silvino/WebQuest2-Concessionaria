// Integrantes da equipe:
// CLEYTON ESLEY GOMES FERREIRA
// AMANDA SILVINO DE MOURA SILVA
// MIRELLA RABELLO BEZERRA
// DÉBORA POLIANA DA SILVA
// KEYLLA PRISCILA ISIDIO DA SILVA

public abstract class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private double valor;

    public Veiculo(String placa, String marca, String modelo, int ano, double valor) {
        setPlaca(placa);
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setValor(valor);
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.trim().isEmpty()) {
            throw new IllegalArgumentException("Placa não pode ser nula ou vazia.");
        }
        this.placa = placa;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("Marca não pode ser nula ou vazia.");
        }
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("Modelo não pode ser nulo ou vazio.");
        }
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        if (ano < 1886 || ano > 2026) {
            throw new IllegalArgumentException("Ano deve estar entre 1886 e 2026.");
        }
        this.ano = ano;
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser positivo.");
        }
        this.valor = valor;
    }

    public double calcularIpva() {
        return valor * 0.04;
    }

    @Override
    public abstract String toString();
}