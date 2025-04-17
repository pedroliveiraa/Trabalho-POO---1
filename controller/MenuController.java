package controller;

import view.MenuView;

import java.util.Scanner;

public class MenuController {

    public static void GerenciaMenu() {

        Scanner scan = new Scanner(System.in);
        int opcao = -1;

        do {
            MenuView.ImprimeMenu();
            System.out.print("Infome uma das opções: ");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1 -> SubMenuAlunoController.GerenciaSubMenuAluno();
                case 2 -> GerenciaSubMenuDisciplina();
                case 3 -> GerenciaSubMenuCurso();
            }
        } while (opcao != 4);

    }



    public static void GerenciaSubMenuDisciplina() {
        // TODO
    }

    public static void GerenciaSubMenuCurso() {
        // TODO
    }
}
