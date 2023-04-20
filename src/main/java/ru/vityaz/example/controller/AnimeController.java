package ru.vityaz.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vityaz.example.model.entity.Anime;
import ru.vityaz.example.model.anime.ListDto;
import ru.vityaz.example.repository.AnimeRepository;
import ru.vityaz.example.service.AnimeService;



@RestController
@RequestMapping("/api/anime")
public class AnimeController {


    private final AnimeService animeService;
    private final AnimeRepository animeRepository;

    @Autowired
    public AnimeController(AnimeService animeService, AnimeRepository animeRepository) {
        this.animeService = animeService;
        this.animeRepository = animeRepository;
    }
    @RequestMapping(method= RequestMethod.POST,consumes = "application/json")
    public ResponseEntity<Anime> createAnime(@RequestBody ListDto listDto){
        Anime anime = animeService.createAnime(listDto.getTitle(), listDto.getGenre(), listDto.getFame());
        return ResponseEntity.ok(anime);
    }
    @RequestMapping(method =RequestMethod.PUT,consumes = "application/json")
    public ResponseEntity<Anime> updateAnime(@RequestBody ListDto listDto){
        Anime anime = animeService.updateAnime(listDto.getId(),listDto.getTitle(), listDto.getGenre(), listDto.getFame());
            return ResponseEntity.ok(anime);
        }

    @RequestMapping(value="{id}",method =RequestMethod.GET,consumes = "application/json")
    public ResponseEntity<Anime> getById(@PathVariable Long id) {
        Anime anime = animeService.getAnimeById(id);
        return ResponseEntity.ok(anime);
    }

    @RequestMapping(value = "{id}",method =RequestMethod.DELETE,consumes = "application/json")
    public void deleteAnimeById( @PathVariable Long id){
    animeService.deleteAnimeById(id);
    }

}
