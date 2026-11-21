package com.ua.steam.service;

import com.ua.steam.domain.Game;
import com.ua.steam.exception.GameNotFoundException;
import com.ua.steam.repository.GameRepository;
import com.ua.steam.service.mapper.GameMapper;
import com.ua.steam.web.dto.GameCardDto;
import com.ua.steam.web.dto.GameDetailDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    private final GameRepository repository;
    private final GameMapper mapper;

    public GameServiceImpl(GameRepository repository, GameMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<GameCardDto> findAll() {
        return repository.findAll().stream().map(mapper::toCard).toList();
    }

    @Override
    public GameDetailDto findById(Long id) {
        Game game = repository.findById(id)
                .orElseThrow(() -> new GameNotFoundException(id));
        return mapper.toDetail(game);
    }
}