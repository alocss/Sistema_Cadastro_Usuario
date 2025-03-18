import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaCadastro sistema = new SistemaCadastro();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Buscar usuário pelo nome");
            System.out.println("3. Listar todos os usuários");
            System.out.println("4. Excluir usuário");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do usuário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o email do usuário: ");
                    String email = scanner.nextLine();
                    System.out.print("Digite a idade do usuário: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha
                    sistema.cadastrarUsuario(nome, email, idade);
                    break;

                case 2:
                    System.out.print("Digite o nome do usuário a ser buscado: ");
                    String nomeBusca = scanner.nextLine();
                    Usuario usuarioEncontrado = sistema.buscarUsuarioPorNome(nomeBusca);
                    if (usuarioEncontrado != null) {
                        System.out.println("Usuário encontrado: " + usuarioEncontrado);
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;

                case 3:
                    sistema.listarUsuarios();
                    break;
                
                case 4:
                    System.out.println("Digite o nome do usuário que deseja excluir: ");
                    String nomeExcluir  = scanner.next();
                    sistema.excluirUsuario(nomeExcluir);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}