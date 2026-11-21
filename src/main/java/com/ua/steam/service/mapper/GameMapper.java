package com.ua.steam.service.mapper;

import com.ua.steam.domain.Game;
import com.ua.steam.web.dto.GameCardDto;
import com.ua.steam.web.dto.GameDetailDto;
import org.springframework.stereotype.Component;

@Component
public class GameMapper {

    public GameCardDto toCard(Game g) {
        return new GameCardDto(g.getId(), g.getTitle(), g.getDeveloper(),
                g.getPrice(), g.getCoverUrl());
    }

    public GameDetailDto toDetail(Game g) {
        return new GameDetailDto(g.getId(), g.getTitle(), g.getDeveloper(), g.getPrice(),
                g.getReleaseYear(), g.getCoverUrl(), g.getDescription(), g.getGenre());
    }
}