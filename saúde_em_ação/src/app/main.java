package app;

import controller.usuariocontroller;
import view.mensagens; 

public class main {

	private static final String Saude = null;

	public static void main (String[] args) {
        mensagens mensagem = new mensagens();
        usuariocontroller controller = new usuariocontroller(); 

        String Nome, Celular, Email, Senha,Nickname;
        String opcao;
        int opcaoNum;

        do {

            opcao =
                    mensagem.solicitarEntrada("Saúde em Ação"
                            + "\nDigite a opção desejada"
                            + "\n1. Cadastrar Usuário"
                            +"\n2. login"
                            + "\n3. Sair");

            opcaoNum = Integer.parseInt(opcao);

            switch (opcaoNum) {
                case 1:
                	Nickname = mensagem.solicitarEntrada("Digite seu Nickname");
                    Nome = mensagem.solicitarEntrada("Digite seu nome");
                    Celular = mensagem.solicitarEntrada("Digite seu Celular");
                    Email = mensagem.solicitarEntrada("Digite seu Email");
                    Senha = mensagem.solicitarEntrada("Digite seu Senha");
                    String mensagemCadastro = controller.criarUsuario(Nome, Email, Celular, Senha);
                    mensagem.mostrarMensagemDeSucesso(mensagemCadastro);
                    break;

                case 2: 
                	Nickname = mensagem.solicitarEntrada("Digite seu Nickname");
                	 Email = mensagem.solicitarEntrada("Digite seu Email");
                	 Senha = mensagem.solicitarEntrada("Digite seu Senha");
                
               
                	   break;
                case 3: // Listar Usuários
                    listarusuarios(Saude em Ação);
                    break;
                default:
                    System.exit (0);
            
            
        );
        
        private static void listarusuarios(usuario) {
            StringBuilder usuariosStr = new StringBuilder("Usuários Cadastrados:\n");
            for (Usuario usuario : .getUsuarios()) {
                usuariosStr.append("Nome: ").append(usuario.getNome()).append(", CPF: ").append(usuario.getCpf()).append("\n");
            }
            JOptionPane.showMessageDialog(null, usuariosStr.toString());
        }
     
                case 4:
                    System.exit(0);
                    break;

            } while (true)

    



