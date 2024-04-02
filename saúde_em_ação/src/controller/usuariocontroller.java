package controller;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.UUID;
import model.usuario;

public class usuariocontroller {
    private ArrayList<usuario> usuarios;

    public usuariocontroller() {
        UUID.randomUUID().toString();
        this.usuarios = new ArrayList<>();
    }

    public String criarUsuario(String nome, String email, String celular, String senha) {
        String senhaHash = gerarHashSenha(senha);
        usuario usuarioNovo = new usuario(nome, email, celular, senhaHash);
        usuarios.add(usuarioNovo);
        return "Usuário cadastrado com sucesso";
    }

    private String gerarHashSenha(String senha) {
        try {
            MessageDigest algorithm = MessageDigest.getInstance("MD5");
            byte[] messageDigest = algorithm.digest(senha.getBytes("UTF-8"));

            
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", b));
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
            
        }
        
    }
    
    
}
        

