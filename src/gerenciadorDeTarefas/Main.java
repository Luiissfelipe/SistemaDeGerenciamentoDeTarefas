package gerenciadorDeTarefas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Menu do gerenciador de tarefas
    public static void mostrarMenu() {
        System.out.print("""
                
                GERENCIADOR DE TAREFAS
                
                [1] - Adicionar tarefa
                [2] - Remover tarefa
                [3] - Mudar status da tarefa
                [4] - Listar tarefas
                [5] - Salvar e sair
                
                Digite a opção desejada:
                """);
    }
    //Metodo para adicionar uma nova tarefa
    public static void adicionarTarefa(List<String[]> tarefas) {
        //Declarando o scanner
        Scanner input = new Scanner(System.in);

        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy");
        String dataFormatada = dataAtual.format(formato);

        System.out.println("Digite a descrição da tarefa:");
        //Lendo a descrição da tarefa
        String descricao = input.nextLine();
        //Definindo o status da tarefa como pendente
        String status = "PENDENTE";
        //Criando o vetor da tarefa adicionada
        String[] tarefa = {descricao, dataFormatada, status};
        //Adicionando a tarefa a lista de tarefas
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada!");
    }

    public static void listarTarefas(List<String[]> tarefas, String status) {
        switch (status){
            //Exibindo tarefas pendentes
            case "pendente":
                System.out.println("\nTodas tarefas pendentes:\n");
                for (int i = 0; i < tarefas.size(); i++) {
                    String[] tarefa = tarefas.get(i);
                    if (tarefa[2] == "PENDENTE") {
                        System.out.printf("%d. %s (Criada em: %s)\n", i + 1, tarefa[0], tarefa[1]);
                    }
                }
                break;
                //Exibindo tarefas concluidas
            case "concluida":
                System.out.println("\nTodas tarefas concluídas:\n");
                for (int i = 0; i < tarefas.size(); i++) {
                    String[] tarefa = tarefas.get(i);
                    if (tarefa[2] == "CONCLUÍDA") {
                        System.out.printf("%d. %s (Criada em: %s)\n", i + 1, tarefa[0], tarefa[1]);
                    }
                }
                break;
                //Exibindo todas tarefas
            case "todas":
                System.out.println("\nTodas tarefas cadastradas:\n");
                for (int i = 0; i < tarefas.size(); i++) {
                    //Declarando e acessando a tarefa na lista de tarefas
                    String[] tarefa = tarefas.get(i);
                    //Imprimindo cada tarefa da lista de tarefas
                    System.out.printf("%d. %s (Criada em: %s) - %s\n", i + 1, tarefa[0], tarefa[1], tarefa[2]);
                }
        }
    }
    
    public static void main(String[] args) {
        //Declaração das variáveis
        Scanner input = new Scanner(System.in);
        List<String[]> tarefas = new ArrayList<>();
        int opcao;

        //Loop para executar o código até que seja solicitado o fim
        do {

            mostrarMenu(); //Chamando o método para mostrar o menu
            opcao = input.nextInt(); // Lendo a opção escolhida

            switch (opcao) {
                case 1:
                    adicionarTarefa(tarefas);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("\nVocê digitou uma opção invalida!");
            }
        } while (opcao != 5);

    }
}
