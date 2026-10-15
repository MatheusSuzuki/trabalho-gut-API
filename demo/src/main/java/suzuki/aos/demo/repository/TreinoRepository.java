package suzuki.aos.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import suzuki.aos.demo.model.Treino;

// @Repository marca essa interface como componente de acesso a dados no Spring
@Repository
// Extender JpaRepository já fornece todos os métodos CRUD prontos:
// save(), findById(), findAll(), deleteById(), existsById(), entre outros
// O primeiro tipo genérico é a entidade (Treino), o segundo é o tipo do ID (Long)
public interface TreinoRepository extends JpaRepository<Treino, Long> {

}
