package controller;

import view.MenuView;
import view.SubMenuAlunoView;

import java.util.Scanner;

public class SubMenuAlunoController {

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
}
