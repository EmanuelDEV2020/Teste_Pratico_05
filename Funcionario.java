package Teste_05;

public class Funcionario {

    private String nome;
    private String cargo;
    private String dataContratacao;
    private double salarioBase;
    private double beneficioFixo;
    private double percentualBeneficio;

    public Funcionario(String nome, String cargo, String dataContratacao, double salarioBase, double beneficioFixo, double percentualBeneficio) {
        this.nome = nome;
        this.cargo = cargo;
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.beneficioFixo = beneficioFixo;
        this.percentualBeneficio = percentualBeneficio;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double calcularBeneficios(String mesAno) {
        if (!dataContratacao.endsWith(mesAno)) {
            return 0.0;
        }

        double beneficios = 0.0;
        if (beneficioFixo > 0) {
            int anosContratado = 2024 - Integer.parseInt(dataContratacao.split("/")[1]);
            beneficios += beneficioFixo + (anosContratado * 1000);
            if (percentualBeneficio > 0) {
                beneficios += salarioBase * percentualBeneficio;
            }
        }

        return beneficios;
    }
}

