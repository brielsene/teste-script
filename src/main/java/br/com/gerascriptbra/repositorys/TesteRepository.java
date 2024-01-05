package br.com.gerascriptbra.repositorys;

import br.com.gerascriptbra.models.Teste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TesteRepository extends JpaRepository<Teste, Long> {
}
