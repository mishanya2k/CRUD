package ru.vityaz.example.service;

import org.springframework.stereotype.Service;
import ru.vityaz.example.model.entity.Anime;


public interface AnimeService {
    Anime createAnime(String title, String genre,int fameOfTen);

    Anime updateAnime(Long animeId, String title,String genre, int fame);

    Anime getAnimeById(Long id);

    void deleteAnimeById(Long id);
}
