package gerenciadorDeTarefas;

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

    public static void adicionarTarefa(List<String[]> tarefas) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a descrição da tarefa:");
        String descricao = input.next();
        String data = "30/09/24";
        String status = "pendente";
        String[] tarefa = {descricao, data, status};
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada!");
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
