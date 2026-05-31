package rh;

import rh.model.*;
import rh.repository.*;
import rh.service.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FuncionarioRepository funcionarioRepository =
                new FuncionarioRepository();

        UsuarioRepository usuarioRepository =
                new UsuarioRepository();

        PresencaRepository presencaRepository =
                new PresencaRepository();

        FolhaPagamentoRepository folhaRepository =
                new FolhaPagamentoRepository();

        AutenticacaoService authService =
                new AutenticacaoService(usuarioRepository);

        FolhaPagamentoService folhaService =
                new FolhaPagamentoService();

        RelatorioService relatorioService =
                new RelatorioService();

        Cargo dev = Cargo.DESENVOLVEDOR;

        Funcionario funcionario =
                new Funcionario(1, "Karen", "123", dev);

        funcionario.adicionarFalta();
        funcionario.adicionarHorasExtras(10);

        funcionarioRepository.salvar(funcionario);

        Usuario admin = new Usuario(
                1,
                "admin",
                "123",
                NivelAcesso.ADMIN
        );

        usuarioRepository.salvar(admin);

        System.out.println("===== LOGIN =====");

        System.out.print("Login: ");
        String login = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        Usuario usuario = authService.login(login, senha);

        if (usuario == null) {
            System.out.println("Login inválido.");
            return;
        }

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Listar Funcionários");
            System.out.println("2 - Registrar Presença");
            System.out.println("3 - Gerar Folha");
            System.out.println("4 - Relatórios");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    relatorioService.listarFuncionarios(
                            funcionarioRepository.listar()
                    );
                    break;

                case 2:

                    Presenca presenca = new Presenca(
                            1,
                            funcionario,
                            LocalDate.now(),
                            StatusPresenca.PRESENTE,
                            2
                    );

                    presencaRepository.salvar(presenca);

                    System.out.println("Presença registrada.");
                    break;

                case 3:

                    FolhaPagamento folha =
                            folhaService.gerarFolha(1, funcionario);

                    folhaRepository.salvar(folha);

                    System.out.println(folha);
                    break;

                case 4:

                    relatorioService.listarFaltosos(
                            funcionarioRepository.listar()
                    );

                    relatorioService.totalFolha(
                            folhaRepository.listar()
                    );

                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}
