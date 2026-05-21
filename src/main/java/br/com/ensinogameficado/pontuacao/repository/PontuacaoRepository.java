package br.com.ensinogameficado.pontuacao.repository;

import br.com.ensinogameficado.pontuacao.entity.Pontuacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PontuacaoRepository extends JpaRepository<Pontuacao, Long> {
}
