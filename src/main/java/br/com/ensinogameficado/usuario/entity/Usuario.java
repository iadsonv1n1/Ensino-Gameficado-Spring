package br.com.ensinogameficado.usuario.entity;

import br.com.ensinogameficado.usuario.TipoUsuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;
    private Long matricula;

    @Enumerated(EnumType.STRING)
    private TipoUsuario tipo;
}
