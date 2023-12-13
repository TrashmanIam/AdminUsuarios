package com.hexacta.AdminUsuarios.service;

import com.hexacta.AdminUsuarios.dao.UsuarioRepository;
import com.hexacta.AdminUsuarios.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public String guardarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
        return "User saved";
    }


}
