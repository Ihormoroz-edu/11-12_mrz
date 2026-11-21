package com.ua.steam.web;

import com.ua.steam.service.GameService;
import com.ua.steam.web.dto.GameCardDto;
import com.ua.steam.web.dto.GameDetailDto;
import com.ua.steam.web.dto.GameRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameCardDto> list(@RequestParam(required = false) String genre) {
        return gameService.findAll(genre);
    }

    @GetMapping("/{id}")
    public GameDetailDto getOne(@PathVariable Long id) {
        return gameService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public GameDetailDto create(@RequestBody GameRequest request) {
        return gameService.create(request);
    }

    @PutMapping("/{id}")
    public GameDetailDto update(@PathVariable Long id, @RequestBody GameRequest request) {
        return gameService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        gameService.delete(id);
        return ResponseEntity.noContent().build();
    }
}