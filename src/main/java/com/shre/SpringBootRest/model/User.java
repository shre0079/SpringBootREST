package com.shre.SpringBootRest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@Entity
@Table(name="users")
public class User {
    @Id
    private int id;
    @NotNull
    private String username;
    private String password;
}
