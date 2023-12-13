package com.hexacta.AdminUsuarios.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    private String id;
    private Date Created;
    private Date lastLogin;
    private String Token;
    private boolean isActive;
    private String name;
    private String email;
    private String password;
    private String[] phones;

}