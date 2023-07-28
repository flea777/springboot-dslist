package io.github.flea777.dslist.repositores;

import io.github.flea777.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {


}
