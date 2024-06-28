package Empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Funcionario> funcionarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Obter Funcionário por ID");
            System.out.println("3. Sair");
            System.out.print("Digite sua escolha: ");
          
            int escolha = scanner.nextInt();
            scanner.nextLine(); 

            switch (escolha) {
                case 1:
                    adicionarFuncionario();
                    break;
                case 2:
                    obterFuncionarioPorId();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Escolha inválida. Por favor, tente novamente.");
            }
        }
    }

    private static void adicionarFuncionario() {
        System.out.print("Digite o ID do Funcionário: ");
        String id = scanner.nextLine();
        System.out.print("Digite o Nome do Funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite as Alergias do Funcionário: ");
        String alergias = scanner.nextLine();
        System.out.print("Digite as Condições Médicas do Funcionário: ");
        String condicoesMedicas = scanner.nextLine();
        System.out.print("Digite o Telefone do Funcionário: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite o Email do Funcionário: ");
        String email = scanner.nextLine();

        Funcionario funcionario = new Funcionario(id, nome, alergias, condicoesMedicas, telefone, email);
        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado com sucesso.");
    }

    private static void obterFuncionarioPorId() {
        System.out.print("Digite o ID do Funcionário: ");
        String id = scanner.nextLine();
        Funcionario funcionario = encontrarFuncionarioPorId(id);
        if (funcionario != null) {
            System.out.println(funcionario);
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private static Funcionario encontrarFuncionarioPorId(String id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId().equals(id)) {
                return funcionario;
            }
        }
        return null;
    }
}
