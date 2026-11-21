package com.ua.steam.service;

import com.ua.steam.web.dto.GameCardDto;
import com.ua.steam.web.dto.GameDetailDto;

import java.util.List;

public interface GameService {
    List<GameCardDto> findAll();

    GameDetailDto findById(Long id);
}