package br.com.ensinogameficado.entrega.repository;

import br.com.ensinogameficado.entrega.entity.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long> {
}
