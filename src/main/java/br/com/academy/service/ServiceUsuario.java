package br.com.academy.service;

import br.com.academy.Exceptions.CriptoExistException;
import br.com.academy.Exceptions.EmailExistsException;
import br.com.academy.dao.UsuarioDao;
import br.com.academy.model.Usuario;
import br.com.academy.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class ServiceUsuario {

    @Autowired // Injeta automaticamente a instância do repositório de usuários
    private UsuarioDao repositorioUsuario;

    // Método para salvar um novo usuário no banco
    public void salvarUsuario(Usuario user) throws Exception {

        try {

            // Verifica se já existe um usuário com o mesmo e-mail
            if (repositorioUsuario.findByEmail(user.getEmail()) != null){
                throw new EmailExistsException("Já possui um email cadastrado para: " + user.getEmail());
            }

            // Se não existir, criptografa a senha com MD5 antes de salvar
            user.setSenha(Util.md5(user.getSenha()));

        } catch (NoSuchAlgorithmException e) {
            // Caso ocorra erro na criptografia, lança exceção personalizada
            throw new CriptoExistException("Erro na criptografia da senha");
        }

        // Salva o usuário no banco de dados
        repositorioUsuario.save(user);
    }


}
