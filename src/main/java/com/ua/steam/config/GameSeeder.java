package com.ua.steam.config;

import com.ua.steam.domain.Game;
import com.ua.steam.repository.GameRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class GameSeeder implements ApplicationRunner {

    private final GameRepository repository;

    public GameSeeder(GameRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) {
        repository.save(new Game(null, "The Witcher 3: Wild Hunt", "CD Projekt Red",
                new BigDecimal("39.99"), 2015, "/covers/witcher3.jpg",
                "Рольова гра з відкритим світом про відьмака Геральта.", "RPG"));
        repository.save(new Game(null, "Hades", "Supergiant Games",
                new BigDecimal("24.99"), 2020, "/covers/hades.jpg",
                "Рогалик, у якому син Аїда намагається вибратися з підземного світу.", "Roguelike"));
        repository.save(new Game(null, "Portal 2", "Valve",
                new BigDecimal("9.99"), 2011, "/covers/portal2.jpg",
                "Головоломка від першої особи з порталами та фізикою.", "Puzzle"));
        repository.save(new Game(null, "Stardew Valley", "ConcernedApe",
                new BigDecimal("14.99"), 2016, "/covers/stardew.jpg",
                "Симулятор ферми з рибалкою, шахтами та знайомствами.", "Simulation"));
        repository.save(new Game(null, "Celeste", "Maddy Makes Games",
                new BigDecimal("19.99"), 2018, "/covers/celeste.jpg",
                "Складний платформер про підйом на гору та боротьбу з тривогою.", "Platformer"));
    }
}