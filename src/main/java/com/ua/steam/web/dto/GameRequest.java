package com.ua.steam.web.dto;

import java.math.BigDecimal;

public record GameRequest(String title, String developer, BigDecimal price,
                          Integer releaseYear, String genre,
                          String coverUrl, String description) {
}