package com.ua.steam.service;

import com.ua.steam.web.dto.GameCardDto;
import com.ua.steam.web.dto.GameDetailDto;
import com.ua.steam.web.dto.GameRequest;

import java.util.List;

public interface GameService {
    List<GameCardDto> findAll(String genre);

    GameDetailDto findById(Long id);

    GameDetailDto create(GameRequest request);

    GameDetailDto update(Long id, GameRequest request);

    void delete(Long id);
}