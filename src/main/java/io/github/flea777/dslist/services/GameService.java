package io.github.flea777.dslist.services;

import io.github.flea777.dslist.dto.GameMinDTO;
import io.github.flea777.dslist.entities.Game;
import io.github.flea777.dslist.repositores.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
