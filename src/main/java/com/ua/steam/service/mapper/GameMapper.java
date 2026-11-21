package com.ua.steam.service.mapper;

import com.ua.steam.domain.Game;
import com.ua.steam.web.dto.GameCardDto;
import com.ua.steam.web.dto.GameDetailDto;
import com.ua.steam.web.dto.GameRequest;
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
    public Game toDomain(GameRequest r) {
        Game g = new Game();
        g.setTitle(r.title());
        g.setDeveloper(r.developer());
        g.setPrice(r.price());
        g.setReleaseYear(r.releaseYear());
        g.setGenre(r.genre());
        g.setCoverUrl(r.coverUrl());
        g.setDescription(r.description());
        return g;
    }
}