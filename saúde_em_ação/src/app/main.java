package app;

import controller.usuariocontroller;
import view.mensagens; 

public class main {

	public static void main (String[] args) {
        mensagens mensagem = new mensagens();
        usuariocontroller controller = new usuariocontroller(); 

        String Nome, Celular, Email, Senha;
        String opcao;
        int opcaoNum;

        do {

            opcao =
                    mensagem.solicitarEntrada("Saúde em Ação"
                            + "\nDigite a opção desejada"
                            + "\n1. Cadastrar Usuário"
                            + "\n2. Sair");

            opcaoNum = Integer.parseInt(opcao);

            switch (opcaoNum) {
                case 1:
                    Nome = mensagem.solicitarEntrada("Digite seu nome");
                    Celular = mensagem.solicitarEntrada("Digite seu Celular");
                    Email = mensagem.solicitarEntrada("Digite seu Email");
                    Senha = mensagem.solicitarEntrada("Digite seu Senha");
                    String mensagemCadastro = controller.criarUsuario(Nome, Email, Celular, Senha);
                    mensagem.mostrarMensagemDeSucesso(mensagemCadastro);
                    break;

                case 2:
                    System.exit(0);
                    break;

            }

        } while (true);

    }
}


