package br.com.ensinogameficado.tarefa.entity;

import br.com.ensinogameficado.turma.entity.Turma;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;

    @ManyToOne
    private Turma turma;

    private Integer pontucao;

}
