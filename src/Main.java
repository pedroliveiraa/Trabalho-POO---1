import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = 4;
        // 01-Crie um sistema com um MENU com as seguintes opções:
        do {
            System.out.println("|         Menu Principal           |");
            System.out.println("|==================================|");
            System.out.println("|      1-Gerenciar ALUNOS          |");
            System.out.println("|      2-Gerenciar DISCIPLINAS     |");
            System.out.println("|      3-Gerenciar CURSOS          |");
            System.out.println("|      4-SAIR                      |");

        } while (opcao != 4);

        // 02-Crie um SUBMENU com as seguintes opções para a opção 1:
        System.out.println("|           Submenu                |");
        System.out.println("|==================================|");
        System.out.println("|      1-Cadastrar ALUNO           |");
        System.out.println("|      2-Consultar ALUNO           |");
        System.out.println("|      3-Remover DISCIPLINA        |");
        System.out.println("|      4-Atualizar DISCIPLINA      |");
        System.out.println("|      5-Voltar ao MENU INICIAL    |");

    }

}