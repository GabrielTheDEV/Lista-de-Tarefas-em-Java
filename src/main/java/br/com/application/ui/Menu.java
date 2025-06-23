package br.com.application.ui;

import br.com.application.dao.TaskDao;
import br.com.application.entity.model.Task;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    static TaskDao dao = new TaskDao();


    public static void mainMenu(){
        System.out.println("1. Ver Tarefas");
        System.out.println("2. Criar uma nova tarefa");
        System.out.println("3. Finalizar programa");
        int option = sc.nextInt();
        switch (option){
            case 1 -> taskListMenu();
            case 2 -> createTaskMenu();
            default -> System.out.println("Opção invalida, digite uma opção valida ");
        }
    }
    public static void createTaskMenu(){
        System.out.println("========= CRIAR TAREFAS =========");
        System.out.println("Quais são suas tarefas para hoje?");
        sc.nextLine();
        String text = sc.nextLine();
        dao.addTask( new Task(text));
        System.out.println("~~~~~~~~ Tarefa criada ~~~~~~~~~~");
        mainMenu();
    }
    public static void taskListMenu(){
        System.out.println("========= SUAS TAREFAS ===========");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("1. Editar tarefa");
        System.out.println("2. Marcar tarefa");
        System.out.println("3. Deletar tarefa");
        System.out.println("4. voltar para o menu principal");
        int option = sc.nextInt();
        switch (option){
            case 1 -> System.out.println("  ");
            case 2 -> System.out.println(" ");
            default -> System.out.println("Opção invalida, digite uma opção valida ");
        }
    }
    public static void x(){}
    public static void deleteTaskMenu(){
        System.out.println("TEM CERTEZA QUE DESEJA DELETAR? ");
        System.out.println("1. Sim");
        System.out.println("2. Não");
        int option = sc.nextInt();
        switch (option){
            case 1 -> System.out.println(" ");
            case 2 -> System.out.println(" ");
            default ->{
                System.out.println("Opção invalida, digite uma opção valida ");
                deleteTaskMenu();
            }
            }

        }
    }

}
