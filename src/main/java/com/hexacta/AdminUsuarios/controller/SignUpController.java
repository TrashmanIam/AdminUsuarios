package com.hexacta.AdminUsuarios.controller;

import com.hexacta.AdminUsuarios.model.Usuario;
import com.hexacta.AdminUsuarios.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sign-up")
public class SignUpController {

    private SignUpService signUpService;

    @RequestMapping(method = RequestMethod.POST)
    public String signUp(@RequestBody Usuario usuario){
        return signUpService.guardarUsuario(usuario);
    }

}
