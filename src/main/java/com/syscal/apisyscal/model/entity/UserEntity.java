package com.syscal.apisyscal.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String email;

    private String username;

    @JsonIgnore
    private String password;

    private Integer status;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn( name = "rol_id", referencedColumnName = "id")
    private RolEntity rol;

}
