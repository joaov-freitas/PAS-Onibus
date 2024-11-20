package Controller;

import java.util.ArrayList;
import java.util.Scanner;
import Model.*;
import Model.Exceptions.*;

public class MainController {

    public MainController() {
        SistemaViagemService sistema = new SistemaViagemService();
        boolean menu = true;
        Scanner scanner = new Scanner(System.in);

        while (menu) {
            System.out.println("-------- Cadastro de Viagens --------");
            System.out.println("1 - Cadastrar Ônibus");
            System.out.println("2 - Cadastrar Motorista");
            System.out.println("3 - Cadastrar Passageiro");
            System.out.println("4 - Cadastrar Rota");
            System.out.println("5 - Sair");

            System.out.print("\nEscolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    try {
                        System.out.print("Informe a placa do ônibus: ");
                        String placa = scanner.nextLine();

                        System.out.print("Informe a quantidade de assentos no ônibus: ");
                        int qtdLugares = scanner.nextInt();
                        scanner.nextLine(); // Limpa o buffer

                        System.out.print("Informe a classe: ");
                        String classe = scanner.nextLine();

                        float custo = 0;
                        boolean custoValido = false;
                        while (!custoValido) {
                            System.out.print("Informe o custo do ônibus: ");
                            if (scanner.hasNextFloat()) {
                                custo = scanner.nextFloat();
                                custoValido = true;
                            } else {
                                System.out.println("Valor inválido! Insira um número válido.");
                                scanner.next(); // Descarta a entrada inválida
                            }
                        }
                        scanner.nextLine(); // Limpa o buffer

                        Onibus onibus = new Onibus(placa, qtdLugares, classe, custo);
                        sistema.cadastrarOnibus(onibus);

                        System.out.println("Ônibus cadastrado com sucesso!");
                    } catch (CadastroDuplicadoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:

                    System.out.print("Informe o CPF do motorista: ");
                    String cpf = scanner.nextLine();

                    System.out.print("Informe o nome do motorista: ");
                    String nome = scanner.nextLine();

                    System.out.print("Informe a idade do motorista: ");
                    int idade = scanner.nextInt();

                    scanner.nextLine(); // Limpa o buffer

                    System.out.print("Informe o valor da diária do motorista: ");
                    float valor_diaria = scanner.nextFloat();

                    scanner.nextLine(); // Limpa o buffer

                    try {
                        Motorista motorista = new Motorista(cpf, nome, idade, valor_diaria);
                        sistema.cadastrarMotorista(motorista);
                    } catch (CadastroDuplicadoException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 3:
                    System.out.print("Informe o CPF do passageiro: ");
                    cpf = scanner.nextLine();

                    System.out.print("Informe o nome do passageiro: ");
                    nome = scanner.nextLine();

                    System.out.print("Informe o email do passageiro: ");
                    String email = scanner.nextLine();

                    try {
                        Passageiro passageiro = new Passageiro(cpf,nome,email);
                        sistema.cadastrarPassageiro(passageiro);
                    } catch (CadastroDuplicadoException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case 4:
                    System.out.print("Informe a origem da rota: ");
                    String origem = scanner.nextLine();

                    System.out.print("Informe o destino da rota: ");
                    String destino = scanner.nextLine();

                    ArrayList<Trecho> lista_trechos = new ArrayList<Trecho>();

                    while (menu) {
                        System.out.println("1 - Cadastrar trecho");
                        System.out.println("2 - Finalizar cadastro de rota");
                        System.out.print("\nEscolha uma opção: ");
                        int opcao2 = scanner.nextInt();
                        scanner.nextLine(); // Limpa o buffer

                        switch (opcao2) {
                            case 1:
                                System.out.print("Informe a origem do trecho: ");
                                String inicio = scanner.nextLine();

                                System.out.print("Informe o destino do trecho: ");
                                String fim = scanner.nextLine();

                                System.out.print("Informe as horas de duração do trecho: ");
                                int horas = scanner.nextInt();
                                scanner.nextLine(); // Limpa o buffer

                                System.out.print("Informe os minutos de duração do trecho: ");
                                int minutos = scanner.nextInt();
                                scanner.nextLine(); // Limpa o buffer

                                System.out.print("Informe o custo do trecho: ");
                                float custo = scanner.nextFloat();
                                scanner.nextLine(); // Limpa o buffer

                                try {
                                    Trecho trecho = new Trecho(inicio, fim, horas, minutos,custo);
                                    lista_trechos.add(trecho);
                                    System.out.println("Trecho cadastrado com sucesso!");
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                                break;
                            case 2:
                                menu = false;
                                break;
                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                                break;
                        }
                        menu = true;
                        
                    }

                    try {
                        
                        Rota rota = new Rota(origem, destino, lista_trechos);
                        sistema.cadastrarRota(rota);

                        System.out.println("Rota cadastrada com sucesso!");
                    } catch (CadastroDuplicadoException e) {
                        System.out.println(e.getMessage());
                    } catch (RotaInvalidaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    menu = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}
