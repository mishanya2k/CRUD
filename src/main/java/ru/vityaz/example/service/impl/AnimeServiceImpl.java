package ru.vityaz.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vityaz.example.model.entity.Anime;
import ru.vityaz.example.repository.AnimeRepository;
import ru.vityaz.example.service.AnimeService;

@Service
public class AnimeServiceImpl implements AnimeService {
    private final AnimeRepository animeRepository;

    @Autowired
    public AnimeServiceImpl(AnimeRepository animeRepository) {
        this.animeRepository = animeRepository;
    }

    @Override
    public Anime createAnime(String title,String genre,int fameOfTen) {
        Anime anime = mapAnime(title, genre, fameOfTen);
        return animeRepository.save(anime);
    }

    @Override
    public Anime updateAnime(Long animeId, String title,String genre, int fame) {
        Anime anime = mapAnime(title,genre,fame);
        anime.setId(animeId);
        return animeRepository.save(anime);
    }

    @Override
    public Anime getAnimeById(Long id) {
        return animeRepository.findById(id).get();
    }

    @Override
    public void deleteAnimeById(Long id) {
        animeRepository.deleteById(id);
    }

    private static Anime mapAnime(String title,String genre,int fame){
        Anime anime = new Anime();
        anime.setTitle(title);
        anime.setGenre(genre);
        anime.setFameOfTen(fame);
        return anime;
    }
}
