package br.com.fatec.api.project.repository;

import br.com.fatec.api.project.model.Temperatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface TemperaturaRepository extends JpaRepository<Temperatura, String> {
}
