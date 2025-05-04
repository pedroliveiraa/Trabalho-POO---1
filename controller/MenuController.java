package controller;

import java.util.Scanner;
import view.MenuView;
import view.SubMenuAlunoView;
import view.SubMenuCursoView;
import view.SubMenuDisciplinaView;

public class MenuController {

    public static void GerenciaMenu() {

        Scanner scan = new Scanner(System.in);
        int opcao = -1;

        do {
            MenuView.ImprimeMenu();
            System.out.print("Infome uma das opções: ");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1 -> GerenciaSubMenuAluno();
                case 2 -> GerenciaSubMenuDisciplina();
                case 3 -> GerenciaSubMenuCurso();
            }
        } while (opcao != 4);

    }

    public static void GerenciaSubMenuAluno() {
        Scanner scan = new Scanner(System.in);
        int opcao = -1;

        do {
            SubMenuAlunoView.ImprimeSubmenu();
            System.out.print("Infome uma das opções: ");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1 -> AlunoController.Cadastrar();
                case 2 -> AlunoController.Consultar();
                case 3 -> AlunoController.Remover();
                case 4 -> AlunoController.Atualizar();
            }
        } while (opcao != 5);
    }

    public static void GerenciaSubMenuDisciplina() {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        do
        {
            SubMenuDisciplinaView.ImprimeSubmenu();
            System.out.print("Informe uma das opções: ");
            opcao = scanner.nextInt();
            switch (opcao)
            {
                case 1 -> DisciplinaController.cadastrardisciplina();
                case 2 -> DisciplinaController.consultardisciplina();
                case 3 -> DisciplinaController.removerdisciplina();
                case 4 -> DisciplinaController.atualizardisciplina();
            }
        }
        while (opcao != 5);
    }

    public static void GerenciaSubMenuCurso() {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        do {
            SubMenuCursoView.ImprimeSubmenu();
            System.out.print("Informe uma das opções: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1 -> CursoController.cadastrarCurso();
                case 2 -> CursoController.consultarCurso();
                case 3 -> CursoController.removerCurso();
                case 4 -> CursoController.atualizarCurso();
            }
        } while (opcao != 5);
    }
}
