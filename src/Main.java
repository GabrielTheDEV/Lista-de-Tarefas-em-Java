import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean op = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("projeto criado por: GabrielTheDEV");
        System.out.println("Github : ~");
        System.out.println("Repositorio : ~");

        while(op != false){
            int option;
            System.out.println("==== LISTA DE TAREFA ====");
            System.out.println("   O que deseja fazer?   ");
            System.out.println("1. Ver minhas tarefas");
            System.out.println("2. Adicionar uma nova tarefa ");
            System.out.println("3. Finalizar");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    boolean op2 = true;
                    while(op2 != false) {
                        int option2;
                        System.out.println(" ");
                        System.out.println("==== LISTA DE TAREFA ====");
                        System.out.println("|TAREFAS :");
                        System.out.println("| > Estudar 2 horas -> STATUS : INCOMPLETO");
                        System.out.println(" ");
                        System.out.println("======== MENU ==========");
                        System.out.println("1. Concluir Tarefa");
                        System.out.println("2. Editar tarefa");
                        System.out.println("3. Voltar para o Menu principal");
                        option2 = sc.nextInt();
                        switch (option2){
                            case 1:
                                System.out.println("Escolher tarefa");
                                break;
                            case 2:
                                System.out.println("Escolher tarefa");
                                break;
                            case 3:
                                op2 = false;
                                break;
                            default:
                                System.out.println("Opção invalida campeão, digite uma opção valida");
                        }
                    }
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println("==== CRIAR TAREFA ====");
                    System.out.println("O que você pretende realizar?");

                    break;
                case 3: op = false;
                    System.out.println("PROGRAMA FINALIZADO!");

                    break;
                default:
                    System.out.println("Opção invalida , Digite uma opção valida campeão");
            }

        }
    }
}