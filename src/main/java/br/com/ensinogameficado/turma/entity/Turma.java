package br.com.ensinogameficado.turma.entity;

import br.com.ensinogameficado.usuario.entity.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String codigoAcesso;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Usuario professor;

    @ManyToMany
    private List<Usuario> alunos;
}
