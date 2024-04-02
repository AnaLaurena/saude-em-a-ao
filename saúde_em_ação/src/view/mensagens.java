package view;

import javax.swing.JOptionPane;

public class mensagens {
    public String solicitarEntrada(String mensagem) {
        return JOptionPane.showInputDialog(null, mensagem);
    }

    public void mostrarInformacao(String informacao) {
        JOptionPane.showMessageDialog(null, informacao, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarErro(String erro) {
        JOptionPane.showMessageDialog(null, erro, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public int solicitarConfirmacao(String mensagem) {
        return JOptionPane.showConfirmDialog(null, mensagem, "Confirmar", JOptionPane.YES_NO_OPTION);
    }

    public void mostrarMensagemDeSucesso(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarMensagemDeFalha(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Falha", JOptionPane.WARNING_MESSAGE);
    }
}
