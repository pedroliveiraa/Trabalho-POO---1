package controller;
import dao.DisciplinaDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Disciplina;

public class DisciplinaController {

    // array para armazenar a disciplina a ser cadastrada
        private static ArrayList<Disciplina> disciplinas = new ArrayList<>();
        // metodo 1-Cadastrar DISCIPLINA
        public static void cadastrardisciplina()
        {
            Scanner scanner =  new Scanner(System.in);


            System.out.print("informe o codigo da disciplina:");
            int codigo = scanner.nextInt();
            //  percorrer a lista e validar se o codigo digitado ja existe
            for (Disciplina disciplina: disciplinas)
            {
                if (disciplina.getCodigodisciplina() == codigo)
                {
                    System.out.println("codigo digitado ja existe!");
                    return; // ira retornar ate que o codigo digitado NÃO exista na lista
                }
            } // quando o codigo for valido, ira para o cadastro da disciplina
            System.out.print("informe o nome da disciplina a ser cadastrada:");
            String nome = scanner.next();


            System.out.print("informe qual sera a carga horaria da disciplina:");
            int cargah = scanner.nextInt();


            Disciplina disciplina = new Disciplina(codigo, nome, cargah);
            DisciplinaDAO.Insert(disciplina); // adicionando na lista
            System.out.println("disciplina cadastrada!");
        }
        // metodo 2-Consultar DISCIPLINA
        public static void consultardisciplina()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("informe o codigo da disciplina a ser consultada:");
            int codigo = scanner.nextInt();

            for (Disciplina disciplina: disciplinas)
            {
                if(disciplina.getCodigodisciplina() == codigo)
                {
                    System.out.println(disciplina);
                    return; // ira retornar ate que o codigo digitado EXISTA
                }
            }
            System.out.println("disciplina não encontrada!");
        }

        // metodo 4-Atualizar DISCIPLINA
        public static void atualizardisciplina()
        {
            Scanner scanner  = new Scanner(System.in);
            System.out.print("informe o codigo da disciplina a ser atualizada:");
            int codigo = scanner.nextInt();

            for (Disciplina disciplina: disciplinas)
            {
                if (disciplina.getCodigodisciplina() == codigo)
                {
                    System.out.print("informe um novo nome:");
                    disciplina.setNomedisciplina(scanner.next());

                    System.out.print("informe qual será a nova carga horaria:");
                    disciplina.setCargahoraria(scanner.nextInt());

                    System.out.println("novos dados da disciplina foram cadastrados!");
                    return;
                }
            }
            System.out.println("disciplina nao encontrada!");
        }

        // metodo 3-Remover DISCIPLINA
        public static void removerdisciplina()
        {
            Scanner scanner  = new Scanner(System.in);
            System.out.print("informe o codigo da disciplina a ser removida:");

            int codigo = scanner.nextInt();

            for (Disciplina disciplina: disciplinas)
            {
                if (disciplina.getCodigodisciplina() == codigo)
                {
                    disciplinas.remove(disciplina);

                System.out.println("disciplina removida!"); // remove disciplina
                return;
            }
            System.out.println("disciplina não encontrada!");
        }

        
        
    }

        // metodo pra mostrar as diciplinas na lista
        public static List<Disciplina> listarDisciplinas() {
        List<Disciplina> disciplinas = DisciplinaDAO.getAll(); // Obtendo as disciplinas da DAO

        if (disciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina cadastrada!");
            return new ArrayList<>();
        }

        System.out.println("Lista de disciplinas cadastradas:");
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina); // Presume que Disciplina possui um método toString()
        }return disciplinas;
    }
    
}