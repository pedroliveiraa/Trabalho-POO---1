package controller;

import view.SubMenuDisciplinaView;

import java.util.Scanner;

public class SubMenuDisciplinaController {
    public static void GerenciaSubDisciplina()
    {
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
}
