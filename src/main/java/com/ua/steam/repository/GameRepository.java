package com.ua.steam.repository;

import com.ua.steam.domain.Game;

import java.util.List;
import java.util.Optional;

public interface GameRepository {
    List<Game> findAll();

    Optional<Game> findById(Long id);

    Game save(Game game);

    List<Game> findByGenre(String genre);

    boolean deleteById(Long id);
}