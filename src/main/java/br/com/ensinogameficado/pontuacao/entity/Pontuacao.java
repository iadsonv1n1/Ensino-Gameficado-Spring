package br.com.ensinogameficado.pontuacao.entity;

import br.com.ensinogameficado.turma.entity.Turma;
import br.com.ensinogameficado.usuario.entity.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Pontuacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario aluno;

    @ManyToOne
    private Turma turma;

    private Integer pontos;
}
