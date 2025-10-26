// Integrantes da equipe:
// CLEYTON ESLEY GOMES FERREIRA
// AMANDA SILVINO DE MOURA SILVA
// MIRELLA RABELLO BEZERRA
// DÉBORA POLIANA DA SILVA
// KEYLLA PRISCILA ISIDIO DA SILVA

import java.util.ArrayList;

public class Concessionaria {
    private ArrayList<Veiculo> veiculos;

    public Concessionaria() {
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        if (veiculo == null) {
            throw new IllegalArgumentException("Veículo não pode ser nulo.");
        }
        veiculos.add(veiculo);
    }

    public void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            System.out.println("Veículos na concessionária:");
            for (Veiculo veiculo : veiculos) {
                System.out.println(veiculo.toString());
            }
        }
    }

    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria();

        try {
            Carro carro1 = new Carro("ABC-1234", "Toyota", "Corolla", 2023, 120000.00, 4);
            Carro carro2 = new Carro("XYZ-5678", "Honda", "Civic", 2022, 110000.00, 4);
            Carro carro3 = new Carro("GHI-9012", "Ford", "Focus", 2021, 95000.00, 4);
            Moto moto1 = new Moto("DEF-3456", "Yamaha", "MT-03", 2023, 30000.00, 321);
            Moto moto2 = new Moto("JKL-7890", "Honda", "CB500", 2021, 35000.00, 500);
            Caminhao caminhao1 = new Caminhao("MNO-3456", "Volvo", "FH16", 2020, 500000.00, 6.0);

            concessionaria.adicionarVeiculo(carro1);
            concessionaria.adicionarVeiculo(carro2);
            concessionaria.adicionarVeiculo(carro3);
            concessionaria.adicionarVeiculo(moto1);
            concessionaria.adicionarVeiculo(moto2);
            concessionaria.adicionarVeiculo(caminhao1);

            concessionaria.listarVeiculos();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}