package Teste_05;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static String funcionarioComMaiorBeneficio(List<Funcionario> funcionarios, String mesAno) {
        String funcionarioComMaiorBeneficio = null;
        double maiorBeneficio = 0.0;

        for (Funcionario funcionario : funcionarios) {
            double beneficio = funcionario.calcularBeneficios(mesAno);
            if (beneficio > maiorBeneficio) {
                maiorBeneficio = beneficio;
                funcionarioComMaiorBeneficio = funcionario.getNome();
            }
        }

        return funcionarioComMaiorBeneficio;
    }

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Jorge Carvalho", "Secretário", "01/2018", 7000.0, 1000.0, 0.2));
        funcionarios.add(new Funcionario("Maria Souza", "Secretário", "12/2015", 7000.0, 1000.0, 0.2));
        funcionarios.add(new Funcionario("Ana Silva", "Vendedor", "12/2021", 12000.0, 1800.0, 0.3));
        funcionarios.add(new Funcionario("João Mendes", "Vendedor", "12/2021", 12000.0, 1800.0, 0.3));
        funcionarios.add(new Funcionario("Juliana Alves", "Gerente", "07/2017", 20000.0, 0.0, 0.0));
        funcionarios.add(new Funcionario("Bento Albino", "Gerente", "03/2014", 20000.0, 0.0, 0.0));

        String mesAno = "12/2021";
        String funcionario = funcionarioComMaiorBeneficio(funcionarios, mesAno);
        System.out.println("O funcionário que recebeu o maior valor em benefícios em " + mesAno + " foi: " + funcionario);
    }
}
