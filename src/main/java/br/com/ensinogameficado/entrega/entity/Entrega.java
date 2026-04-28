package br.com.ensinogameficado.entrega.entity;

import br.com.ensinogameficado.tarefa.entity.Tarefa;
import br.com.ensinogameficado.usuario.entity.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Entrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario aluno;

    @ManyToOne
    private Tarefa tarefa;

    private String resposta;

    private boolean corrgido;
}
